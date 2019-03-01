package typings
package forgeDashApisLib.forgeDashApisMod.DmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketResponse extends js.Object {
  var bucketKey: java.lang.String
  var bucketOwner: java.lang.String
  var createdDate: scala.Double
  var permissions: js.Array[forgeDashApisLib.Anon_Access]
  var policyKey: java.lang.String
}

object BucketResponse {
  @scala.inline
  def apply(
    bucketKey: java.lang.String,
    bucketOwner: java.lang.String,
    createdDate: scala.Double,
    permissions: js.Array[forgeDashApisLib.Anon_Access],
    policyKey: java.lang.String
  ): BucketResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketKey")(bucketKey)
    __obj.updateDynamic("bucketOwner")(bucketOwner)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("permissions")(permissions)
    __obj.updateDynamic("policyKey")(policyKey)
    __obj.asInstanceOf[BucketResponse]
  }
}

