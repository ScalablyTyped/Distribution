package typings.extjs.global.Ext

import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IComponentLoader
import typings.extjs.Ext.IEventObject
import typings.extjs.Ext.ILoadMask
import typings.extjs.Ext.IZIndexManager
import typings.extjs.Ext.container.IAbstractContainer
import typings.extjs.Ext.dom.IElement
import typings.extjs.Ext.layout.container.IContainer
import typings.extjs.Ext.panel.IPanel
import typings.extjs.Ext.util.IAbstractMixedCollection
import typings.extjs.Ext.util.IComponentDragger
import typings.extjs.Ext.util.IPositionable
import typings.extjs.Ext.util.IRegion
import typings.extjs.Ext.window.IMessageBox
import typings.extjs.Ext.window.IWindow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.MessageBox")
@js.native
open class MessageBox ()
  extends StObject
     with typings.extjs.Ext.MessageBox
/* static members */
object MessageBox {
  
  @JSGlobal("Ext.MessageBox")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.CANCEL")
  @js.native
  def CANCEL: Double = js.native
  inline def CANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.MessageBox.ERROR")
  @js.native
  def ERROR: java.lang.String = js.native
  inline def ERROR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.MessageBox.INFO")
  @js.native
  def INFO: java.lang.String = js.native
  inline def INFO_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.NO")
  @js.native
  def NO: Double = js.native
  inline def NO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO")(x.asInstanceOf[js.Any])
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.OK")
  @js.native
  def OK: Double = js.native
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.OKCANCEL")
  @js.native
  def OKCANCEL: Double = js.native
  inline def OKCANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OKCANCEL")(x.asInstanceOf[js.Any])
  
  inline def OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.MessageBox.QUESTION")
  @js.native
  def QUESTION: java.lang.String = js.native
  inline def QUESTION_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUESTION")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.MessageBox.WARNING")
  @js.native
  def WARNING: java.lang.String = js.native
  inline def WARNING_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.YES")
  @js.native
  def YES: Double = js.native
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.YESNO")
  @js.native
  def YESNO: Double = js.native
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.YESNOCANCEL")
  @js.native
  def YESNOCANCEL: Double = js.native
  inline def YESNOCANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YESNOCANCEL")(x.asInstanceOf[js.Any])
  
  inline def YESNO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YESNO")(x.asInstanceOf[js.Any])
  
  inline def YES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YES")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox._isLayoutRoot")
  @js.native
  def _isLayoutRoot: Boolean = js.native
  inline def _isLayoutRoot_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isLayoutRoot")(x.asInstanceOf[js.Any])
  
  /** [Method] Adds Component s to this Container
    * @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
    * @returns Ext.Component[]/Ext.Component The Components that were added.
    */
  inline def add(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Any]
  inline def add(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Adds a CSS class to the body element
    * @param cls String The class to add
    * @returns Ext.panel.Panel this
    */
  inline def addBodyCls(): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("addBodyCls")().asInstanceOf[IPanel]
  inline def addBodyCls(cls: java.lang.String): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("addBodyCls")(cls.asInstanceOf[js.Any]).asInstanceOf[IPanel]
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  inline def addChildEls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChildEls")().asInstanceOf[Unit]
  
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  inline def addClass(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("addClass")().asInstanceOf[IComponent]
  inline def addClass(cls: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(cls.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  inline def addCls(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("addCls")().asInstanceOf[IComponent]
  inline def addCls(cls: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Adds a cls to the uiCls array which will also call addUIClsToElement and adds to all elements of this component
    * @param classes String/String[] A string or an array of strings to add to the uiCls.
    * @param skip Object (Boolean) skip true to skip adding it to the class and do it later (via the return).
    */
  inline def addClsWithUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClsWithUI")().asInstanceOf[Unit]
  inline def addClsWithUI(classes: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClsWithUI")(classes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addClsWithUI(classes: Any, skip: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClsWithUI")(classes.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addClsWithUI(classes: Unit, skip: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClsWithUI")(classes.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds docked item s to the container
    * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
    * @param pos Number The index at which the Component will be added
    * @returns Ext.Component[] The added components.
    */
  inline def addDocked(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("addDocked")().asInstanceOf[typings.extjs.Ext.Array]
  inline def addDocked(component: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("addDocked")(component.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def addDocked(component: Any, pos: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("addDocked")(component.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def addDocked(component: Unit, pos: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("addDocked")(component.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
  inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Appends an event handler to this object
    * @param element Object
    * @param listeners Object
    * @param scope Object
    * @param options Object
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  inline def addListener(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Any]
  inline def addListener(element: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Any, listeners: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(element: Unit, listeners: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(element.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  inline def addManagedListener(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Any]
  inline def addManagedListener(item: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Any, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Any, ename: Unit, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Any, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Save a property to the given state object if it is not its default or configured value
    * @param state Object The state object.
    * @param propName String The name of the property on this object to save.
    * @param value String The value of the state property (defaults to this[propName]).
    * @returns Boolean The state object or a new object if state was null and the property was saved.
    */
  inline def addPropertyToState(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")().asInstanceOf[Boolean]
  inline def addPropertyToState(state: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def addPropertyToState(state: Any, propName: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addPropertyToState(state: Any, propName: java.lang.String, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addPropertyToState(state: Any, propName: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addPropertyToState(state: Unit, propName: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addPropertyToState(state: Unit, propName: java.lang.String, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addPropertyToState(state: Unit, propName: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToState")(state.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Add events that will trigger the state to be saved
    * @param events String/String[] The event name or an array of event names.
    */
  inline def addStateEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStateEvents")().asInstanceOf[Unit]
  inline def addStateEvents(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStateEvents")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Add tools to this panel
    * @param tools Object[]/Ext.panel.Tool[] The tools to add
    */
  inline def addTool(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTool")().asInstanceOf[Unit]
  inline def addTool(tools: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTool")(tools.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] inherit docs
    * @param cls Object
    */
  inline def addUIClsToElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUIClsToElement")().asInstanceOf[Unit]
  inline def addUIClsToElement(cls: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUIClsToElement")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Invoked after the Panel is Collapsed  */
  inline def afterCollapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterCollapse")().asInstanceOf[Unit]
  
  /** [Method] Called by the layout system after the Component has been laid out  */
  inline def afterComponentLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterComponentLayout")().asInstanceOf[Unit]
  
  /** [Method] Invoked after the Panel is Expanded  */
  inline def afterExpand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterExpand")().asInstanceOf[Unit]
  
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
    * @param layout Ext.layout.container.Container
    */
  inline def afterLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLayout")().asInstanceOf[Unit]
  inline def afterLayout(layout: IContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Template method called after a Component has been positioned
    * @param ax Object
    * @param ay Object
    */
  inline def afterSetPosition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSetPosition")().asInstanceOf[Unit]
  inline def afterSetPosition(ax: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSetPosition")(ax.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterSetPosition(ax: Any, ay: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSetPosition")(ax.asInstanceOf[js.Any], ay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSetPosition(ax: Unit, ay: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSetPosition")(ax.asInstanceOf[js.Any], ay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Invoked after the Component is shown after onShow is called
    * @param animateTarget String/Ext.Element
    * @param callback Function
    * @param scope Object
    */
  inline def afterShow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")().asInstanceOf[Unit]
  inline def afterShow(animateTarget: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterShow(animateTarget: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterShow(animateTarget: Any, callback: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterShow(animateTarget: Any, callback: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterShow(animateTarget: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterShow(animateTarget: Unit, callback: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterShow(animateTarget: Unit, callback: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterShow")(animateTarget.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @returns Ext.window.MessageBox this
    */
  inline def alert(): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")().asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: java.lang.String, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: java.lang.String, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: java.lang.String, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: Unit, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: Unit, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: java.lang.String, msg: Unit, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: java.lang.String, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: java.lang.String, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: java.lang.String, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: Unit, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: Unit, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def alert(title: Unit, msg: Unit, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  /** [Method] Aligns the element with another element relative to the specified anchor points
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  inline def alignTo(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")().asInstanceOf[IPositionable]
  inline def alignTo(element: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: java.lang.String): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: java.lang.String, offsets: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: java.lang.String, offsets: typings.extjs.Ext.Array): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: java.lang.String, offsets: typings.extjs.Ext.Array, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: Unit, offsets: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: Unit, offsets: typings.extjs.Ext.Array): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Any, position: Unit, offsets: typings.extjs.Ext.Array, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: java.lang.String): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: java.lang.String, offsets: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: java.lang.String, offsets: typings.extjs.Ext.Array): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: java.lang.String, offsets: typings.extjs.Ext.Array, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: Unit, offsets: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: Unit, offsets: typings.extjs.Ext.Array): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def alignTo(element: Unit, position: Unit, offsets: typings.extjs.Ext.Array, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("alignTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Anchors an element to another element and realigns it when the window is resized
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
    * @param callback Function The function to call after the animation finishes
    * @returns Ext.util.Positionable this
    */
  inline def anchorTo(
    element: js.UndefOr[Any],
    position: js.UndefOr[java.lang.String],
    offsets: js.UndefOr[typings.extjs.Ext.Array],
    animate: js.UndefOr[Any],
    monitorScroll: js.UndefOr[Any],
    callback: js.UndefOr[Any]
  ): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("anchorTo")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], animate.asInstanceOf[js.Any], monitorScroll.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Performs custom animation on this object
    * @param animObj Object
    * @returns Object this
    */
  inline def animate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")().asInstanceOf[Any]
  inline def animate(animObj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(animObj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Applies the state to the object
    * @param state Object
    */
  inline def applyState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyState")().asInstanceOf[Unit]
  inline def applyState(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyState")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Template method to do any pre blur processing
    * @param e Ext.EventObject The event object
    */
  inline def beforeBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeBlur")().asInstanceOf[Unit]
  inline def beforeBlur(e: IEventObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeBlur")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Occurs before componentLayout is run
    * @param adjWidth Number The box-adjusted width that was set.
    * @param adjHeight Number The box-adjusted height that was set.
    */
  inline def beforeComponentLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeComponentLayout")().asInstanceOf[Unit]
  inline def beforeComponentLayout(adjWidth: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeComponentLayout")(adjWidth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeComponentLayout(adjWidth: Double, adjHeight: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeComponentLayout")(adjWidth.asInstanceOf[js.Any], adjHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeComponentLayout(adjWidth: Unit, adjHeight: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeComponentLayout")(adjWidth.asInstanceOf[js.Any], adjHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Template method to do any pre focus processing
    * @param e Ext.EventObject The event object
    */
  inline def beforeFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFocus")().asInstanceOf[Unit]
  inline def beforeFocus(e: IEventObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFocus")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Occurs before componentLayout is run  */
  inline def beforeLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLayout")().asInstanceOf[Unit]
  
  /** [Method] Invoked before the Component is shown  */
  inline def beforeShow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeShow")().asInstanceOf[Unit]
  
  /** [Property] (Ext.dom.Element) */
  @JSGlobal("Ext.MessageBox.body")
  @js.native
  def body: IElement = js.native
  inline def body_=(x: IElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("body")(x.asInstanceOf[js.Any])
  
  /** [Method] Bubbles up the component container heirarchy calling the specified function with each component
    * @param fn Function The function to call
    * @param scope Object The scope of the function. Defaults to current node.
    * @param args Array The args to call the function with. Defaults to passing the current component.
    * @returns Ext.Component this
    */
  inline def bubble(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("bubble")().asInstanceOf[IComponent]
  inline def bubble(fn: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def bubble(fn: Any, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def bubble(fn: Any, scope: Any, args: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def bubble(fn: Any, scope: Unit, args: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def bubble(fn: Unit, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def bubble(fn: Unit, scope: Any, args: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def bubble(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.MessageBox.buttonText")
  @js.native
  def buttonText: Any = js.native
  inline def buttonText_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(x.asInstanceOf[js.Any])
  
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
    * @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
    * @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
    * @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
    */
  inline def calculateConstrainedPosition(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")().asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Any, proposedPosition: Unit, local: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Any, proposedPosition: Unit, local: Boolean, proposedSize: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Any, proposedPosition: Unit, local: Unit, proposedSize: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Any, proposedPosition: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Any, proposedPosition: typings.extjs.Ext.Array, local: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(
    constrainTo: Any,
    proposedPosition: typings.extjs.Ext.Array,
    local: Boolean,
    proposedSize: typings.extjs.Ext.Array
  ): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(
    constrainTo: Any,
    proposedPosition: typings.extjs.Ext.Array,
    local: Unit,
    proposedSize: typings.extjs.Ext.Array
  ): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Unit, proposedPosition: Unit, local: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Unit, proposedPosition: Unit, local: Boolean, proposedSize: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Unit, proposedPosition: Unit, local: Unit, proposedSize: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Unit, proposedPosition: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(constrainTo: Unit, proposedPosition: typings.extjs.Ext.Array, local: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(
    constrainTo: Unit,
    proposedPosition: typings.extjs.Ext.Array,
    local: Boolean,
    proposedSize: typings.extjs.Ext.Array
  ): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def calculateConstrainedPosition(
    constrainTo: Unit,
    proposedPosition: typings.extjs.Ext.Array,
    local: Unit,
    proposedSize: typings.extjs.Ext.Array
  ): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateConstrainedPosition")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], local.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
  inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
  inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
  inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Cancel any deferred focus on this component */
  inline def cancelFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFocus")().asInstanceOf[Unit]
  
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
    * @param fn Function The function to call
    * @param scope Object The scope of the function (defaults to current component)
    * @param args Array The args to call the function with. The current component always passed as the last argument.
    * @returns Ext.Container this
    */
  inline def cascade(): typings.extjs.Ext.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("cascade")().asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Any): typings.extjs.Ext.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Any, scope: Any): typings.extjs.Ext.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Any, scope: Any, args: typings.extjs.Ext.Array): typings.extjs.Ext.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Any, scope: Unit, args: typings.extjs.Ext.Array): typings.extjs.Ext.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Unit, scope: Any): typings.extjs.Ext.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Unit, scope: Any, args: typings.extjs.Ext.Array): typings.extjs.Ext.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.IContainer]
  inline def cascade(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array): typings.extjs.Ext.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("cascade")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.IContainer]
  
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  inline def center(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("center")().asInstanceOf[IComponent]
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  inline def child(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("child")().asInstanceOf[Any]
  inline def child(selector: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("child")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
  
  /** [Method] Removes all managed listeners for this object  */
  inline def clearManagedListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearManagedListeners")().asInstanceOf[Unit]
  
  /** [Method] Clone the current component using the original config values passed into this instance by default
    * @param overrides Object A new config containing any properties to override in the cloned version. An id property can be passed on this object, otherwise one will be generated to avoid duplicates.
    * @returns Ext.Component clone The cloned copy of this component
    */
  inline def cloneConfig(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneConfig")().asInstanceOf[IComponent]
  inline def cloneConfig(overrides: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneConfig")(overrides.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Closes the Panel  */
  inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  /** [Method] Collapses the panel body so that the body becomes hidden
    * @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  inline def collapse(): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("collapse")().asInstanceOf[IPanel]
  inline def collapse(direction: java.lang.String): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(direction.asInstanceOf[js.Any]).asInstanceOf[IPanel]
  inline def collapse(direction: java.lang.String, animate: Boolean): IPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(direction.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPanel]
  inline def collapse(direction: Unit, animate: Boolean): IPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(direction.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPanel]
  
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @returns Ext.window.MessageBox this
    */
  inline def confirm(): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")().asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: java.lang.String, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: java.lang.String, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: java.lang.String, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: Unit, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: Unit, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: java.lang.String, msg: Unit, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: java.lang.String, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: java.lang.String, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: java.lang.String, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: Unit, fn: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: Unit, fn: Any, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def confirm(title: Unit, msg: Unit, fn: Unit, scope: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
    * @param comp Ext.Component The Component to test.
    * @param deep Boolean Pass true to test for the Component being a descendant at any level.
    * @returns Boolean true if the passed Component is contained at the specified level.
    */
  inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
  inline def contains(comp: Unit, deep: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(comp.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(comp: IComponent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(comp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def contains(comp: IComponent, deep: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(comp.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Property] (String) */
  @JSGlobal("Ext.MessageBox.contentPaddingProperty")
  @js.native
  def contentPaddingProperty: java.lang.String = js.native
  inline def contentPaddingProperty_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentPaddingProperty")(x.asInstanceOf[js.Any])
  
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
    * @param collapseDir Object
    */
  inline def convertCollapseDir(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCollapseDir")().asInstanceOf[Unit]
  inline def convertCollapseDir(collapseDir: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCollapseDir")(collapseDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Ext.util.ComponentDragger) */
  @JSGlobal("Ext.MessageBox.dd")
  @js.native
  def dd: IComponentDragger = js.native
  inline def dd_=(x: IComponentDragger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dd")(x.asInstanceOf[js.Any])
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.defaultTextHeight")
  @js.native
  def defaultTextHeight: Double = js.native
  inline def defaultTextHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTextHeight")(x.asInstanceOf[js.Any])
  
  /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
    * @returns Ext.container.AbstractContainer this
    */
  inline def disable(): IAbstractContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[IAbstractContainer]
  
  /** [Method] Handles autoRender  */
  inline def doAutoRender(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doAutoRender")().asInstanceOf[Unit]
  
  /** [Method] This method needs to be called whenever you change something on this component that requires the Component s layout t
    * @returns Ext.container.Container this
    */
  inline def doComponentLayout(): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("doComponentLayout")().asInstanceOf[typings.extjs.Ext.container.IContainer]
  
  /** [Method] Moves this floating Component into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
    */
  inline def doConstrain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doConstrain")().asInstanceOf[Unit]
  inline def doConstrain(constrainTo: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doConstrain")(constrainTo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Manually force this container s layout to be recalculated
    * @returns Ext.container.Container this
    */
  inline def doLayout(): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("doLayout")().asInstanceOf[typings.extjs.Ext.container.IContainer]
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  inline def down(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[Any]
  inline def down(selector: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.draggable")
  @js.native
  def draggable: Boolean = js.native
  inline def draggable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
  inline def enableBubble(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Ensures that this component is attached to document body
    * @param runLayout Boolean True to run the component's layout.
    */
  inline def ensureAttachedToBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureAttachedToBody")().asInstanceOf[Unit]
  inline def ensureAttachedToBody(runLayout: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureAttachedToBody")(runLayout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Expands the panel body so that it becomes visible
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  inline def expand(): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")().asInstanceOf[IPanel]
  inline def expand(animate: Boolean): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(animate.asInstanceOf[js.Any]).asInstanceOf[IPanel]
  
  /** [Method] Find a container above this component at any level by a custom function
    * @param fn Function The custom function to call with the arguments (container, this component).
    * @returns Ext.container.Container The first Container for which the custom function returns true
    */
  inline def findParentBy(): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("findParentBy")().asInstanceOf[typings.extjs.Ext.container.IContainer]
  inline def findParentBy(fn: Any): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("findParentBy")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.container.IContainer]
  
  /** [Method] Find a container above this component at any level by xtype or class See also the up method
    * @param xtype String/Ext.Class The xtype string for a component, or the class of the component directly
    * @returns Ext.container.Container The first Container which matches the given xtype or class
    */
  inline def findParentByType(): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("findParentByType")().asInstanceOf[typings.extjs.Ext.container.IContainer]
  inline def findParentByType(xtype: Any): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("findParentByType")(xtype.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.container.IContainer]
  
  /** [Method] Retrieves plugin from this component s collection by its ptype
    * @param ptype String The Plugin's ptype as specified by the class's alias configuration.
    * @returns Ext.AbstractPlugin plugin instance.
    */
  inline def findPlugin(): IAbstractPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlugin")().asInstanceOf[IAbstractPlugin]
  inline def findPlugin(ptype: java.lang.String): IAbstractPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlugin")(ptype.asInstanceOf[js.Any]).asInstanceOf[IAbstractPlugin]
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(scala.List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  inline def fireEventArgs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")().asInstanceOf[Boolean]
  inline def fireEventArgs(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fireEventArgs(eventName: Unit, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Property] (Ext.Container) */
  @JSGlobal("Ext.MessageBox.floatParent")
  @js.native
  def floatParent: typings.extjs.Ext.IContainer = js.native
  inline def floatParent_=(x: typings.extjs.Ext.IContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("floatParent")(x.asInstanceOf[js.Any])
  
  /** [Method] Try to focus this component
    * @param selectText Boolean If applicable, true to also select the text in this component
    * @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds).
    * @param callback Function Only needed if the delay parameter is used. A function to call upon focus.
    * @param scope Function Only needed if the delay parameter is used. The scope (this reference) in which to execute the callback.
    * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
    */
  inline def focus(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")().asInstanceOf[IComponent]
  inline def focus(selectText: Boolean): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Any, callback: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Any, callback: Any, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Any, callback: Unit, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Unit, callback: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Unit, callback: Any, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Boolean, delay: Unit, callback: Unit, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Any, callback: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Any, callback: Any, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Any, callback: Unit, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Unit, callback: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Unit, callback: Any, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def focus(selectText: Unit, delay: Unit, callback: Unit, scope: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(selectText.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Forces this component to redo its componentLayout  */
  inline def forceComponentLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceComponentLayout")().asInstanceOf[Unit]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.MessageBox.frameSize")
  @js.native
  def frameSize: Any = js.native
  inline def frameSize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameSize")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  inline def getActiveAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveAnimation")().asInstanceOf[Any]
  
  /** [Method] Gets the x y coordinates to align this element with another element
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @returns Number[] [x, y]
    */
  inline def getAlignToXY(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Any, position: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Any, position: java.lang.String, offsets: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Any, position: Unit, offsets: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Unit, position: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Unit, position: java.lang.String, offsets: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAlignToXY(element: Unit, position: Unit, offsets: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignToXY")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
    * @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
    * @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
    * @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
    * @returns Number[] [x, y] An array containing the element's x and y coordinates
    */
  inline def getAnchorXY(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: java.lang.String, local: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: java.lang.String, local: Boolean, size: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any], local.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: java.lang.String, local: Unit, size: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any], local.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: Unit, local: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: Unit, local: Boolean, size: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any], local.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getAnchorXY(anchor: Unit, local: Unit, size: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorXY")(anchor.asInstanceOf[js.Any], local.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
    * @param contentBox Boolean If true a box for the content of the element is returned.
    * @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
    * @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
    */
  inline def getBox(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBox")().asInstanceOf[Any]
  inline def getBox(contentBox: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBox")(contentBox.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getBox(contentBox: Boolean, local: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBox")(contentBox.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getBox(contentBox: Unit, local: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBox")(contentBox.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Implements an upward event bubbling policy  */
  inline def getBubbleTarget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleTarget")().asInstanceOf[Unit]
  
  /** [Method] Return the immediate child Component in which the passed element is located
    * @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
    * @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
    * @returns Ext.Component The child item which contains the passed element.
    */
  inline def getChildByElement(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildByElement")().asInstanceOf[IComponent]
  inline def getChildByElement(el: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildByElement")(el.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def getChildByElement(el: Any, deep: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildByElement")(el.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def getChildByElement(el: Unit, deep: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildByElement")(el.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Returns the current collapsed state of the panel
    * @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
    */
  inline def getCollapsed(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollapsed")().asInstanceOf[Any]
  
  /** [Method] Attempts a default component lookup see Ext container Container getComponent
    * @param comp String/Number The component id, itemId or position to find
    * @returns Ext.Component The component (if found)
    */
  inline def getComponent(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")().asInstanceOf[IComponent]
  inline def getComponent(comp: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(comp.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
    * @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
    * @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
    * @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
    */
  inline def getConstrainVector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")().asInstanceOf[Any]
  inline def getConstrainVector(constrainTo: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getConstrainVector(constrainTo: Any, proposedPosition: Unit, proposedSize: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getConstrainVector(constrainTo: Any, proposedPosition: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getConstrainVector(constrainTo: Any, proposedPosition: typings.extjs.Ext.Array, proposedSize: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getConstrainVector(constrainTo: Unit, proposedPosition: Unit, proposedSize: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getConstrainVector(constrainTo: Unit, proposedPosition: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getConstrainVector(
    constrainTo: Unit,
    proposedPosition: typings.extjs.Ext.Array,
    proposedSize: typings.extjs.Ext.Array
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstrainVector")(constrainTo.asInstanceOf[js.Any], proposedPosition.asInstanceOf[js.Any], proposedSize.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Gets the configured default focus item  */
  inline def getDefaultFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFocus")().asInstanceOf[Unit]
  
  /** [Method] Finds a docked component by id itemId or position
    * @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
    * @returns Ext.Component The docked component (if found)
    */
  inline def getDockedComponent(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedComponent")().asInstanceOf[IComponent]
  inline def getDockedComponent(comp: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedComponent")(comp.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Retrieves an array of all currently docked Components
    * @param selector String A ComponentQuery selector string to filter the returned items.
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] The array of docked components meeting the specified criteria.
    */
  inline def getDockedItems(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedItems")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getDockedItems(selector: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedItems")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def getDockedItems(selector: java.lang.String, beforeBody: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getDockedItems")(selector.asInstanceOf[js.Any], beforeBody.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getDockedItems(selector: Unit, beforeBody: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getDockedItems")(selector.asInstanceOf[js.Any], beforeBody.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Retrieves the top level element representing this component
    * @returns Ext.dom.Element
    */
  inline def getEl(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getEl")().asInstanceOf[IElement]
  
  /** [Method] Gets the Header for this panel  */
  inline def getHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeader")().asInstanceOf[Unit]
  
  /** [Method] Gets the current height of the component s underlying element
    * @returns Number
    */
  inline def getHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")().asInstanceOf[Double]
  
  /** [Method] Retrieves the id of this component
    * @returns String
    */
  inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
  inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
    * @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
    * @returns HTMLElement DOM element that you can use in the insertBefore
    */
  inline def getInsertPosition(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getInsertPosition")().asInstanceOf[HTMLElement]
  inline def getInsertPosition(position: Any): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getInsertPosition")(position.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /** [Method] Returns the value of itemId assigned to this component or when that is not set returns the value of id
    * @returns String
    */
  inline def getItemId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the layout instance currently associated with this Container
    * @returns Ext.layout.container.Container The layout
    */
  inline def getLayout(): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayout")().asInstanceOf[IContainer]
  
  /** [Method] Gets the Ext ComponentLoader for this Component
    * @returns Ext.ComponentLoader The loader instance, null if it doesn't exist.
    */
  inline def getLoader(): IComponentLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")().asInstanceOf[IComponentLoader]
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @returns Number The local x coordinate
    */
  inline def getLocalX(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalX")().asInstanceOf[Double]
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @returns Number[] The local XY position of the element
    */
  inline def getLocalXY(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalXY")().asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
    * @returns Number The local y coordinate
    */
  inline def getLocalY(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalY")().asInstanceOf[Double]
  
  /** [Method] Returns the offsets of this element from the passed element
    * @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
    * @returns Number[] The XY page offsets (e.g. [100, -200])
    */
  inline def getOffsetsTo(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetsTo")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getOffsetsTo(offsetsTo: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetsTo")(offsetsTo.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Retrieves a plugin from this component s collection by its pluginId
    * @param pluginId String
    * @returns Ext.AbstractPlugin plugin instance.
    */
  inline def getPlugin(): IAbstractPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")().asInstanceOf[IAbstractPlugin]
  inline def getPlugin(pluginId: java.lang.String): IAbstractPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginId.asInstanceOf[js.Any]).asInstanceOf[IAbstractPlugin]
  
  /** [Method] Gets the current XY position of the component s underlying element
    * @param local Boolean If true the element's left and top are returned instead of page XY.
    * @returns Number[] The XY position of the element (e.g., [100, 200])
    */
  inline def getPosition(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getPosition(local: Boolean): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(local.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
    * @param deep Object
    */
  inline def getRefItems(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefItems")().asInstanceOf[Unit]
  inline def getRefItems(deep: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefItems")(deep.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Returns a region object that defines the area of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
    */
  inline def getRegion(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")().asInstanceOf[IRegion]
  
  /** [Method] Gets the current size of the component s underlying element
    * @returns Object An object containing the element's size {width: (element width), height: (element height)}
    */
  inline def getSize(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Any]
  
  /** [Method] Returns an object that describes how this component s width and height are managed
    * @param ownerCtSizeModel Object
    * @returns Object The size model for this component.
    */
  inline def getSizeModel(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeModel")().asInstanceOf[Any]
  inline def getSizeModel(ownerCtSizeModel: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeModel")(ownerCtSizeModel.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns the content region of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
    */
  inline def getViewRegion(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewRegion")().asInstanceOf[IRegion]
  
  /** [Method] Gets the current width of the component s underlying element
    * @returns Number
    */
  inline def getWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")().asInstanceOf[Double]
  
  /** [Method] Gets the current X position of the DOM element based on page coordinates
    * @returns Number The X position of the element
    */
  inline def getX(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getX")().asInstanceOf[Double]
  
  /** [Method] Gets the xtype for this component as registered with Ext ComponentManager
    * @returns String The xtype
    */
  inline def getXType(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getXType")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
    * @returns String The xtype hierarchy string
    */
  inline def getXTypes(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getXTypes")().asInstanceOf[java.lang.String]
  
  /** [Method] Gets the current position of the DOM element based on page coordinates
    * @returns Number[] The XY position of the element
    */
  inline def getXY(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getXY")().asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
    * @returns Number The Y position of the element
    */
  inline def getY(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getY")().asInstanceOf[Double]
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  inline def hasActiveFx(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hasActiveFx")().asInstanceOf[Any]
  
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
    * @param className String The CSS class to check for.
    * @returns Boolean true if the class exists, else false.
    */
  inline def hasCls(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCls")().asInstanceOf[Boolean]
  inline def hasCls(className: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCls")(className.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
  inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.MessageBox.hasListeners")
  @js.native
  def hasListeners: Any = js.native
  inline def hasListeners_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
  
  /** [Method] Checks if there is currently a specified uiCls
    * @param cls String The cls to check.
    */
  inline def hasUICls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUICls")().asInstanceOf[Unit]
  inline def hasUICls(cls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUICls")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  inline def hide(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[IComponent]
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
  inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Initialize any events on this component */
  inline def initEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initEvents")().asInstanceOf[Unit]
  
  /** [Method] Inserts a Component into this Container at a specified index
    * @param index Number The index at which the Component will be inserted into the Container's items collection
    * @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
    * @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
    */
  inline def insert(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[IComponent]
  inline def insert(index: Double): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def insert(index: Double, component: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def insert(index: Unit, component: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Inserts docked item s to the panel at the indicated position
    * @param pos Number The index at which the Component will be inserted
    * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
    */
  inline def insertDocked(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertDocked")().asInstanceOf[Unit]
  inline def insertDocked(pos: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertDocked")(pos.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insertDocked(pos: Double, component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDocked")(pos.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDocked(pos: Unit, component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDocked")(pos.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Tests whether this Component matches the selector string
    * @param selector String The selector string to test against.
    * @returns Boolean true if this Component matches the selector.
    */
  inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is(selector: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Determines whether this Container is an ancestor of the passed Component
    * @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
    */
  inline def isAncestor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")().asInstanceOf[Unit]
  inline def isAncestor(possibleDescendant: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")(possibleDescendant.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.isComponent")
  @js.native
  def isComponent: Boolean = js.native
  inline def isComponent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isComponent")(x.asInstanceOf[js.Any])
  
  /** [Method] Determines whether this component is the descendant of a particular container
    * @param container Ext.Container
    * @returns Boolean true if the component is the descendant of a particular container, otherwise false.
    */
  inline def isDescendantOf(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDescendantOf")().asInstanceOf[Boolean]
  inline def isDescendantOf(container: typings.extjs.Ext.IContainer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDescendantOf")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Method to determine whether this Component is currently disabled
    * @returns Boolean the disabled state of this Component.
    */
  inline def isDisabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")().asInstanceOf[Boolean]
  
  /** [Method] Method to determine whether this Component is draggable
    * @returns Boolean the draggable state of this component.
    */
  inline def isDraggable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraggable")().asInstanceOf[Boolean]
  
  /** [Method] Method to determine whether this Component is droppable
    * @returns Boolean the droppable state of this component.
    */
  inline def isDroppable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDroppable")().asInstanceOf[Boolean]
  
  /** [Method] Method to determine whether this Component is floating
    * @returns Boolean the floating state of this component.
    */
  inline def isFloating(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFloating")().asInstanceOf[Boolean]
  
  /** [Method] Method to determine whether this Component is currently set to hidden
    * @returns Boolean the hidden state of this Component.
    */
  inline def isHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHidden")().asInstanceOf[Boolean]
  
  /** [Method] Determines whether this Component is the root of a layout  */
  inline def isLayoutRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayoutRoot")().asInstanceOf[Unit]
  
  /** [Method] Returns true if layout is suspended for this component
    * @returns Boolean true layout of this component is suspended.
    */
  inline def isLayoutSuspended(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayoutSuspended")().asInstanceOf[Boolean]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.isObservable")
  @js.native
  def isObservable: Boolean = js.native
  inline def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.isPanel")
  @js.native
  def isPanel: Boolean = js.native
  inline def isPanel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPanel")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns true if this component is visible
    * @param deep Object
    * @returns Boolean true if this component is visible, false otherwise.
    */
  inline def isVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")().asInstanceOf[Boolean]
  inline def isVisible(deep: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(deep.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.isWindow")
  @js.native
  def isWindow: Boolean = js.native
  inline def isWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(x.asInstanceOf[js.Any])
  
  /** [Method] Tests whether or not this Component is of a specific xtype
    * @param xtype String The xtype to check for this Component
    * @param shallow Boolean true to check whether this Component is directly of the specified xtype, false to check whether this Component is descended from the xtype.
    * @returns Boolean true if this component descends from the specified xtype, false otherwise.
    */
  inline def isXType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXType")().asInstanceOf[Boolean]
  inline def isXType(xtype: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXType")(xtype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isXType(xtype: java.lang.String, shallow: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isXType")(xtype.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isXType(xtype: Unit, shallow: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isXType")(xtype.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Property] (Ext.util.AbstractMixedCollection) */
  @JSGlobal("Ext.MessageBox.items")
  @js.native
  def items: IAbstractMixedCollection = js.native
  inline def items_=(x: IAbstractMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.maskOnDisable")
  @js.native
  def maskOnDisable: Boolean = js.native
  inline def maskOnDisable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskOnDisable")(x.asInstanceOf[js.Any])
  
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
    * @param animate Boolean true to animate this Window to full size.
    * @returns Ext.window.Window this
    */
  inline def maximize(): IWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("maximize")().asInstanceOf[IWindow]
  inline def maximize(animate: Boolean): IWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("maximize")(animate.asInstanceOf[js.Any]).asInstanceOf[IWindow]
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.minProgressWidth")
  @js.native
  def minProgressWidth: Double = js.native
  inline def minProgressWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minProgressWidth")(x.asInstanceOf[js.Any])
  
  /** [Property] (Number) */
  @JSGlobal("Ext.MessageBox.minPromptWidth")
  @js.native
  def minPromptWidth: Double = js.native
  inline def minPromptWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPromptWidth")(x.asInstanceOf[js.Any])
  
  /** [Method] Placeholder method for minimizing the window
    * @returns Ext.window.Window this
    */
  inline def minimize(): IWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("minimize")().asInstanceOf[IWindow]
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  inline def mon(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Any]
  inline def mon(item: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Any, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Any, ename: Unit, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Any, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mon(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Moves a Component within the Container
    * @param fromIdx Number/Ext.Component The index/component to move.
    * @param toIdx Number The new index for the Component.
    * @returns Ext.Component component The Component that was moved.
    */
  inline def move(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("move")().asInstanceOf[IComponent]
  inline def move(fromIdx: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(fromIdx.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def move(fromIdx: Any, toIdx: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(fromIdx.asInstanceOf[js.Any], toIdx.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def move(fromIdx: Unit, toIdx: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(fromIdx.asInstanceOf[js.Any], toIdx.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
  inline def mun(item: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Any, ename: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(item: Unit, ename: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Returns the next node in the Component tree in tree traversal order
    * @param selector String A ComponentQuery selector to filter the following nodes.
    * @returns Ext.Component The next node (or the next node which matches the selector). Returns null if there is no matching node.
    */
  inline def nextNode(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("nextNode")().asInstanceOf[IComponent]
  inline def nextNode(selector: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("nextNode")(selector.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Returns the next sibling of this Component
    * @param selector String A ComponentQuery selector to filter the following items.
    * @returns Ext.Component The next sibling (or the next sibling which matches the selector). Returns null if there is no matching sibling.
    */
  inline def nextSibling(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSibling")().asInstanceOf[IComponent]
  inline def nextSibling(selector: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSibling")(selector.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  inline def on(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Any]
  inline def on(eventName: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] This method is invoked after a new Component has been added
    * @param component Ext.Component
    * @param position Number
    */
  inline def onAdd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAdd")().asInstanceOf[Unit]
  inline def onAdd(component: Unit, position: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAdd")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAdd(component: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAdd")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onAdd(component: IComponent, position: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAdd")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event  */
  inline def onAdded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAdded")().asInstanceOf[Unit]
  
  /** [Method] This method is invoked before adding a new child Component
    * @param item Ext.Component
    */
  inline def onBeforeAdd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeAdd")().asInstanceOf[Unit]
  inline def onBeforeAdd(item: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeAdd")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Allows addition of behavior to the destroy operation  */
  inline def onDestroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDestroy")().asInstanceOf[Unit]
  
  /** [Method] Allows addition of behavior to the disable operation  */
  inline def onDisable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisable")().asInstanceOf[Unit]
  
  /** [Method] Invoked after a docked item is added to the Panel
    * @param component Ext.Component
    */
  inline def onDockedAdd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDockedAdd")().asInstanceOf[Unit]
  inline def onDockedAdd(component: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDockedAdd")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Invoked after a docked item is removed from the Panel
    * @param component Ext.Component
    */
  inline def onDockedRemove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDockedRemove")().asInstanceOf[Unit]
  inline def onDockedRemove(component: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDockedRemove")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Allows addition of behavior to the enable operation  */
  inline def onEnable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnable")().asInstanceOf[Unit]
  
  /** [Method] Possibly animates down to a target element  */
  inline def onHide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onHide")().asInstanceOf[Unit]
  
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
  inline def onPosition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPosition")().asInstanceOf[Unit]
  
  /** [Method] This method is invoked after a new Component has been removed
    * @param component Ext.Component
    * @param autoDestroy Boolean
    */
  inline def onRemove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRemove")().asInstanceOf[Unit]
  inline def onRemove(component: Unit, autoDestroy: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onRemove")(component.asInstanceOf[js.Any], autoDestroy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onRemove(component: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRemove")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onRemove(component: IComponent, autoDestroy: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onRemove")(component.asInstanceOf[js.Any], autoDestroy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
    * @param destroying Object
    */
  inline def onRemoved(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRemoved")().asInstanceOf[Unit]
  inline def onRemoved(destroying: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRemoved")(destroying.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Allows addition of behavior to the resize operation  */
  inline def onResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResize")().asInstanceOf[Unit]
  
  /** [Method] Allows addition of behavior to the show operation  */
  inline def onShow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onShow")().asInstanceOf[Unit]
  
  /** [Method] Invoked after the afterShow method is complete
    * @param callback Function
    * @param scope Object
    */
  inline def onShowComplete(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onShowComplete")().asInstanceOf[Unit]
  inline def onShowComplete(callback: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onShowComplete")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onShowComplete(callback: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onShowComplete")(callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onShowComplete(callback: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onShowComplete")(callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Ext.Container) */
  @JSGlobal("Ext.MessageBox.ownerCt")
  @js.native
  def ownerCt: typings.extjs.Ext.IContainer = js.native
  inline def ownerCt_=(x: typings.extjs.Ext.IContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ownerCt")(x.asInstanceOf[js.Any])
  
  /** [Method] Template method to do any post blur processing
    * @param e Ext.EventObject The event object
    */
  inline def postBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("postBlur")().asInstanceOf[Unit]
  inline def postBlur(e: IEventObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("postBlur")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Returns the previous node in the Component tree in tree traversal order
    * @param selector String A ComponentQuery selector to filter the preceding nodes.
    * @returns Ext.Component The previous node (or the previous node which matches the selector). Returns null if there is no matching node.
    */
  inline def previousNode(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("previousNode")().asInstanceOf[IComponent]
  inline def previousNode(selector: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("previousNode")(selector.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Returns the previous sibling of this Component
    * @param selector String A ComponentQuery selector to filter the preceding items.
    * @returns Ext.Component The previous sibling (or the previous sibling which matches the selector). Returns null if there is no matching sibling.
    */
  inline def previousSibling(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("previousSibling")().asInstanceOf[IComponent]
  inline def previousSibling(selector: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("previousSibling")(selector.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Displays a message box with a progress bar
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param progressText String The text to display inside the progress bar
    * @returns Ext.window.MessageBox this
    */
  inline def progress(): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("progress")().asInstanceOf[IMessageBox]
  inline def progress(title: java.lang.String): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  inline def progress(title: java.lang.String, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def progress(title: java.lang.String, msg: java.lang.String, progressText: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def progress(title: java.lang.String, msg: Unit, progressText: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def progress(title: Unit, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def progress(title: Unit, msg: java.lang.String, progressText: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def progress(title: Unit, msg: Unit, progressText: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  /** [Method] Displays a message box with OK and Cancel buttons prompting the user to enter some text comparable to JavaScript s p
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @param multiline Boolean/Number True to create a multiline textbox using the defaultTextHeight property, or the height in pixels to create the textbox/
    * @param value String Default value of the text input element
    * @returns Ext.window.MessageBox this
    */
  inline def prompt(
    title: js.UndefOr[java.lang.String],
    msg: js.UndefOr[java.lang.String],
    fn: js.UndefOr[Any],
    scope: js.UndefOr[Any],
    multiline: js.UndefOr[Any],
    value: js.UndefOr[java.lang.String]
  ): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  inline def query(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[typings.extjs.Ext.Array]
  inline def query(selector: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  inline def queryBy(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("queryBy")().asInstanceOf[typings.extjs.Ext.Array]
  inline def queryBy(fn: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("queryBy")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def queryBy(fn: Any, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("queryBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def queryBy(fn: Unit, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("queryBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  inline def queryById(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("queryById")().asInstanceOf[IComponent]
  inline def queryById(id: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("queryById")(id.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Called by Component doAutoRender Register a Container configured floating true with this Component s ZIndexManager
    * @param cmp Object
    */
  inline def registerFloatingItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFloatingItem")().asInstanceOf[Unit]
  inline def registerFloatingItem(cmp: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFloatingItem")(cmp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  inline def relayEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[Any]
  inline def relayEvents(origin: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def relayEvents(origin: Any, events: Unit, prefix: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def relayEvents(origin: Any, events: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def relayEvents(origin: Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def relayEvents(origin: Unit, events: Unit, prefix: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def relayEvents(origin: Unit, events: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def relayEvents(origin: Unit, events: typings.extjs.Ext.Array, prefix: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Removes a component from this container
    * @param component Ext.Component/String The component reference or id to remove.
    * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
    * @returns Ext.Component component The Component that was removed.
    */
  inline def remove(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[IComponent]
  inline def remove(component: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(component.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def remove(component: Any, autoDestroy: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(component.asInstanceOf[js.Any], autoDestroy.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def remove(component: Unit, autoDestroy: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(component.asInstanceOf[js.Any], autoDestroy.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Removes all components from this container
    * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
    * @returns Ext.Component[] Array of the removed components
    */
  inline def removeAll(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[typings.extjs.Ext.Array]
  inline def removeAll(autoDestroy: Boolean): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(autoDestroy.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Remove any anchor to this element
    * @returns Ext.util.Positionable this
    */
  inline def removeAnchor(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAnchor")().asInstanceOf[IPositionable]
  
  /** [Method] Removes a CSS class from the body element
    * @param cls String The class to remove
    * @returns Ext.panel.Panel this
    */
  inline def removeBodyCls(): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBodyCls")().asInstanceOf[IPanel]
  inline def removeBodyCls(cls: java.lang.String): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBodyCls")(cls.asInstanceOf[js.Any]).asInstanceOf[IPanel]
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  inline def removeChildEls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChildEls")().asInstanceOf[Unit]
  inline def removeChildEls(testFn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChildEls")(testFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Removes a CSS class from the top level element representing this component
    * @param cls String/String[] The CSS class name to remove.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  inline def removeCls(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")().asInstanceOf[IComponent]
  inline def removeCls(cls: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Removes a cls to the uiCls array which will also call removeUIClsFromElement and removes it from all elements of thi
    * @param cls String/String[] A string or an array of strings to remove to the uiCls.
    */
  inline def removeClsWithUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeClsWithUI")().asInstanceOf[Unit]
  inline def removeClsWithUI(cls: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeClsWithUI")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Removes the docked item from the panel
    * @param item Ext.Component The Component to remove.
    * @param autoDestroy Boolean Destroy the component after removal.
    */
  inline def removeDocked(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")().asInstanceOf[Unit]
  inline def removeDocked(item: Unit, autoDestroy: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")(item.asInstanceOf[js.Any], autoDestroy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeDocked(item: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeDocked(item: IComponent, autoDestroy: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")(item.asInstanceOf[js.Any], autoDestroy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
  inline def removeListener(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeListener(eventName: java.lang.String, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: java.lang.String, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: java.lang.String, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
  inline def removeManagedListener(item: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Any, ename: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] inherit docs
    * @param cls Object
    */
  inline def removeUIClsFromElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUIClsFromElement")().asInstanceOf[Unit]
  inline def removeUIClsFromElement(cls: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUIClsFromElement")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Renders the Component into the passed HTML element
    * @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
    * @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
    */
  inline def render(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")().asInstanceOf[Unit]
  inline def render(container: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def render(container: Any, position: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(container: Unit, position: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.MessageBox.rendered")
  @js.native
  def rendered: Boolean = js.native
  inline def rendered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendered")(x.asInstanceOf[js.Any])
  
  /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
    * @param animate Object
    * @returns Ext.window.Window this
    */
  inline def restore(): IWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[IWindow]
  inline def restore(animate: Any): IWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(animate.asInstanceOf[js.Any]).asInstanceOf[IWindow]
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  inline def resumeEvent(eventName: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvent")(eventName.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /** [Method] Resumes firing events see suspendEvents */
  inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
  
  /** [Method] Conditionally saves a single property from this object to the given state object
    * @param propName String The name of the property to save.
    * @param state Object The state object in to which to save the property.
    * @param stateName String The name to use for the property in state.
    * @returns Boolean True if the property was saved, false if not.
    */
  inline def savePropToState(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")().asInstanceOf[Boolean]
  inline def savePropToState(propName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def savePropToState(propName: java.lang.String, state: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def savePropToState(propName: java.lang.String, state: Any, stateName: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any], state.asInstanceOf[js.Any], stateName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def savePropToState(propName: java.lang.String, state: Unit, stateName: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any], state.asInstanceOf[js.Any], stateName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def savePropToState(propName: Unit, state: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def savePropToState(propName: Unit, state: Any, stateName: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any], state.asInstanceOf[js.Any], stateName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def savePropToState(propName: Unit, state: Unit, stateName: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropToState")(propName.asInstanceOf[js.Any], state.asInstanceOf[js.Any], stateName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
    * @param propNames String/String[] The name (or array of names) of the property to save.
    * @param state Object The state object in to which to save the property values.
    * @returns Object state
    */
  inline def savePropsToState(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("savePropsToState")().asInstanceOf[Any]
  inline def savePropsToState(propNames: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("savePropsToState")(propNames.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def savePropsToState(propNames: Any, state: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropsToState")(propNames.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def savePropsToState(propNames: Unit, state: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("savePropsToState")(propNames.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Saves the state of the object to the persistence store  */
  inline def saveState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveState")().asInstanceOf[Unit]
  
  /** [Method] Scrolls this Component s target element by the passed delta values optionally animating
    * @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
    * @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
    * @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
    */
  inline def scrollBy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")().asInstanceOf[Unit]
  inline def scrollBy(deltaX: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollBy(deltaX: Any, deltaY: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollBy(deltaX: Any, deltaY: Any, animate: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollBy(deltaX: Any, deltaY: Unit, animate: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollBy(deltaX: Unit, deltaY: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollBy(deltaX: Unit, deltaY: Any, animate: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollBy(deltaX: Unit, deltaY: Unit, animate: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollBy")(deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.MessageBox.scrollFlags")
  @js.native
  def scrollFlags: Any = js.native
  inline def scrollFlags_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollFlags")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.MessageBox.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  inline def sequenceFx(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceFx")().asInstanceOf[Any]
  
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  inline def setActive(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActive")().asInstanceOf[Unit]
  inline def setActive(active: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActive")(active.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setActive(active: Boolean, newActive: IComponent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActive")(active.asInstanceOf[js.Any], newActive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setActive(active: Unit, newActive: IComponent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActive")(active.asInstanceOf[js.Any], newActive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Sets the overflow on the content element of the component
    * @param scroll Boolean True to allow the Component to auto scroll.
    * @returns Ext.Component this
    */
  inline def setAutoScroll(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScroll")().asInstanceOf[IComponent]
  inline def setAutoScroll(scroll: Boolean): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScroll")(scroll.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Sets the body style according to the passed parameters
    * @param style Mixed A full style specification string, or object, or the name of a style property to set.
    * @param value String If the first param was a style property name, the style property value.
    * @returns Ext.panel.Panel this
    */
  inline def setBodyStyle(): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("setBodyStyle")().asInstanceOf[IPanel]
  inline def setBodyStyle(style: Any): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("setBodyStyle")(style.asInstanceOf[js.Any]).asInstanceOf[IPanel]
  inline def setBodyStyle(style: Any, value: java.lang.String): IPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("setBodyStyle")(style.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IPanel]
  inline def setBodyStyle(style: Unit, value: java.lang.String): IPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("setBodyStyle")(style.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IPanel]
  
  /** [Method]
    * @param border Object
    * @param targetEl Object
    */
  inline def setBorder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBorder")().asInstanceOf[Unit]
  inline def setBorder(border: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBorder")(border.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBorder(border: Any, targetEl: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBorder")(border.asInstanceOf[js.Any], targetEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setBorder(border: Unit, targetEl: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBorder")(border.asInstanceOf[js.Any], targetEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method changes the region config property for this border region
    * @param region String The new region value ("north", "south", "east" or "west").
    * @returns String The previous value of the region property.
    */
  inline def setBorderRegion(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("setBorderRegion")().asInstanceOf[java.lang.String]
  inline def setBorderRegion(region: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("setBorderRegion")(region.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Sets the element s box
    * @param box Object The box to fill {x, y, width, height}
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  inline def setBox(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setBox")().asInstanceOf[IPositionable]
  inline def setBox(box: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setBox")(box.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def setBox(box: Any, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setBox")(box.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def setBox(box: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setBox")(box.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Enable or disable the component
    * @param disabled Boolean true to disable.
    */
  inline def setDisabled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisabled")().asInstanceOf[Unit]
  inline def setDisabled(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisabled")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the dock position of this component in its parent panel
    * @param dock Object The dock position.
    * @param layoutParent Boolean true to re-layout parent.
    * @returns Ext.Component this
    */
  inline def setDocked(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocked")().asInstanceOf[IComponent]
  inline def setDocked(dock: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocked")(dock.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def setDocked(dock: Any, layoutParent: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setDocked")(dock.asInstanceOf[js.Any], layoutParent.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setDocked(dock: Unit, layoutParent: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setDocked")(dock.asInstanceOf[js.Any], layoutParent.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Set the glyph for the panel s header
    * @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
    */
  inline def setGlyph(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlyph")().asInstanceOf[Unit]
  inline def setGlyph(newGlyph: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlyph")(newGlyph.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the height of the component
    * @param height Number The new height to set. This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  inline def setHeight(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setHeight")().asInstanceOf[IComponent]
  inline def setHeight(height: Double): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setHeight")(height.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Adds the specified icon to the dialog
    * @param icon String A CSS classname specifying the icon's background image url, or empty string to clear the icon
    * @param width Number The width of the icon. If not specified, the default is used
    * @param height Number The height of the icon. If not specified, the default is used
    * @returns Ext.window.MessageBox this
    */
  inline def setIcon(): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")().asInstanceOf[IMessageBox]
  inline def setIcon(icon: java.lang.String): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  inline def setIcon(icon: java.lang.String, width: Double): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def setIcon(icon: java.lang.String, width: Double, height: Double): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def setIcon(icon: java.lang.String, width: Unit, height: Double): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def setIcon(icon: Unit, width: Double): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def setIcon(icon: Unit, width: Double, height: Double): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def setIcon(icon: Unit, width: Unit, height: Double): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(icon.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  /** [Method] Set the iconCls for the panel s header
    * @param newIconCls String The new CSS class name
    */
  inline def setIconCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIconCls")().asInstanceOf[Unit]
  inline def setIconCls(newIconCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIconCls")(newIconCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method allows you to show or hide a LoadMask on top of this component
    * @param load Boolean/Object/String True to show the default LoadMask, a config object that will be passed to the LoadMask constructor, or a message String to show. False to hide the current LoadMask.
    * @param targetEl Boolean True to mask the targetEl of this Component instead of the this.el. For example, setting this to true on a Panel will cause only the body to be masked.
    * @returns Ext.LoadMask The LoadMask instance that has just been shown.
    */
  inline def setLoading(): ILoadMask = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoading")().asInstanceOf[ILoadMask]
  inline def setLoading(load: Any): ILoadMask = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoading")(load.asInstanceOf[js.Any]).asInstanceOf[ILoadMask]
  inline def setLoading(load: Any, targetEl: Boolean): ILoadMask = (^.asInstanceOf[js.Dynamic].applyDynamic("setLoading")(load.asInstanceOf[js.Any], targetEl.asInstanceOf[js.Any])).asInstanceOf[ILoadMask]
  inline def setLoading(load: Unit, targetEl: Boolean): ILoadMask = (^.asInstanceOf[js.Dynamic].applyDynamic("setLoading")(load.asInstanceOf[js.Any], targetEl.asInstanceOf[js.Any])).asInstanceOf[ILoadMask]
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @returns Ext.util.Positionable this
    */
  inline def setLocalX(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalX")().asInstanceOf[IPositionable]
  inline def setLocalX(x: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalX")(x.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  inline def setLocalXY(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalXY")().asInstanceOf[IPositionable]
  inline def setLocalXY(x: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalXY")(x.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def setLocalXY(x: Any, y: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocalXY")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def setLocalXY(x: Unit, y: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocalXY")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Sets the local y coordinate of this element using CSS style
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  inline def setLocalY(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalY")().asInstanceOf[IPositionable]
  inline def setLocalY(y: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalY")(y.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  
  /** [Method] Sets the margin on the target element
    * @param margin Number/String The margin to set. See the margin config.
    */
  inline def setMargin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMargin")().asInstanceOf[Unit]
  inline def setMargin(margin: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMargin")(margin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the overflow x y on the content element of the component
    * @param overflowX String The overflow-x value.
    * @param overflowY String The overflow-y value.
    * @returns Ext.Component this
    */
  inline def setOverflowXY(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setOverflowXY")().asInstanceOf[IComponent]
  inline def setOverflowXY(overflowX: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setOverflowXY")(overflowX.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def setOverflowXY(overflowX: java.lang.String, overflowY: java.lang.String): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverflowXY")(overflowX.asInstanceOf[js.Any], overflowY.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setOverflowXY(overflowX: Unit, overflowY: java.lang.String): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverflowXY")(overflowX.asInstanceOf[js.Any], overflowY.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Sets the page XY position of the component
    * @param x Number/Number[] The new x position or an array of [x,y].
    * @param y Number The new y position.
    * @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  inline def setPagePosition(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")().asInstanceOf[IComponent]
  inline def setPagePosition(x: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def setPagePosition(x: Any, y: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPagePosition(x: Any, y: Double, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPagePosition(x: Any, y: Unit, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPagePosition(x: Unit, y: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPagePosition(x: Unit, y: Double, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPagePosition(x: Unit, y: Unit, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPagePosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Sets the left and top of the component
    * @param x Number/Number[]/Object The new left, an array of [x,y], or animation config object containing x and y properties.
    * @param y Number The new top.
    * @param animate Boolean/Object If true, the Component is animated into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  inline def setPosition(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")().asInstanceOf[IComponent]
  inline def setPosition(x: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def setPosition(x: Any, y: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPosition(x: Any, y: Double, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPosition(x: Any, y: Unit, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPosition(x: Unit, y: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPosition(x: Unit, y: Double, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setPosition(x: Unit, y: Unit, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Sets the element s position and size to the specified region
    * @param region Ext.util.Region The region to fill
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  inline def setRegion(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setRegion")().asInstanceOf[IPositionable]
  inline def setRegion(region: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setRegion")(region.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def setRegion(region: IRegion): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setRegion")(region.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def setRegion(region: IRegion, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setRegion")(region.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Sets the weight config property for this component
    * @param weight Number The new weight value.
    * @returns Number The previous value of the weight property.
    */
  inline def setRegionWeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setRegionWeight")().asInstanceOf[Double]
  inline def setRegionWeight(weight: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setRegionWeight")(weight.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Sets the width and height of this Component
    * @param width Number/String/Object The new width to set. This may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style. A size object in the format {width: widthValue, height: heightValue}. undefined to leave the width unchanged.
    * @param height Number/String The new height to set (not required if a size object is passed as the first arg). This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  inline def setSize(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setSize")().asInstanceOf[IComponent]
  inline def setSize(width: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setSize")(width.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def setSize(width: Any, height: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def setSize(width: Unit, height: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("setSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Set a title for the panel s header
    * @param newTitle String
    */
  inline def setTitle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")().asInstanceOf[Unit]
  inline def setTitle(newTitle: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(newTitle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the UI for the component
    * @param ui Object
    */
  inline def setUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUI")().asInstanceOf[Unit]
  inline def setUI(ui: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUI")(ui.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Convenience function to hide or show this component by Boolean
    * @param visible Boolean true to show, false to hide.
    * @returns Ext.Component this
    */
  inline def setVisible(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisible")().asInstanceOf[IComponent]
  inline def setVisible(visible: Boolean): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisible")(visible.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Sets the width of the component
    * @param width Number The new width to setThis may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style.
    * @returns Ext.Component this
    */
  inline def setWidth(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setWidth")().asInstanceOf[IComponent]
  inline def setWidth(width: Double): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("setWidth")(width.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Sets the X position of the DOM element based on page coordinates
    * @param x Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  inline def setX(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setX")().asInstanceOf[IPositionable]
  inline def setX(x: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setX")(x.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def setX(x: Any, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setX")(x.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def setX(x: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setX")(x.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Sets the position of the DOM element in page coordinates
    * @param xy Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  inline def setXY(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setXY")().asInstanceOf[IPositionable]
  inline def setXY(xy: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setXY")(xy.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def setXY(xy: Any, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setXY")(xy.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def setXY(xy: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setXY")(xy.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Sets the Y position of the DOM element based on page coordinates
    * @param y Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  inline def setY(): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setY")().asInstanceOf[IPositionable]
  inline def setY(y: Any): IPositionable = ^.asInstanceOf[js.Dynamic].applyDynamic("setY")(y.asInstanceOf[js.Any]).asInstanceOf[IPositionable]
  inline def setY(y: Any, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setY")(y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  inline def setY(y: Unit, animate: Any): IPositionable = (^.asInstanceOf[js.Dynamic].applyDynamic("setY")(y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IPositionable]
  
  /** [Method] Displays a new message box or reinitializes an existing message box based on the config options passed in
    * @param config Object The following config options are supported:
    * @returns Ext.window.MessageBox this
    */
  inline def show(): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[IMessageBox]
  inline def show(config: Any): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(config.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  
  /** [Method] Displays component at specific xy position
    * @param x Number/Number[] The new x position or array of [x,y].
    * @param y Number The new y position
    * @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  inline def showAt(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("showAt")().asInstanceOf[IComponent]
  inline def showAt(x: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def showAt(x: Any, y: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showAt(x: Any, y: Double, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showAt(x: Any, y: Unit, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showAt(x: Unit, y: Double): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showAt(x: Unit, y: Double, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showAt(x: Unit, y: Unit, animate: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animate.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Shows this component by the specified Component or Element
    * @param component Ext.Component/Ext.dom.Element The Ext.Component or Ext.Element to show the component by.
    * @param position String Alignment position as used by Ext.util.Positionable.getAlignToXY. Defaults to defaultAlign.
    * @param offsets Number[] Alignment offsets as used by Ext.util.Positionable.getAlignToXY.
    * @returns Ext.Component this
    */
  inline def showBy(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("showBy")().asInstanceOf[IComponent]
  inline def showBy(component: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def showBy(component: Any, position: java.lang.String): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showBy(component: Any, position: java.lang.String, offsets: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showBy(component: Any, position: Unit, offsets: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showBy(component: Unit, position: java.lang.String): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showBy(component: Unit, position: java.lang.String, offsets: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def showBy(component: Unit, position: Unit, offsets: typings.extjs.Ext.Array): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  inline def stopAnimation(): typings.extjs.Ext.IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAnimation")().asInstanceOf[typings.extjs.Ext.IElement]
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  inline def stopFx(): typings.extjs.Ext.IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("stopFx")().asInstanceOf[typings.extjs.Ext.IElement]
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  inline def suspendEvent(eventName: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvent")(eventName.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
  inline def suspendEvents(queueSuspended: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")(queueSuspended.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  inline def syncFx(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("syncFx")().asInstanceOf[Any]
  
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  inline def toBack(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("toBack")().asInstanceOf[IComponent]
  
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  inline def toFront(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("toFront")().asInstanceOf[IComponent]
  inline def toFront(preventFocus: Boolean): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("toFront")(preventFocus.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
    * @returns Ext.panel.Panel this
    */
  inline def toggleCollapse(): IPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleCollapse")().asInstanceOf[IPanel]
  
  /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
    * @returns Ext.window.Window this
    */
  inline def toggleMaximize(): IWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMaximize")().asInstanceOf[IWindow]
  
  /** [Method] Translates the passed page coordinates into left top css values for the element
    * @param x Number/Array The page x or an array containing [x, y]
    * @param y Number The page y, required if x is not an array
    * @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
    */
  inline def translatePoints(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("translatePoints")().asInstanceOf[Any]
  inline def translatePoints(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("translatePoints")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def translatePoints(x: Any, y: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePoints")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def translatePoints(x: Unit, y: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePoints")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
  inline def un(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def un(eventName: java.lang.String, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: java.lang.String, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: java.lang.String, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Navigates up the ownership hierarchy searching for an ancestor Container which matches any passed simple selector or
    * @param selector String/Ext.Component The simple selector component or actual component to test. If not passed the immediate owner/activater is returned.
    * @param limit String/Number/Ext.Component This may be a selector upon which to stop the upward scan, or a limit of teh number of steps, or Component reference to stop on.
    * @returns Ext.container.Container The matching ancestor Container (or undefined if no match was found).
    */
  inline def up(): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[typings.extjs.Ext.container.IContainer]
  inline def up(selector: Any): typings.extjs.Ext.container.IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.container.IContainer]
  inline def up(selector: Any, limit: Any): typings.extjs.Ext.container.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(selector.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.container.IContainer]
  inline def up(selector: Unit, limit: Any): typings.extjs.Ext.container.IContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(selector.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.container.IContainer]
  
  /** [Method] Update the content area of a component
    * @param htmlOrData String/Object If this component has been configured with a template via the tpl config then it will use this argument as data to populate the template. If this component was not configured with a template, the components content area will be updated via Ext.Element update.
    * @param loadScripts Boolean Only legitimate when using the html configuration.
    * @param callback Function Only legitimate when using the html configuration. Callback to execute when scripts have finished loading.
    */
  inline def update(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Unit]
  inline def update(htmlOrData: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def update(htmlOrData: Any, loadScripts: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any], loadScripts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(htmlOrData: Any, loadScripts: Boolean, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any], loadScripts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(htmlOrData: Any, loadScripts: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any], loadScripts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(htmlOrData: Unit, loadScripts: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any], loadScripts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(htmlOrData: Unit, loadScripts: Boolean, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any], loadScripts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(htmlOrData: Unit, loadScripts: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(htmlOrData.asInstanceOf[js.Any], loadScripts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Sets the current box measurements of the component s underlying element
    * @param box Object An object in the format {x, y, width, height}
    * @returns Ext.Component this
    */
  inline def updateBox(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("updateBox")().asInstanceOf[IComponent]
  inline def updateBox(box: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("updateBox")(box.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Updates this component s layout
    * @param options Object An object with layout options.
    */
  inline def updateLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateLayout")().asInstanceOf[Unit]
  inline def updateLayout(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateLayout")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Updates a progress style message box s text and progress bar
    * @param value Number Any number between 0 and 1 (e.g., .5)
    * @param progressText String The progress text to display inside the progress bar.
    * @param msg String The message box's body text is replaced with the specified string (defaults to undefined so that any existing body text will not get overwritten by default unless a new value is passed in)
    * @returns Ext.window.MessageBox this
    */
  inline def updateProgress(): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")().asInstanceOf[IMessageBox]
  inline def updateProgress(value: Double): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  inline def updateProgress(value: Double, progressText: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def updateProgress(value: Double, progressText: java.lang.String, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def updateProgress(value: Double, progressText: Unit, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def updateProgress(value: Unit, progressText: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def updateProgress(value: Unit, progressText: java.lang.String, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def updateProgress(value: Unit, progressText: Unit, msg: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProgress")(value.asInstanceOf[js.Any], progressText.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  inline def wait(msg: java.lang.String): IMessageBox = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any]).asInstanceOf[IMessageBox]
  inline def wait(msg: java.lang.String, title: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def wait(msg: java.lang.String, title: java.lang.String, config: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def wait(msg: java.lang.String, title: Unit, config: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def wait(msg: Unit, title: java.lang.String): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def wait(msg: Unit, title: java.lang.String, config: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  inline def wait(msg: Unit, title: Unit, config: Any): IMessageBox = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[IMessageBox]
  
  /** [Property] (Ext.ZIndexManager) */
  @JSGlobal("Ext.MessageBox.zIndexManager")
  @js.native
  def zIndexManager: IZIndexManager = js.native
  inline def zIndexManager_=(x: IZIndexManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndexManager")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Container) */
  @JSGlobal("Ext.MessageBox.zIndexParent")
  @js.native
  def zIndexParent: typings.extjs.Ext.IContainer = js.native
  inline def zIndexParent_=(x: typings.extjs.Ext.IContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndexParent")(x.asInstanceOf[js.Any])
}
