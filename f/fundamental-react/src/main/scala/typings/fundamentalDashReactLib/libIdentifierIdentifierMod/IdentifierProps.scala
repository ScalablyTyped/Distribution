package typings
package fundamentalDashReactLib.libIdentifierIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Image URL. */
  var backgroundImageUrl: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Applies a background color. */
  var color: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`7` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`8` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`9`
  ] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  /* Localized text for label. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[IdentifierModifiers] = js.undefined
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
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    backgroundImageUrl: java.lang.String = null,
    className: java.lang.String = null,
    color: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`7` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`8` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`9` = null,
    glyph: java.lang.String = null,
    label: java.lang.String = null,
    modifier: IdentifierModifiers = null
  ): IdentifierProps = {
    val __obj = js.Dynamic.literal(size = size)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (label != null) __obj.updateDynamic("label")(label)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    __obj.asInstanceOf[IdentifierProps]
  }
}

