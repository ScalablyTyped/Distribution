package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WidgetBase")
@js.native
class WidgetBase () extends js.Object {
  var element: ejDotWebDotAllLib.JQuery = js.native
  def _off(element: ejDotWebDotAllLib.JQuery): js.Any = js.native
  def _off(element: ejDotWebDotAllLib.JQuery, eventName: java.lang.String): js.Any = js.native
  def _off(
    element: ejDotWebDotAllLib.JQuery,
    eventName: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): js.Any = js.native
  def _off(element: ejDotWebDotAllLib.JQuery, eventType: java.lang.String, selector: java.lang.String): js.Any = js.native
  def _off(
    element: ejDotWebDotAllLib.JQuery,
    eventType: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): js.Any = js.native
  def _on(element: ejDotWebDotAllLib.JQuery): js.Any = js.native
  def _on(element: ejDotWebDotAllLib.JQuery, eventType: java.lang.String): js.Any = js.native
  def _on(
    element: ejDotWebDotAllLib.JQuery,
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): js.Any = js.native
  def _on(element: ejDotWebDotAllLib.JQuery, eventType: java.lang.String, selector: java.lang.String): js.Any = js.native
  def _on(
    element: ejDotWebDotAllLib.JQuery,
    eventType: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): js.Any = js.native
  def _trigger(): js.Any = js.native
  def _trigger(eventName: java.lang.String): js.Any = js.native
  def _trigger(eventName: java.lang.String, eventProp: js.Any): js.Any = js.native
  def destroy(): scala.Unit = js.native
  def option(): js.Any = js.native
  def option(prop: js.Any): js.Any = js.native
  def option(prop: js.Any, value: js.Any): js.Any = js.native
  def option(prop: js.Any, value: js.Any, forceSet: scala.Boolean): js.Any = js.native
  def persistState(): scala.Unit = js.native
  def restoreState(silent: scala.Boolean): scala.Unit = js.native
  def setModel(options: js.Any): js.Any = js.native
  def setModel(options: js.Any, forceSet: scala.Boolean): js.Any = js.native
}

