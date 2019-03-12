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
    setImageAltText: java.lang.String => CardHeader,
    setImageStyle: ImageStyle => CardHeader,
    setImageUrl: java.lang.String => CardHeader,
    setSubtitle: java.lang.String => CardHeader,
    setTitle: java.lang.String => CardHeader
  ): CardHeader = {
    val __obj = js.Dynamic.literal(setImageAltText = js.Any.fromFunction1(setImageAltText), setImageStyle = js.Any.fromFunction1(setImageStyle), setImageUrl = js.Any.fromFunction1(setImageUrl), setSubtitle = js.Any.fromFunction1(setSubtitle), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[CardHeader]
  }
}

