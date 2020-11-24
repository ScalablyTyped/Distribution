package typings.googleCloudStorage.bucketMod

import typings.googleCloudCommon.serviceObjectMod.DeleteCallback
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketCallback extends DeleteCallback {
  
  def apply(err: Null, apiResponse: Metadata): Unit = js.native
  def apply(err: Error, apiResponse: Metadata): Unit = js.native
}
