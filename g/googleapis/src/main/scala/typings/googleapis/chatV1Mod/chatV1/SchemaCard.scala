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
  def apply(
    cardActions: js.Array[SchemaCardAction] = null,
    header: SchemaCardHeader = null,
    name: String = null,
    sections: js.Array[SchemaSection] = null
  ): SchemaCard = {
    val __obj = js.Dynamic.literal()
    if (cardActions != null) __obj.updateDynamic("cardActions")(cardActions.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCard]
  }
}

