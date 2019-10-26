package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "WorkItemsApi")
@js.native
class WorkItemsApi () extends js.Object {
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

