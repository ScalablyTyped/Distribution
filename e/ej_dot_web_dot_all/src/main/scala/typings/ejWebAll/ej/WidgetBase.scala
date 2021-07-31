package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetBase extends StObject {
  
  def _off(element: JQuery): js.Any = js.native
  def _off(element: JQuery, eventName: String): js.Any = js.native
  def _off(
    element: JQuery,
    eventName: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _off(element: JQuery, eventType: String, selector: String): js.Any = js.native
  def _off(
    element: JQuery,
    eventType: String,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _off(
    element: JQuery,
    eventType: String,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _off(element: JQuery, eventType: Unit, selector: String): js.Any = js.native
  def _off(
    element: JQuery,
    eventType: Unit,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _off(
    element: JQuery,
    eventType: Unit,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  
  def _on(element: JQuery): js.Any = js.native
  def _on(element: JQuery, eventType: String): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _on(element: JQuery, eventType: String, selector: String): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _on(element: JQuery, eventType: Unit, selector: String): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: Unit,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: Unit,
    selector: Unit,
    handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]
  ): js.Any = js.native
  
  def _trigger(): js.Any = js.native
  def _trigger(eventName: String): js.Any = js.native
  def _trigger(eventName: String, eventProp: js.Any): js.Any = js.native
  def _trigger(eventName: Unit, eventProp: js.Any): js.Any = js.native
  
  def destroy(): Unit = js.native
  
  var element: JQuery = js.native
  
  def option(): js.Any = js.native
  def option(prop: js.Any): js.Any = js.native
  def option(prop: js.Any, value: js.Any): js.Any = js.native
  def option(prop: js.Any, value: js.Any, forceSet: Boolean): js.Any = js.native
  def option(prop: js.Any, value: Unit, forceSet: Boolean): js.Any = js.native
  def option(prop: Unit, value: js.Any): js.Any = js.native
  def option(prop: Unit, value: js.Any, forceSet: Boolean): js.Any = js.native
  def option(prop: Unit, value: Unit, forceSet: Boolean): js.Any = js.native
  
  def persistState(): Unit = js.native
  
  def restoreState(silent: Boolean): Unit = js.native
  
  def setModel(options: js.Any): js.Any = js.native
  def setModel(options: js.Any, forceSet: Boolean): js.Any = js.native
}
