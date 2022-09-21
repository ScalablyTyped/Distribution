package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetBase extends StObject {
  
  def _off(element: JQuery): Any = js.native
  def _off(element: JQuery, eventName: String): Any = js.native
  def _off(
    element: JQuery,
    eventName: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _off(element: JQuery, eventType: String, selector: String): Any = js.native
  def _off(
    element: JQuery,
    eventType: String,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _off(
    element: JQuery,
    eventType: String,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _off(element: JQuery, eventType: Unit, selector: String): Any = js.native
  def _off(
    element: JQuery,
    eventType: Unit,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _off(
    element: JQuery,
    eventType: Unit,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  
  def _on(element: JQuery): Any = js.native
  def _on(element: JQuery, eventType: String): Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _on(element: JQuery, eventType: String, selector: String): Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _on(element: JQuery, eventType: Unit, handler: js.Function1[/* eventObject */ JQueryEventObject, Any]): Any = js.native
  def _on(element: JQuery, eventType: Unit, selector: String): Any = js.native
  def _on(
    element: JQuery,
    eventType: Unit,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  def _on(
    element: JQuery,
    eventType: Unit,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, Any]
  ): Any = js.native
  
  def _trigger(): Any = js.native
  def _trigger(eventName: String): Any = js.native
  def _trigger(eventName: String, eventProp: Any): Any = js.native
  def _trigger(eventName: Unit, eventProp: Any): Any = js.native
  
  def destroy(): Unit = js.native
  
  var element: JQuery = js.native
  
  def option(): Any = js.native
  def option(prop: Any): Any = js.native
  def option(prop: Any, value: Any): Any = js.native
  def option(prop: Any, value: Any, forceSet: Boolean): Any = js.native
  def option(prop: Any, value: Unit, forceSet: Boolean): Any = js.native
  def option(prop: Unit, value: Any): Any = js.native
  def option(prop: Unit, value: Any, forceSet: Boolean): Any = js.native
  def option(prop: Unit, value: Unit, forceSet: Boolean): Any = js.native
  
  def persistState(): Unit = js.native
  
  def restoreState(silent: Boolean): Unit = js.native
  
  def setModel(options: Any): Any = js.native
  def setModel(options: Any, forceSet: Boolean): Any = js.native
}
