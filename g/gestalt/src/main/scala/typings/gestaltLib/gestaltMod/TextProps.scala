package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var align: js.UndefOr[
    gestaltLib.gestaltLibStrings.left | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.center | gestaltLib.gestaltLibStrings.justify
  ] = js.undefined
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var color: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.eggplant | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.green | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.maroon | gestaltLib.gestaltLibStrings.midnight | gestaltLib.gestaltLibStrings.navy | gestaltLib.gestaltLibStrings.olive | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.orchid | gestaltLib.gestaltLibStrings.pine | gestaltLib.gestaltLibStrings.purple | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.watermelon | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
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

object TextProps {
  @scala.inline
  def apply(
    align: gestaltLib.gestaltLibStrings.left | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.center | gestaltLib.gestaltLibStrings.justify = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.eggplant | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.green | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.maroon | gestaltLib.gestaltLibStrings.midnight | gestaltLib.gestaltLibStrings.navy | gestaltLib.gestaltLibStrings.olive | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.orchid | gestaltLib.gestaltLibStrings.pine | gestaltLib.gestaltLibStrings.purple | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.watermelon | gestaltLib.gestaltLibStrings.white = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    lgSize: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    mdSize: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    overflow: gestaltLib.gestaltLibStrings.normal | gestaltLib.gestaltLibStrings.breakWord = null,
    size: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    smSize: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl = null,
    truncate: js.UndefOr[scala.Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (lgSize != null) __obj.updateDynamic("lgSize")(lgSize.asInstanceOf[js.Any])
    if (mdSize != null) __obj.updateDynamic("mdSize")(mdSize.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (smSize != null) __obj.updateDynamic("smSize")(smSize.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[TextProps]
  }
}

