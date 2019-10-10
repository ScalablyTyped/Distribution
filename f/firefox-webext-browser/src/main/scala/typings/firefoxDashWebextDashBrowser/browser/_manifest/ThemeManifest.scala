package typings.firefoxDashWebextDashBrowser.browser._manifest

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contents of manifest.json for a static theme */
trait ThemeManifest extends js.Object {
  var dark_theme: js.UndefOr[ThemeType] = js.undefined
  var default_locale: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[NumberDictionary[String]] = js.undefined
  var theme: ThemeType
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
}

object ThemeManifest {
  @scala.inline
  def apply(
    theme: ThemeType,
    dark_theme: ThemeType = null,
    default_locale: String = null,
    icons: NumberDictionary[String] = null,
    theme_experiment: ThemeExperiment = null
  ): ThemeManifest = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (dark_theme != null) __obj.updateDynamic("dark_theme")(dark_theme)
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (theme_experiment != null) __obj.updateDynamic("theme_experiment")(theme_experiment)
    __obj.asInstanceOf[ThemeManifest]
  }
}

