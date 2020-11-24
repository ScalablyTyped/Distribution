package typings.forgeApis.mod

import typings.forgeApis.anon.Limit
import typings.forgeApis.anon.XAdsRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "BucketsApi")
@js.native
class BucketsApi () extends js.Object {
  
  /**
    * Use this endpoint to create a bucket. Buckets are arbitrary spaces created and owned by applications.
    * Bucket keys are globally unique across all regions, regardless of where they were created, and they
    * cannot be changed. The application creating the bucket is the owner of the bucket.
    */
  def createBucket(
    postBuckets: PostBucketsPayload,
    opts: XAdsRegion,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * This endpoint will delete a bucket.
    */
  def deleteBucket(bucketKey: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * This endpoint will return the details of a bucket.
    */
  def getBucketDetails(bucketKey: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * This endpoint will return the buckets owned by the application. This endpoint supports pagination.
    */
  def getBuckets(opts: Limit, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
