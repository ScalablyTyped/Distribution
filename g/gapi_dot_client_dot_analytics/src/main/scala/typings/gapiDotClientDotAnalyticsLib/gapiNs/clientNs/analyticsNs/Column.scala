package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Map of attribute name and value for this column. */
  var attributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Column id. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics column. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    attributes: stdLib.Record[java.lang.String, java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Column]
  }
}

