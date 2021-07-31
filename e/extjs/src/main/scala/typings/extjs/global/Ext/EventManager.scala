package typings.extjs.global.Ext

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.EventManager")
@js.native
class EventManager ()
  extends StObject
     with typings.extjs.Ext.EventManager
/* static members */
object EventManager {
  
  @JSGlobal("Ext.EventManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Appends an event handler to an element
    * @param el String/Ext.Element/HTMLElement/Window The html element or id to assign the event handler to.
    * @param eventName String The name of the event to listen for.
    * @param handler Function/String The handler function the event invokes. A String parameter is assumed to be method name in scope object, or Element object if no scope is provided.
    * @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
    * @param options Object An object containing handler configuration properties. This may contain any of the following properties (See Ext.Element.addListener for examples of how to use these options.):
    */
  @scala.inline
  def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Get the id of the element
    * @param element HTMLElement/Ext.Element The element to get the id for.
    * @returns String id
    */
  @scala.inline
  def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
  @scala.inline
  def getId(element: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(element.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Indicates which event to use for getting key presses
    * @returns String The appropriate event name.
    */
  @scala.inline
  def getKeyEvent(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyEvent")().asInstanceOf[java.lang.String]
  
  /** [Method] Gets the x coordinate from the event
    * @param event Object The event
    * @returns Number The x coordinate
    */
  @scala.inline
  def getPageX(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageX")().asInstanceOf[Double]
  @scala.inline
  def getPageX(event: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageX")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Gets the x amp y coordinate from the event
    * @param event Object The event
    * @returns Number[] The x/y coordinate
    */
  @scala.inline
  def getPageXY(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageXY")().asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def getPageXY(event: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageXY")(event.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Gets the y coordinate from the event
    * @param event Object The event
    * @returns Number The y coordinate
    */
  @scala.inline
  def getPageY(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageY")().asInstanceOf[Double]
  @scala.inline
  def getPageY(event: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageY")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Gets the related target from the event
    * @param event Object The event
    * @returns HTMLElement The related target.
    */
  @scala.inline
  def getRelatedTarget(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelatedTarget")().asInstanceOf[HTMLElement]
  @scala.inline
  def getRelatedTarget(event: js.Any): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelatedTarget")(event.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /** [Method] Gets the target of the event
    * @param event Object The event
    * @returns HTMLElement target
    */
  @scala.inline
  def getTarget(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")().asInstanceOf[HTMLElement]
  @scala.inline
  def getTarget(event: js.Any): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(event.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.EventManager.idleEvent")
  @js.native
  def idleEvent: js.Any = js.native
  @scala.inline
  def idleEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idleEvent")(x.asInstanceOf[js.Any])
  
  /** [Method] Appends an event handler to an element
    * @param el String/Ext.Element/HTMLElement/Window The html element or id to assign the event handler to.
    * @param eventName String The name of the event to listen for.
    * @param handler Function/String The handler function the event invokes. A String parameter is assumed to be method name in scope object, or Element object if no scope is provided.
    * @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
    * @param options Object An object containing handler configuration properties. This may contain any of the following properties (See Ext.Element.addListener for examples of how to use these options.):
    */
  @scala.inline
  def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds a listener to be notified when the document is ready before onload and before images are loaded
    * @param fn Function The method the event invokes.
    * @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
    * @param options Object Options object as passed to Ext.Element.addListener.
    */
  @scala.inline
  def onDocumentReady(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")().asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onDocumentReady(fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 100 millisecon
    * @param fn Function The handler function the window resize event invokes.
    * @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
    * @param options Boolean Options object as passed to Ext.Element.addListener
    */
  @scala.inline
  def onWindowResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")().asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any, scope: js.Any, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any, scope: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: Unit, scope: js.Any, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: Unit, scope: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds a listener to be notified when the browser window is unloaded
    * @param fn Function The handler function the window unload event invokes.
    * @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
    * @param options Boolean Options object as passed to Ext.Element.addListener
    */
  @scala.inline
  def onWindowUnload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")().asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: js.Any, scope: js.Any, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: js.Any, scope: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: Unit, scope: js.Any, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowUnload(fn: Unit, scope: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowUnload")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This strategy has minimal benefits for Sencha solutions that build themselves ie  */
  @scala.inline
  def pollScroll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pollScroll")().asInstanceOf[Unit]
  
  /** [Method] Prevents the browsers default handling of the event
    * @param event Event The event to prevent the default
    */
  @scala.inline
  def preventDefault(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")().asInstanceOf[Unit]
  @scala.inline
  def preventDefault(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Recursively removes all previous added listeners from an element and its children
    * @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove all event handlers.
    * @param eventName String The name of the event.
    */
  @scala.inline
  def purgeElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeElement")().asInstanceOf[Unit]
  @scala.inline
  def purgeElement(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeElement")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def purgeElement(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("purgeElement")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def purgeElement(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("purgeElement")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes all event handers from an element
    * @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove all event handlers.
    */
  @scala.inline
  def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  @scala.inline
  def removeAll(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler from an element
    * @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove the listener.
    * @param eventName String The name of the event.
    * @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
    */
  @scala.inline
  def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes the passed window resize listener
    * @param fn Function The method the event invokes
    * @param scope Object The scope of handler
    */
  @scala.inline
  def removeResizeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeResizeListener")().asInstanceOf[Unit]
  @scala.inline
  def removeResizeListener(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeResizeListener")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeResizeListener(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeResizeListener")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeResizeListener(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeResizeListener")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes the passed window unload listener
    * @param fn Function The method the event invokes
    * @param scope Object The scope of handler
    */
  @scala.inline
  def removeUnloadListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUnloadListener")().asInstanceOf[Unit]
  @scala.inline
  def removeUnloadListener(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUnloadListener")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeUnloadListener(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUnloadListener")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeUnloadListener(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUnloadListener")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Stop the event preventDefault and stopPropagation
    * @param event Event The event to stop
    */
  @scala.inline
  def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
  @scala.inline
  def stopEvent(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Cancels bubbling of the event
    * @param event Event The event to stop bubbling.
    */
  @scala.inline
  def stopPropagation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")().asInstanceOf[Unit]
  @scala.inline
  def stopPropagation(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler from an element
    * @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove the listener.
    * @param eventName String The name of the event.
    * @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
    */
  @scala.inline
  def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
