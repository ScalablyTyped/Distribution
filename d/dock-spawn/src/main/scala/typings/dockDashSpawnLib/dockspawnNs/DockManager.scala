package typings
package dockDashSpawnLib.dockspawnNs

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
  def this(element: stdLib.HTMLDivElement) = this()
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
  def dockDown(referenceNode: DockNode, container: PanelContainer, ratio: scala.Double): DockNode = js.native
  /** Dock the [container] as a tab inside the [referenceNode] node */
  def dockFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
  /** Dock the [container] to the left of the [referenceNode] node */
  def dockLeft(referenceNode: DockNode, container: PanelContainer, ratio: scala.Double): DockNode = js.native
  /** Dock the [container] to the right of the [referenceNode] node */
  def dockRight(referenceNode: DockNode, container: PanelContainer, ratio: scala.Double): DockNode = js.native
  /** Dock the [container] above the [referenceNode] node */
  def dockUp(referenceNode: DockNode, container: PanelContainer, ratio: scala.Double): DockNode = js.native
  def initialize(): scala.Unit = js.native
  def invalidate(): scala.Unit = js.native
  def loadState(state: java.lang.String): scala.Unit = js.native
  def rebuildLayout(node: DockNode): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def resumeLayout(): scala.Unit = js.native
  def saveState(): java.lang.String = js.native
  /**
           * Reset the dock model. This happens when state is loaded from JSON.
           */
  def setModel(model: DockModel): scala.Unit = js.native
  def setRootNode(node: DockNode): scala.Unit = js.native
  def suspendLayout(): scala.Unit = js.native
}

