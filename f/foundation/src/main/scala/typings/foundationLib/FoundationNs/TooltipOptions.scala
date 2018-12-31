package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var additional_inheritable_classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var append_to: js.UndefOr[java.lang.String] = js.undefined
  var disable_for_touch: js.UndefOr[scala.Boolean] = js.undefined
  var hover_delay: js.UndefOr[scala.Double] = js.undefined
  var show_on: js.UndefOr[java.lang.String] = js.undefined
  var tip_template: js.UndefOr[
    js.Function2[/* selector */ java.lang.String, /* content */ java.lang.String, java.lang.String]
  ] = js.undefined
  var tooltip_class: js.UndefOr[java.lang.String] = js.undefined
  var touch_close_text: js.UndefOr[java.lang.String] = js.undefined
}

