package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var accessibilityLevel: js.UndefOr[
    gestaltLib.gestaltLibNumbers.`1` | gestaltLib.gestaltLibNumbers.`2` | gestaltLib.gestaltLibNumbers.`3` | gestaltLib.gestaltLibNumbers.`4` | gestaltLib.gestaltLibNumbers.`5` | gestaltLib.gestaltLibNumbers.`6`
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var color: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.eggplant | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.green | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.maroon | gestaltLib.gestaltLibStrings.midnight | gestaltLib.gestaltLibStrings.navy | gestaltLib.gestaltLibStrings.olive | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.orchid | gestaltLib.gestaltLibStrings.pine | gestaltLib.gestaltLibStrings.purple | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.watermelon | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lgSize: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
  var mdSize: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
  var overflow: js.UndefOr[gestaltLib.gestaltLibStrings.normal | gestaltLib.gestaltLibStrings.breakWord] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
  var smSize: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl
  ] = js.undefined
  var truncate: js.UndefOr[scala.Boolean] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    accessibilityLevel: gestaltLib.gestaltLibNumbers.`1` | gestaltLib.gestaltLibNumbers.`2` | gestaltLib.gestaltLibNumbers.`3` | gestaltLib.gestaltLibNumbers.`4` | gestaltLib.gestaltLibNumbers.`5` | gestaltLib.gestaltLibNumbers.`6` = null,
    children: reactLib.reactMod.ReactNode = null,
    color: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.eggplant | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.green | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.maroon | gestaltLib.gestaltLibStrings.midnight | gestaltLib.gestaltLibStrings.navy | gestaltLib.gestaltLibStrings.olive | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.orchid | gestaltLib.gestaltLibStrings.pine | gestaltLib.gestaltLibStrings.purple | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.watermelon | gestaltLib.gestaltLibStrings.white = null,
    id: java.lang.String = null,
    lgSize: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    mdSize: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    overflow: gestaltLib.gestaltLibStrings.normal | gestaltLib.gestaltLibStrings.breakWord = null,
    size: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    smSize: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    truncate: js.UndefOr[scala.Boolean] = js.undefined
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLevel != null) __obj.updateDynamic("accessibilityLevel")(accessibilityLevel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lgSize != null) __obj.updateDynamic("lgSize")(lgSize.asInstanceOf[js.Any])
    if (mdSize != null) __obj.updateDynamic("mdSize")(mdSize.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (smSize != null) __obj.updateDynamic("smSize")(smSize.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[HeaderProps]
  }
}

