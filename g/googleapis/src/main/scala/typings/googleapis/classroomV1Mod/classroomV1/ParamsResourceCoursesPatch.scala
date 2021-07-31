package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Identifier of the course to update. This identifier can be either the
    * Classroom-assigned identifier or an alias.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCourse] = js.undefined
  
  /**
    * Mask that identifies which fields on the course to update. This field is
    * required to do an update. The update will fail if invalid fields are
    * specified. The following fields are valid:  * `name` * `section` *
    * `descriptionHeading` * `description` * `room` * `courseState` * `ownerId`
    * Note: patches to ownerId are treated as being effective immediately, but
    * in practice it may take some time for the ownership transfer of all
    * affected resources to complete.  When set in a query parameter, this
    * field should be specified as  `updateMask=<field1>,<field2>,...`
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesPatch {
  
  @scala.inline
  def apply(): ParamsResourceCoursesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceCoursesPatchMutableBuilder[Self <: ParamsResourceCoursesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCourse): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
