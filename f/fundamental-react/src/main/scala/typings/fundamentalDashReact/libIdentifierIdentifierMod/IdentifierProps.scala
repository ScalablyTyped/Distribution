package typings.fundamentalDashReact.libIdentifierIdentifierMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`1`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`7`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`8`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierProps
  extends /* x */ StringDictionary[js.Any] {
  /* Image URL. */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* Applies a background color. */
  var color: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  /* Localized text for label. */
  var label: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[IdentifierModifiers] = js.undefined
  /* Applies an aria-role. Set to button if Identifier opens a Popover or Modal. */
  var role: js.UndefOr[String] = js.undefined
  /* Size of the image. These sizes are available:
    **xxs** (extra extra small) - 20px,
    **xs** (extra small) - 28px,
    **s** (small) - 32px,
    **m** (medium) - 48px,
    **l** (large) - 64px,
    **xl** (extra lagre) - 88px,
    and **xxl** (extra extra large).
    Default matches the base font size (14px). */
  var size: IdentifierSizes
}

object IdentifierProps {
  @scala.inline
  def apply(
    size: IdentifierSizes,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    backgroundImageUrl: String = null,
    className: String = null,
    color: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    label: String = null,
    modifier: IdentifierModifiers = null,
    role: String = null
  ): IdentifierProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierProps]
  }
}

