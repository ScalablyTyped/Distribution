package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaItemCountByStatus extends js.Object {
  /**
    * Number of items matching the status code.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Status of the items.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object SchemaItemCountByStatus {
  @scala.inline
  def apply(count: String = null, statusCode: String = null): SchemaItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemCountByStatus]
  }
}

