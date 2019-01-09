package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[
    gestaltLib.gestaltLibStrings.`current-password` | gestaltLib.gestaltLibStrings.on | gestaltLib.gestaltLibStrings.off | gestaltLib.gestaltLibStrings.username
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var idealErrorDirection: js.UndefOr[
    gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventValueElement, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventValueElement, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    gestaltLib.gestaltLibStrings.date | gestaltLib.gestaltLibStrings.email | gestaltLib.gestaltLibStrings.number | gestaltLib.gestaltLibStrings.password | gestaltLib.gestaltLibStrings.text | gestaltLib.gestaltLibStrings.url
  ] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_EventValue): scala.Unit
}

