package typings.gapiClientAnalytics.gapi.client.analytics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Map of attribute name and value for this column. */
  var attributes: js.UndefOr[Record[String, String]] = js.undefined
  /** Column id. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for Analytics column. */
  var kind: js.UndefOr[String] = js.undefined
}

object Column {
  @scala.inline
  def apply(attributes: Record[String, String] = null, id: String = null, kind: String = null): Column = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

