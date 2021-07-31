package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBackendbucketsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the BackendBucket resource to return.
    */
  var backendBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceBackendbucketsGet {
  
  @scala.inline
  def apply(): ParamsResourceBackendbucketsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBackendbucketsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceBackendbucketsGetMutableBuilder[Self <: ParamsResourceBackendbucketsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBackendBucket(value: String): Self = StObject.set(x, "backendBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendBucketUndefined: Self = StObject.set(x, "backendBucket", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
