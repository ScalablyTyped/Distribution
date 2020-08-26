package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contents of manifest.json for a static theme */
@js.native
trait ThemeManifest extends js.Object {
  var dark_theme: js.UndefOr[ThemeType] = js.native
  var default_locale: js.UndefOr[String] = js.native
  var icons: js.UndefOr[NumberDictionary[String]] = js.native
  var theme: ThemeType = js.native
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.native
}

object ThemeManifest {
  @scala.inline
  def apply(theme: ThemeType): ThemeManifest = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeManifest]
  }
  @scala.inline
  implicit class ThemeManifestOps[Self <: ThemeManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTheme(value: ThemeType): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setDark_theme(value: ThemeType): Self = this.set("dark_theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark_theme: Self = this.set("dark_theme", js.undefined)
    @scala.inline
    def setDefault_locale(value: String): Self = this.set("default_locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_locale: Self = this.set("default_locale", js.undefined)
    @scala.inline
    def setIcons(value: NumberDictionary[String]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setTheme_experiment(value: ThemeExperiment): Self = this.set("theme_experiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_experiment: Self = this.set("theme_experiment", js.undefined)
  }
  
}

