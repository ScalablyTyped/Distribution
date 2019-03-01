package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeader extends js.Object {
  def setImageAltText(imageAltText: java.lang.String): CardHeader
  def setImageStyle(imageStyle: ImageStyle): CardHeader
  def setImageUrl(imageUrl: java.lang.String): CardHeader
  def setSubtitle(subtitle: java.lang.String): CardHeader
  def setTitle(title: java.lang.String): CardHeader
}

object CardHeader {
  @scala.inline
  def apply(
    setImageAltText: js.Function1[java.lang.String, CardHeader],
    setImageStyle: js.Function1[ImageStyle, CardHeader],
    setImageUrl: js.Function1[java.lang.String, CardHeader],
    setSubtitle: js.Function1[java.lang.String, CardHeader],
    setTitle: js.Function1[java.lang.String, CardHeader]
  ): CardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setImageAltText")(setImageAltText)
    __obj.updateDynamic("setImageStyle")(setImageStyle)
    __obj.updateDynamic("setImageUrl")(setImageUrl)
    __obj.updateDynamic("setSubtitle")(setSubtitle)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[CardHeader]
  }
}

