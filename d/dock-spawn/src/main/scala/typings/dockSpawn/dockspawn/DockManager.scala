package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
  * It owns an HTMLDivElement inside which all panels are docked.
  * Initially the document manager takes up the central space and acts as the root node.
  */
trait DockManager extends js.Object {
  var context: DockManagerContext
  /** Dock the [dialog] below the [referenceNode] node */
  def dockDialogDown(referenceNode: DockNode, dialog: Dialog): DockNode
  /** Dock the [dialog] as a tab inside the [referenceNode] node */
  def dockDialogFill(referenceNode: DockNode, container: PanelContainer): DockNode
  /** Dock the [dialog] to the left of the [referenceNode] node */
  def dockDialogLeft(referenceNode: DockNode, dialog: Dialog): DockNode
  /** Dock the [dialog] to the right of the [referenceNode] node */
  def dockDialogRight(referenceNode: DockNode, dialog: Dialog): DockNode
  /** Dock the [dialog] above the [referenceNode] node */
  def dockDialogUp(referenceNode: DockNode, dialog: Dialog): DockNode
  /** Dock the [container] below the [referenceNode] node */
  def dockDown(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
  /** Dock the [container] as a tab inside the [referenceNode] node */
  def dockFill(referenceNode: DockNode, container: PanelContainer): DockNode
  /** Dock the [container] to the left of the [referenceNode] node */
  def dockLeft(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
  /** Dock the [container] to the right of the [referenceNode] node */
  def dockRight(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
  /** Dock the [container] above the [referenceNode] node */
  def dockUp(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
  def initialize(): Unit
  def invalidate(): Unit
  def loadState(state: String): Unit
  def rebuildLayout(node: DockNode): Unit
  def resize(width: Double, height: Double): Unit
  def resumeLayout(): Unit
  def saveState(): String
  /**
    * Reset the dock model. This happens when state is loaded from JSON.
    */
  def setModel(model: DockModel): Unit
  def setRootNode(node: DockNode): Unit
  def suspendLayout(): Unit
}

object DockManager {
  @scala.inline
  def apply(
    context: DockManagerContext,
    dockDialogDown: (DockNode, Dialog) => DockNode,
    dockDialogFill: (DockNode, PanelContainer) => DockNode,
    dockDialogLeft: (DockNode, Dialog) => DockNode,
    dockDialogRight: (DockNode, Dialog) => DockNode,
    dockDialogUp: (DockNode, Dialog) => DockNode,
    dockDown: (DockNode, PanelContainer, Double) => DockNode,
    dockFill: (DockNode, PanelContainer) => DockNode,
    dockLeft: (DockNode, PanelContainer, Double) => DockNode,
    dockRight: (DockNode, PanelContainer, Double) => DockNode,
    dockUp: (DockNode, PanelContainer, Double) => DockNode,
    initialize: () => Unit,
    invalidate: () => Unit,
    loadState: String => Unit,
    rebuildLayout: DockNode => Unit,
    resize: (Double, Double) => Unit,
    resumeLayout: () => Unit,
    saveState: () => String,
    setModel: DockModel => Unit,
    setRootNode: DockNode => Unit,
    suspendLayout: () => Unit
  ): DockManager = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], dockDialogDown = js.Any.fromFunction2(dockDialogDown), dockDialogFill = js.Any.fromFunction2(dockDialogFill), dockDialogLeft = js.Any.fromFunction2(dockDialogLeft), dockDialogRight = js.Any.fromFunction2(dockDialogRight), dockDialogUp = js.Any.fromFunction2(dockDialogUp), dockDown = js.Any.fromFunction3(dockDown), dockFill = js.Any.fromFunction2(dockFill), dockLeft = js.Any.fromFunction3(dockLeft), dockRight = js.Any.fromFunction3(dockRight), dockUp = js.Any.fromFunction3(dockUp), initialize = js.Any.fromFunction0(initialize), invalidate = js.Any.fromFunction0(invalidate), loadState = js.Any.fromFunction1(loadState), rebuildLayout = js.Any.fromFunction1(rebuildLayout), resize = js.Any.fromFunction2(resize), resumeLayout = js.Any.fromFunction0(resumeLayout), saveState = js.Any.fromFunction0(saveState), setModel = js.Any.fromFunction1(setModel), setRootNode = js.Any.fromFunction1(setRootNode), suspendLayout = js.Any.fromFunction0(suspendLayout))
    __obj.asInstanceOf[DockManager]
  }
}

