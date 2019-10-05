package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WidgetBase")
@js.native
class WidgetBase () extends js.Object {
  var element: JQuery = js.native
  def _off(element: JQuery): js.Any = js.native
  def _off(element: JQuery, eventName: String): js.Any = js.native
  def _off(element: JQuery, eventName: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): js.Any = js.native
  def _off(element: JQuery, eventType: String, selector: String): js.Any = js.native
  def _off(
    element: JQuery,
    eventType: String,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): js.Any = js.native
  def _on(element: JQuery): js.Any = js.native
  def _on(element: JQuery, eventType: String): js.Any = js.native
  def _on(element: JQuery, eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): js.Any = js.native
  def _on(element: JQuery, eventType: String, selector: String): js.Any = js.native
  def _on(
    element: JQuery,
    eventType: String,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): js.Any = js.native
  def _trigger(): js.Any = js.native
  def _trigger(eventName: String): js.Any = js.native
  def _trigger(eventName: String, eventProp: js.Any): js.Any = js.native
  def destroy(): Unit = js.native
  def option(): js.Any = js.native
  def option(prop: js.Any): js.Any = js.native
  def option(prop: js.Any, value: js.Any): js.Any = js.native
  def option(prop: js.Any, value: js.Any, forceSet: Boolean): js.Any = js.native
  def persistState(): Unit = js.native
  def restoreState(silent: Boolean): Unit = js.native
  def setModel(options: js.Any): js.Any = js.native
  def setModel(options: js.Any, forceSet: Boolean): js.Any = js.native
}

