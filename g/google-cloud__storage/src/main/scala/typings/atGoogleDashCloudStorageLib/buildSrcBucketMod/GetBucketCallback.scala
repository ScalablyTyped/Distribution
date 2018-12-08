package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketCallback
  extends atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.InstanceResponseCallback {
  def apply(
    err: atGoogleDashCloudCommonLib.commonMod.ApiError,
    bucket: Bucket,
    apiResponse: requestLib.requestMod.requestNs.Response
  ): scala.Unit = js.native
  def apply(
    err: atGoogleDashCloudCommonLib.commonMod.ApiError,
    bucket: scala.Null,
    apiResponse: requestLib.requestMod.requestNs.Response
  ): scala.Unit = js.native
  def apply(err: scala.Null, bucket: Bucket, apiResponse: requestLib.requestMod.requestNs.Response): scala.Unit = js.native
  def apply(err: scala.Null, bucket: scala.Null, apiResponse: requestLib.requestMod.requestNs.Response): scala.Unit = js.native
}

