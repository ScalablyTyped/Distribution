package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "BucketsApi")
@js.native
class BucketsApi () extends js.Object {
  def createBucket(postBuckets: js.Object, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def deleteBucket(bucketKey: java.lang.String, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getBucketDetails(bucketKey: java.lang.String, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getBuckets(options: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

