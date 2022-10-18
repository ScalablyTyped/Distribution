package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.DeleteCallback
import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketCallback extends DeleteCallback {
  
  def apply(err: js.Error, apiResponse: Metadata): Unit = js.native
  def apply(err: Null, apiResponse: Metadata): Unit = js.native
}
