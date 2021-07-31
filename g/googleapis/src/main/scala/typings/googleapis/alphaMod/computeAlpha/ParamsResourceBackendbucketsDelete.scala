package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBackendbucketsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the BackendBucket resource to delete.
    */
  var backendBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID
    * so that if you must retry your request, the server will know to ignore
    * the request if it has already been completed.  For example, consider a
    * situation where you make an initial request and the request times out. If
    * you make the request again with the same request ID, the server can check
    * if original operation with the same request ID was received, and if so,
    * will ignore the second request. This prevents clients from accidentally
    * creating duplicate commitments.  The request ID must be a valid UUID with
    * the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBackendbucketsDelete {
  
  @scala.inline
  def apply(): ParamsResourceBackendbucketsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBackendbucketsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceBackendbucketsDeleteMutableBuilder[Self <: ParamsResourceBackendbucketsDelete] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
