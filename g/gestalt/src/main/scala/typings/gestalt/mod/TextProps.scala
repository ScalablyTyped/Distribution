package typings.gestalt.mod

import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.bold
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.eggplant
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.green
import typings.gestalt.gestaltStrings.justify
import typings.gestalt.gestaltStrings.left
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
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.short
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.tall
import typings.gestalt.gestaltStrings.watermelon
import typings.gestalt.gestaltStrings.white
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var align: js.UndefOr[left | right | center | justify] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var leading: js.UndefOr[short | tall] = js.undefined
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var weight: js.UndefOr[bold | normal] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    align: left | right | center | justify = null,
    children: ReactNode = null,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    leading: short | tall = null,
    overflow: normal | breakWord = null,
    size: sm | md | lg = null,
    truncate: js.UndefOr[Boolean] = js.undefined,
    weight: bold | normal = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.get.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

