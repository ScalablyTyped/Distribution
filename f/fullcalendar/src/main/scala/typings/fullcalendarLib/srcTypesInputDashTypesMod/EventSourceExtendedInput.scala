package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventSourceExtendedInput
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any]
     with EventOptionsBase {
  var allDayDefault: js.UndefOr[scala.Boolean] = js.undefined
  var endParam: js.UndefOr[java.lang.String] = js.undefined
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.undefined
  var events: js.UndefOr[EventSourceSimpleInput] = js.undefined
  var startParam: js.UndefOr[java.lang.String] = js.undefined
}

