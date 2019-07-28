package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "BucketsApi")
@js.native
class BucketsApi () extends js.Object {
  def createBucket(postBuckets: js.Object, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def deleteBucket(bucketKey: String, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getBucketDetails(bucketKey: String, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getBuckets(options: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

