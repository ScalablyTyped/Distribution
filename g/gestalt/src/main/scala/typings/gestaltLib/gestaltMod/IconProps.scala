package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var accessibilityLabel: java.lang.String
  var color: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.eggplant | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.green | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.maroon | gestaltLib.gestaltLibStrings.midnight | gestaltLib.gestaltLibStrings.navy | gestaltLib.gestaltLibStrings.olive | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.orchid | gestaltLib.gestaltLibStrings.pine | gestaltLib.gestaltLibStrings.purple | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.watermelon | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var dangerouslySetSvgPath: js.UndefOr[gestaltLib.Anon_Path] = js.undefined
  var icon: Icons
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    accessibilityLabel: java.lang.String,
    icon: Icons,
    color: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.eggplant | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.green | gestaltLib.gestaltLibStrings.lightGray | gestaltLib.gestaltLibStrings.maroon | gestaltLib.gestaltLibStrings.midnight | gestaltLib.gestaltLibStrings.navy | gestaltLib.gestaltLibStrings.olive | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.orchid | gestaltLib.gestaltLibStrings.pine | gestaltLib.gestaltLibStrings.purple | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.watermelon | gestaltLib.gestaltLibStrings.white = null,
    dangerouslySetSvgPath: gestaltLib.Anon_Path = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Double | java.lang.String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel, icon = icon)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

