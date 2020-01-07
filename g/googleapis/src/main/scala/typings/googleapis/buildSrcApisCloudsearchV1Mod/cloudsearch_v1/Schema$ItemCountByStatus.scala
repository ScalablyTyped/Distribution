package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ItemCountByStatus extends js.Object {
  /**
    * Number of items matching the status code.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Status of the items.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object Schema$ItemCountByStatus {
  @scala.inline
  def apply(count: String = null, statusCode: String = null): Schema$ItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ItemCountByStatus]
  }
}

