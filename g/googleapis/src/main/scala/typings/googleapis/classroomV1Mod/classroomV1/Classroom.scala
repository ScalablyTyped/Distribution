package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Classroom")
@js.native
open class Classroom protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var courses: ResourceCourses = js.native
  
  var invitations: ResourceInvitations = js.native
  
  var registrations: ResourceRegistrations = js.native
  
  var userProfiles: ResourceUserprofiles = js.native
}
