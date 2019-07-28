package typings.gestalt.gestaltMod

import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.eggplant
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.green
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.maroon
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.midnight
import typings.gestalt.gestaltStrings.navy
import typings.gestalt.gestaltStrings.normal
import typings.gestalt.gestaltStrings.olive
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.orchid
import typings.gestalt.gestaltStrings.pine
import typings.gestalt.gestaltStrings.purple
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.watermelon
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var accessibilityLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lgSize: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var mdSize: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var smSize: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    accessibilityLevel: `1` | `2` | `3` | `4` | `5` | `6` = null,
    children: ReactNode = null,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    id: String = null,
    lgSize: xs | sm | md | lg | xl = null,
    mdSize: xs | sm | md | lg | xl = null,
    overflow: normal | breakWord = null,
    size: xs | sm | md | lg | xl = null,
    smSize: xs | sm | md | lg | xl = null,
    truncate: js.UndefOr[Boolean] = js.undefined
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

