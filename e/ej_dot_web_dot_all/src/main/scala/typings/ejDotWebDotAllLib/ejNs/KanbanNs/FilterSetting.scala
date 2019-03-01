package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSetting extends js.Object {
  /** Gets or sets an object of tooltip to filter buttons.
    * @Default {null}
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets an object that Queries to perform filtering
    * @Default {Object}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets an object of display name to filter queries.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object FilterSetting {
  @scala.inline
  def apply(description: java.lang.String = null, query: js.Any = null, text: java.lang.String = null): FilterSetting = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (query != null) __obj.updateDynamic("query")(query)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FilterSetting]
  }
}

