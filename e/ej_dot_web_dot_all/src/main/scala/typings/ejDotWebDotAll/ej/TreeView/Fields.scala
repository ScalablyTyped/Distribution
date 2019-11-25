package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** It receives the child level or inner level data source such as Essential DataManager object and JSON object.
    */
  var child: js.UndefOr[js.Any] = js.undefined
  /** It receives Essential DataManager object and JSON object.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the node to be in expanded state.
    */
  var expanded: js.UndefOr[String] = js.undefined
  /** Its allow us to indicate whether the node has child or not in load on demand
    */
  var hasChild: js.UndefOr[String] = js.undefined
  /** Specifies the HTML Attributes to &quot;li&quot; item list.
    */
  var htmlAttribute: js.UndefOr[js.Any] = js.undefined
  /** Specifies the id to TreeView node items list.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Specifies the image attribute to â€œimgâ€ tag inside items list
    */
  var imageAttribute: js.UndefOr[js.Any] = js.undefined
  /** Specifies the HTML Attributes to &quot;li&quot; item list.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** If its true Checkbox node will be checked when rendered with checkbox.
    */
  var isChecked: js.UndefOr[String] = js.undefined
  /** Specifies the link attribute to â€œaâ€ tag in item list.
    */
  var linkAttribute: js.UndefOr[js.Any] = js.undefined
  /** Specifies the parent id of the node. The nodes are listed as child nodes of the specified parent node by using its parent id.
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** It receives query to retrieve data from the table (query is same as SQL).
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Allow us to specify the node to be in selected state
    */
  var selected: js.UndefOr[String] = js.undefined
  /** Specifies the sprite CSS class to &quot;li&quot; item list.
    */
  var spriteCssClass: js.UndefOr[String] = js.undefined
  /** It receives the table name to execute query on the corresponding table.
    */
  var tableName: js.UndefOr[String] = js.undefined
  /** Specifies the text of TreeView node items list.
    */
  var text: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    child: js.Any = null,
    dataSource: js.Any = null,
    expanded: String = null,
    hasChild: String = null,
    htmlAttribute: js.Any = null,
    id: String = null,
    imageAttribute: js.Any = null,
    imageUrl: String = null,
    isChecked: String = null,
    linkAttribute: js.Any = null,
    parentId: String = null,
    query: js.Any = null,
    selected: String = null,
    spriteCssClass: String = null,
    tableName: String = null,
    text: String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (hasChild != null) __obj.updateDynamic("hasChild")(hasChild.asInstanceOf[js.Any])
    if (htmlAttribute != null) __obj.updateDynamic("htmlAttribute")(htmlAttribute.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageAttribute != null) __obj.updateDynamic("imageAttribute")(imageAttribute.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (isChecked != null) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (linkAttribute != null) __obj.updateDynamic("linkAttribute")(linkAttribute.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

