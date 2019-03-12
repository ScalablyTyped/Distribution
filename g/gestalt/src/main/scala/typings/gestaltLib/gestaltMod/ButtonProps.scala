package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[scala.Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_Event, scala.Unit]] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg
  ] = js.undefined
  var text: java.lang.String
  var `type`: js.UndefOr[gestaltLib.gestaltLibStrings.submit | gestaltLib.gestaltLibStrings.button] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    accessibilityExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHaspopup: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    color: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.gray | gestaltLib.gestaltLibStrings.red | gestaltLib.gestaltLibStrings.transparent | gestaltLib.gestaltLibStrings.white = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onClick: /* args */ gestaltLib.Anon_Event => scala.Unit = null,
    size: gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg = null,
    `type`: gestaltLib.gestaltLibStrings.submit | gestaltLib.gestaltLibStrings.button = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded)
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

