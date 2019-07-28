package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

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
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Column]
  }
}

