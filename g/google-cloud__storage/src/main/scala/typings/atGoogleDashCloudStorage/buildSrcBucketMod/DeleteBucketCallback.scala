package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.DeleteCallback
import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketCallback extends DeleteCallback {
  def apply(err: Null, apiResponse: Metadata): Unit = js.native
  def apply(err: Error, apiResponse: Metadata): Unit = js.native
}

