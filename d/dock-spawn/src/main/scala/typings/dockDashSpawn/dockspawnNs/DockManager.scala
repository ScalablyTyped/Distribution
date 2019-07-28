package typings.dockDashSpawn.dockspawnNs

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
  * It owns an HTMLDivElement inside which all panels are docked.
  * Initially the document manager takes up the central space and acts as the root node.
  */
@JSGlobal("dockspawn.DockManager")
@js.native
class DockManager protected () extends js.Object {
  def this(element: HTMLDivElement) = this()
  var context: DockManagerContext = js.native
  /** Dock the [dialog] below the [referenceNode] node */
  def dockDialogDown(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [dialog] as a tab inside the [referenceNode] node */
  def dockDialogFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
  /** Dock the [dialog] to the left of the [referenceNode] node */
  def dockDialogLeft(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [dialog] to the right of the [referenceNode] node */
  def dockDialogRight(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [dialog] above the [referenceNode] node */
  def dockDialogUp(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [container] below the [referenceNode] node */
  def dockDown(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  /** Dock the [container] as a tab inside the [referenceNode] node */
  def dockFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
  /** Dock the [container] to the left of the [referenceNode] node */
  def dockLeft(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  /** Dock the [container] to the right of the [referenceNode] node */
  def dockRight(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  /** Dock the [container] above the [referenceNode] node */
  def dockUp(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  def initialize(): Unit = js.native
  def invalidate(): Unit = js.native
  def loadState(state: String): Unit = js.native
  def rebuildLayout(node: DockNode): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resumeLayout(): Unit = js.native
  def saveState(): String = js.native
  /**
    * Reset the dock model. This happens when state is loaded from JSON.
    */
  def setModel(model: DockModel): Unit = js.native
  def setRootNode(node: DockNode): Unit = js.native
  def suspendLayout(): Unit = js.native
}

