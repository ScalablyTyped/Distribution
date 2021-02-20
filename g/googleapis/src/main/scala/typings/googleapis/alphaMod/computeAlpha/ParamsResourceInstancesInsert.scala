package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceInstancesInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.native
  
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
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * Specifies instance template to create the instance.  This field is
    * optional. It can be a full or partial URL. For example, the following are
    * all valid URLs to an instance template:   -
    * https://www.googleapis.com/compute/v1/projects/project/global/instanceTemplates/instanceTemplate
    * - projects/project/global/instanceTemplates/instanceTemplate  -
    * global/instanceTemplates/instanceTemplate
    */
  var sourceInstanceTemplate: js.UndefOr[String] = js.native
  
  /**
    * Specifies instance machine to create the instance.  This field is
    * optional. It can be a full or partial URL. For example, the following are
    * all valid URLs to an instance template:   -
    * https://www.googleapis.com/compute/v1/projects/project/global/global/machineImages/machineImage
    * - projects/project/global/global/machineImages/machineImage  -
    * global/machineImages/machineImage
    */
  var sourceMachineImage: js.UndefOr[String] = js.native
  
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.native
}
object ParamsResourceInstancesInsert {
  
  @scala.inline
  def apply(): ParamsResourceInstancesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancesInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceInstancesInsertMutableBuilder[Self <: ParamsResourceInstancesInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaInstance): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setSourceInstanceTemplate(value: String): Self = StObject.set(x, "sourceInstanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInstanceTemplateUndefined: Self = StObject.set(x, "sourceInstanceTemplate", js.undefined)
    
    @scala.inline
    def setSourceMachineImage(value: String): Self = StObject.set(x, "sourceMachineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMachineImageUndefined: Self = StObject.set(x, "sourceMachineImage", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
