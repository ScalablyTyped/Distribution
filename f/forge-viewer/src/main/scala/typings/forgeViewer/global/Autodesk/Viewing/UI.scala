package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.UI.ControlOptions
import typings.forgeViewer.Autodesk.Viewing.UI.DockingPanelOptions
import typings.forgeViewer.Autodesk.Viewing.UI.MenuItem
import typings.forgeViewer.forgeViewerStrings.ButtonDotStateChanged
import typings.forgeViewer.forgeViewerStrings.ControlDotCollapsedChanged
import typings.forgeViewer.forgeViewerStrings.ControlDotVisibilityChanged
import typings.forgeViewer.forgeViewerStrings.RadioButtonGroupDotActiveButtonChanged
import typings.forgeViewer.forgeViewerStrings.click
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UI {
  
  @JSGlobal("Autodesk.Viewing.UI.Button")
  @js.native
  open class Button protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.Button {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  // NOTE: TypeScript doesn't support enum inside class. This seems to be commonly used workaround.
  object Button {
    
    @JSGlobal("Autodesk.Viewing.UI.Button.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.UI.Button.State & Double] = js.native
      
      /* 0 */ val ACTIVE: typings.forgeViewer.Autodesk.Viewing.UI.Button.State.ACTIVE & Double = js.native
      
      /* 2 */ val DISABLED: typings.forgeViewer.Autodesk.Viewing.UI.Button.State.DISABLED & Double = js.native
      
      /* 1 */ val INACTIVE: typings.forgeViewer.Autodesk.Viewing.UI.Button.State.INACTIVE & Double = js.native
    }
  }
  
  @JSGlobal("Autodesk.Viewing.UI.COLLAPSED_CHANGED")
  @js.native
  val COLLAPSED_CHANGED: /* "Control.CollapsedChanged" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.CONTROL_ADDED")
  @js.native
  val CONTROL_ADDED: /* "ControlGroup.ControlAdded" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.CONTROL_REMOVED")
  @js.native
  val CONTROL_REMOVED: /* "ControlGroup.ControlRemoved" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.ComboButton")
  @js.native
  open class ComboButton protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ComboButton {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.Control")
  @js.native
  open class Control ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.Control {
    def this(id: String) = this()
    def this(id: String, options: ControlOptions) = this()
    def this(id: Unit, options: ControlOptions) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ControlEventArgs")
  @js.native
  open class ControlEventArgs ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ControlEventArgs {
    
    /* CompleteClass */
    var ACTIVE_BUTTON_CHANGED: RadioButtonGroupDotActiveButtonChanged = js.native
    
    /* CompleteClass */
    var CLICK: click = js.native
    
    /* CompleteClass */
    var COLLAPSED_CHANGED: ControlDotCollapsedChanged = js.native
    
    /* CompleteClass */
    var STATE_CHANGED: ButtonDotStateChanged = js.native
    
    /* CompleteClass */
    var VISIBILITY_CHANGED: ControlDotVisibilityChanged = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ControlGroup")
  @js.native
  open class ControlGroup ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ControlGroup
  
  @JSGlobal("Autodesk.Viewing.UI.DockingPanel")
  @js.native
  open class DockingPanel protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.DockingPanel {
    def this(parentContainer: HTMLElement, id: String, title: String) = this()
    def this(parentContainer: HTMLElement, id: String, title: String, options: DockingPanelOptions) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.LayersPanel")
  @js.native
  open class LayersPanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.LayersPanel
  
  @JSGlobal("Autodesk.Viewing.UI.ModelStructurePanel")
  @js.native
  open class ModelStructurePanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ModelStructurePanel
  
  @JSGlobal("Autodesk.Viewing.UI.ObjectContextMenu")
  @js.native
  open class ObjectContextMenu protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ObjectContextMenu {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
    
    /* CompleteClass */
    override def buildMenu(event: Event, status: js.Object): js.Array[MenuItem] = js.native
    
    /* CompleteClass */
    override def hide(): Boolean = js.native
    
    /* CompleteClass */
    override def show(event: Event): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.PropertyPanel")
  @js.native
  open class PropertyPanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.PropertyPanel
  
  @JSGlobal("Autodesk.Viewing.UI.RadioButtonGroup")
  @js.native
  open class RadioButtonGroup protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.RadioButtonGroup {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.SIZE_CHANGED")
  @js.native
  val SIZE_CHANGED: /* "ControlGroup.SizeChanged" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.STATE_CHANGED")
  @js.native
  val STATE_CHANGED: /* "Button.StateChanged" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.SettingsPanel")
  @js.native
  open class SettingsPanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.SettingsPanel
  
  @JSGlobal("Autodesk.Viewing.UI.ToolBar")
  @js.native
  open class ToolBar protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ControlGroup {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.Tree")
  @js.native
  open class Tree protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.Tree {
    def this(
      delegate: typings.forgeViewer.Autodesk.Viewing.UI.TreeDelegate,
      root: js.Object,
      parentContainer: String
    ) = this()
    def this(
      delegate: typings.forgeViewer.Autodesk.Viewing.UI.TreeDelegate,
      root: js.Object,
      parentContainer: HTMLElement
    ) = this()
    def this(
      delegate: typings.forgeViewer.Autodesk.Viewing.UI.TreeDelegate,
      root: js.Object,
      parentContainer: String,
      options: js.Object
    ) = this()
    def this(
      delegate: typings.forgeViewer.Autodesk.Viewing.UI.TreeDelegate,
      root: js.Object,
      parentContainer: HTMLElement,
      options: js.Object
    ) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.TreeDelegate")
  @js.native
  open class TreeDelegate ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.TreeDelegate {
    
    /* CompleteClass */
    override def createTreeNode(node: js.Object, parent: HTMLElement, options: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def forEachChild(node: js.Object, callback: js.Function1[/* child */ js.Object, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getTreeNodeClass(node: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def getTreeNodeId(node: js.Object): String = js.native
    
    /* CompleteClass */
    override def getTreeNodeLabel(node: js.Object): String = js.native
    
    /* CompleteClass */
    override def isTreeNodeGroup(node: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def onTreeNodeClick(tree: typings.forgeViewer.Autodesk.Viewing.UI.Tree, node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTreeNodeDoubleClick(tree: typings.forgeViewer.Autodesk.Viewing.UI.Tree, node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTreeNodeIconClick(tree: typings.forgeViewer.Autodesk.Viewing.UI.Tree, node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTreeNodeRightClick(tree: typings.forgeViewer.Autodesk.Viewing.UI.Tree, node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def shouldCreateTreeNode(node: js.Object): Boolean = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.VISIBILITY_CHANGED")
  @js.native
  val VISIBILITY_CHANGED: /* "Control.VisibilityChanged" */ String = js.native
}
