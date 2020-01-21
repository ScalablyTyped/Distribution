package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSetting extends js.Object {
  /** Gets or sets an object of tooltip to filter buttons.
    * @Default {null}
    */
  var description: js.UndefOr[String] = js.undefined
  /** Gets or sets an object that Queries to perform filtering
    * @Default {Object}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets an object of display name to filter queries.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
}

object FilterSetting {
  @scala.inline
  def apply(description: String = null, query: js.Any = null, text: String = null): FilterSetting = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSetting]
  }
}

