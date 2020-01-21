package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Get or sets an object that indicates the options to map the cards to the collapsible area.
    * @Default {Object}
    */
  var collapsibleCards: js.UndefOr[FieldsCollapsibleCards] = js.undefined
  /** To customize the card has been Mapped into card color field.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Content field has been Mapped into card text.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.undefined
  /** ImageUrl field has been Mapped into card image.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** The primarykey field is mapped to data source field. And this will used for Drag and drop and editing mainly.
    * @Default {null}
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** Priority field has been mapped data source field to maintain cards priority.
    * @Default {null}
    */
  var priority: js.UndefOr[String] = js.undefined
  /** To enable swimlane grouping based on the given key field from datasource mapping.
    * @Default {null}
    */
  var swimlaneKey: js.UndefOr[String] = js.undefined
  /** Tag field has been Mapped into card tag.
    * @Default {null}
    */
  var tag: js.UndefOr[String] = js.undefined
  /** Title field has been Mapped to field in datasource for title content. If title field specified , card expand/collapse will be enabled with header and content section.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    collapsibleCards: FieldsCollapsibleCards = null,
    color: String = null,
    content: String = null,
    imageUrl: String = null,
    primaryKey: String = null,
    priority: String = null,
    swimlaneKey: String = null,
    tag: String = null,
    title: String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (collapsibleCards != null) __obj.updateDynamic("collapsibleCards")(collapsibleCards.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (swimlaneKey != null) __obj.updateDynamic("swimlaneKey")(swimlaneKey.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

