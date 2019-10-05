package typings.forgeDashApis.forgeDashApisMod.Dm

import typings.forgeDashApis.Anon_Access
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketResponse extends js.Object {
  var bucketKey: String
  var bucketOwner: String
  var createdDate: Double
  var permissions: js.Array[Anon_Access]
  var policyKey: String
}

object BucketResponse {
  @scala.inline
  def apply(
    bucketKey: String,
    bucketOwner: String,
    createdDate: Double,
    permissions: js.Array[Anon_Access],
    policyKey: String
  ): BucketResponse = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey, bucketOwner = bucketOwner, createdDate = createdDate, permissions = permissions, policyKey = policyKey)
  
    __obj.asInstanceOf[BucketResponse]
  }
}

