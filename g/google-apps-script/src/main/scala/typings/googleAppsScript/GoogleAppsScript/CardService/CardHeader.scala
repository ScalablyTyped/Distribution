package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The header of a Card.
  *
  *     var cardHeader = CardService.newCardHeader()
  *         .setTitle("Card header title")
  *         .setSubtitle("Card header subtitle")
  *         .setImageStyle(CardService.ImageStyle.CIRCLE)
  *         .setImageUrl("https://image.png");
  */
trait CardHeader extends js.Object {
  def setImageAltText(imageAltText: String): CardHeader
  def setImageStyle(imageStyle: ImageStyle): CardHeader
  def setImageUrl(imageUrl: String): CardHeader
  def setSubtitle(subtitle: String): CardHeader
  def setTitle(title: String): CardHeader
}

object CardHeader {
  @scala.inline
  def apply(
    setImageAltText: String => CardHeader,
    setImageStyle: ImageStyle => CardHeader,
    setImageUrl: String => CardHeader,
    setSubtitle: String => CardHeader,
    setTitle: String => CardHeader
  ): CardHeader = {
    val __obj = js.Dynamic.literal(setImageAltText = js.Any.fromFunction1(setImageAltText), setImageStyle = js.Any.fromFunction1(setImageStyle), setImageUrl = js.Any.fromFunction1(setImageUrl), setSubtitle = js.Any.fromFunction1(setSubtitle), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[CardHeader]
  }
}

