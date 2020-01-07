package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A card is a UI element that can contain UI widgets such as texts, images.
  */
@js.native
trait Schema$Card extends js.Object {
  /**
    * The actions of this card.
    */
  var cardActions: js.UndefOr[js.Array[Schema$CardAction]] = js.native
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[Schema$CardHeader] = js.native
  /**
    * Name of the card.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sections are separated by a line divider.
    */
  var sections: js.UndefOr[js.Array[Schema$Section]] = js.native
}

object Schema$Card {
  @scala.inline
  def apply(
    cardActions: js.Array[Schema$CardAction] = null,
    header: Schema$CardHeader = null,
    name: String = null,
    sections: js.Array[Schema$Section] = null
  ): Schema$Card = {
    val __obj = js.Dynamic.literal()
    if (cardActions != null) __obj.updateDynamic("cardActions")(cardActions.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Card]
  }
}

