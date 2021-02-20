package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "WorkItemsApi")
@js.native
class WorkItemsApi () extends StObject {
  
  /**
    * Creates a new WorkItem.
    */
  def createWorkItem(workItem: WorkItem, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Removes a specific WorkItem.
    */
  def deleteWorkItem(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the details of all WorkItems.
    */
  def getAllWorkItems(skip: Double, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the details of a specific WorkItem.
    */
  def getWorkItem(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
