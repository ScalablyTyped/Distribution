package typings.firefoxDashWebextDashBrowser.browser._manifest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeExperiment extends js.Object {
  var colors: js.UndefOr[StringDictionary[String]] = js.undefined
  var images: js.UndefOr[StringDictionary[String]] = js.undefined
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  var stylesheet: js.UndefOr[ExtensionURL] = js.undefined
}

object ThemeExperiment {
  @scala.inline
  def apply(
    colors: StringDictionary[String] = null,
    images: StringDictionary[String] = null,
    properties: StringDictionary[String] = null,
    stylesheet: ExtensionURL = null
  ): ThemeExperiment = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeExperiment]
  }
}

