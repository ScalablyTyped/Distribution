package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "ActivitiesApi")
@js.native
class ActivitiesApi () extends js.Object {
  
  /**
    * Creates a new Activity.
    */
  def createActivity(activity: Activity, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Removes a specific Activity.
    */
  def deleteActivity(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Removes the version history of the specified Activity.
    */
  def deleteActivityHistory(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the details of a specific Activity.
    */
  def getActivity(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns all old versions of a specified Activity.
    */
  def getActivityVersions(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the details of all Activities.
    */
  def getAllActivities(oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Updates an Activity by specifying only the changed attributes.
    */
  def patchActivity(id: String, activity: ActivityOptional, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Sets the Activity to the specified version.
    */
  def setActivityVersion(id: String, activity: ActivityOptional, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
