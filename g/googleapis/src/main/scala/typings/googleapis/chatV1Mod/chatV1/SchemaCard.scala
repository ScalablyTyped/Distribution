package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A card is a UI element that can contain UI widgets such as texts, images.
  */
@js.native
trait SchemaCard extends js.Object {
  /**
    * The actions of this card.
    */
  var cardActions: js.UndefOr[js.Array[SchemaCardAction]] = js.native
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[SchemaCardHeader] = js.native
  /**
    * Name of the card.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sections are separated by a line divider.
    */
  var sections: js.UndefOr[js.Array[SchemaSection]] = js.native
}

object SchemaCard {
  @scala.inline
  def apply(): SchemaCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCard]
  }
  @scala.inline
  implicit class SchemaCardOps[Self <: SchemaCard] (val x: Self) extends AnyVal {
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
    def setCardActionsVarargs(value: SchemaCardAction*): Self = this.set("cardActions", js.Array(value :_*))
    @scala.inline
    def setCardActions(value: js.Array[SchemaCardAction]): Self = this.set("cardActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardActions: Self = this.set("cardActions", js.undefined)
    @scala.inline
    def setHeader(value: SchemaCardHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSectionsVarargs(value: SchemaSection*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[SchemaSection]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
  }
  
}

