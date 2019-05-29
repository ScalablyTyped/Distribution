package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeExperiment extends js.Object {
  var colors: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var images: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var stylesheet: js.UndefOr[ExtensionURL] = js.undefined
}

object ThemeExperiment {
  @scala.inline
  def apply(
    colors: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    images: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    stylesheet: ExtensionURL = null
  ): ThemeExperiment = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (images != null) __obj.updateDynamic("images")(images)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    __obj.asInstanceOf[ThemeExperiment]
  }
}

