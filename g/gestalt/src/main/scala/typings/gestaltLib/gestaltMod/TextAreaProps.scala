package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var idealErrorDirection: js.UndefOr[
    gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventValue, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventValue, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_EventValueSyntheticEvent): scala.Unit
}

