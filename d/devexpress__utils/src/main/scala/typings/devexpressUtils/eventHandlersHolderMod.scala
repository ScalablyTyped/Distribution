package typings.devexpressUtils

import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Element
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/class/event-handlers-holder", JSImport.Namespace)
@js.native
object eventHandlersHolderMod extends js.Object {
  
  @js.native
  class DomEventHandlersHolder () extends js.Object {
    
    def addListener(element: Document, eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListener(
      element: Document,
      eventName: String,
      handler: EventListenerOrEventListenerObject,
      options: Boolean
    ): Unit = js.native
    def addListener(
      element: Document,
      eventName: String,
      handler: EventListenerOrEventListenerObject,
      options: AddEventListenerOptions
    ): Unit = js.native
    def addListener(element: Element, eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListener(element: Element, eventName: String, handler: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addListener(
      element: Element,
      eventName: String,
      handler: EventListenerOrEventListenerObject,
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def addListenerToDocument(eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListenerToDocument(eventName: String, handler: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addListenerToDocument(eventName: String, handler: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def addListenerToWindow(eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListenerToWindow(eventName: String, handler: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addListenerToWindow(eventName: String, handler: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var handlers: js.Any = js.native
    
    def removeAllListeners(): Unit = js.native
  }
}
