package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Used to group the popup list items.
    * @Default {null}
    */
  var groupBy: js.UndefOr[java.lang.String] = js.undefined
  /** Defines class for the item.
    * @Default {null}
    */
  var iconCss: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the specific field name in the data source to load the popup list with data.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the specific field name which contains unique values for the list items.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    groupBy: java.lang.String = null,
    iconCss: java.lang.String = null,
    text: java.lang.String = null,
    value: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy)
    if (iconCss != null) __obj.updateDynamic("iconCss")(iconCss)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Fields]
  }
}

