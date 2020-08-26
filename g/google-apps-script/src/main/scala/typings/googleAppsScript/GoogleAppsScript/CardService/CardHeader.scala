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
@js.native
trait CardHeader extends js.Object {
  def setImageAltText(imageAltText: String): CardHeader = js.native
  def setImageStyle(imageStyle: ImageStyle): CardHeader = js.native
  def setImageUrl(imageUrl: String): CardHeader = js.native
  def setSubtitle(subtitle: String): CardHeader = js.native
  def setTitle(title: String): CardHeader = js.native
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
  @scala.inline
  implicit class CardHeaderOps[Self <: CardHeader] (val x: Self) extends AnyVal {
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
    def setSetImageAltText(value: String => CardHeader): Self = this.set("setImageAltText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImageStyle(value: ImageStyle => CardHeader): Self = this.set("setImageStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImageUrl(value: String => CardHeader): Self = this.set("setImageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubtitle(value: String => CardHeader): Self = this.set("setSubtitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => CardHeader): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

