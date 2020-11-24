package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
  * It owns an HTMLDivElement inside which all panels are docked.
  * Initially the document manager takes up the central space and acts as the root node.
  */
@js.native
trait DockManager extends js.Object {
  
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
  
  @scala.inline
  implicit class DockManagerOps[Self <: DockManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: DockManagerContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockDialogDown(value: (DockNode, Dialog) => DockNode): Self = this.set("dockDialogDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDockDialogFill(value: (DockNode, PanelContainer) => DockNode): Self = this.set("dockDialogFill", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDockDialogLeft(value: (DockNode, Dialog) => DockNode): Self = this.set("dockDialogLeft", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDockDialogRight(value: (DockNode, Dialog) => DockNode): Self = this.set("dockDialogRight", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDockDialogUp(value: (DockNode, Dialog) => DockNode): Self = this.set("dockDialogUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDockDown(value: (DockNode, PanelContainer, Double) => DockNode): Self = this.set("dockDown", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDockFill(value: (DockNode, PanelContainer) => DockNode): Self = this.set("dockFill", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDockLeft(value: (DockNode, PanelContainer, Double) => DockNode): Self = this.set("dockLeft", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDockRight(value: (DockNode, PanelContainer, Double) => DockNode): Self = this.set("dockRight", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDockUp(value: (DockNode, PanelContainer, Double) => DockNode): Self = this.set("dockUp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadState(value: String => Unit): Self = this.set("loadState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRebuildLayout(value: DockNode => Unit): Self = this.set("rebuildLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResize(value: (Double, Double) => Unit): Self = this.set("resize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResumeLayout(value: () => Unit): Self = this.set("resumeLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveState(value: () => String): Self = this.set("saveState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetModel(value: DockModel => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootNode(value: DockNode => Unit): Self = this.set("setRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendLayout(value: () => Unit): Self = this.set("suspendLayout", js.Any.fromFunction0(value))
  }
}
