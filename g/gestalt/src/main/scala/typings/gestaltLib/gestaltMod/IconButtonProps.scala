package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IconButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[scala.Boolean] = js.undefined
  var accessibilityLabel: java.lang.String
  var bgColor: js.UndefOr[
    gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var icon: Icons
  var iconColor: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_Event, scala.Unit]] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
}

