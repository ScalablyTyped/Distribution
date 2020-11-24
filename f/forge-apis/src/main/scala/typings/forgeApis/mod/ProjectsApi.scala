package typings.forgeApis.mod

import typings.forgeApis.anon.FilterExtensionTypeFilterId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "ProjectsApi")
@js.native
class ProjectsApi () extends js.Object {
  
  /**
    * Returns a collection of projects for a given `hub_id`. A project represents an A360 project or a BIM 360 project which
    * is set up under an A360 hub or BIM 360 account, respectively. Within a hub or an account, multiple projects can be
    * created to be used.
    */
  def getHubProjects(hubId: String, opts: FilterExtensionTypeFilterId, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns a project for a given `project_id`.
    */
  def getProject(hubId: String, projectId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the hub for a given `project_id`.
    */
  def getProjectHub(hubId: String, projectId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the details of the highest level folders the user has access to for a given project.
    */
  def getProjectTopFolders(hubId: String, projectId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a storage location in the OSS where data can be uploaded to.
    */
  def postStorage(projectId: String, body: CreateStorage, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
