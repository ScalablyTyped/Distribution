package typings.ejDotWebDotAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Used to group the suggestion list items.
    */
  var groupBy: js.UndefOr[String] = js.undefined
  /** Defines the HTML attributes such as id, class, styles for the item.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the specific field name which contains unique key values for the list items.
    */
  var key: js.UndefOr[String] = js.undefined
  /** Defines the specific field name in the data source to load the suggestion list with data.
    */
  var text: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(groupBy: String = null, htmlAttributes: js.Any = null, key: String = null, text: String = null): Fields = {
    val __obj = js.Dynamic.literal()
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (key != null) __obj.updateDynamic("key")(key)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Fields]
  }
}

