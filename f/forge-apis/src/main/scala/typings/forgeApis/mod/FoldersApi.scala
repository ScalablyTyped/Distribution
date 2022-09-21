package typings.forgeApis.mod

import typings.forgeApis.anon.FilterDirection
import typings.forgeApis.anon.FilterExtensionType
import typings.forgeApis.anon.FilterId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "FoldersApi")
@js.native
open class FoldersApi () extends StObject {
  def this(apiClient: Any) = this()
  
  /**
    * Returns the folder by ID for any folder within a given project. All folders or sub-folders within a project
    * are associated with their own unique ID, including the root folder.
    */
  def getFolder(projectId: String, folderId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns a collection of items and folders within a folder. Items represent word documents, fusion design files, drawings, spreadsheets, etc.
    */
  def getFolderContents(
    projectId: String,
    folderId: String,
    opts: FilterExtensionType,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the parent folder (if it exists). In a project, subfolders and resource items are stored under a folder except the root folder
    * which does not have a parent of its own.
    */
  def getFolderParent(projectId: String, folderId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the resources (`items`, `folders`, and `versions`) which have a custom relationship with the given `folder_id`. Custom relationships
    * can be established between a folder and other resources within the 'data' domain service (folders, items, and versions).
    */
  def getFolderRefs(
    projectId: String,
    folderId: String,
    opts: FilterId,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the custom relationships that are associated to the given `folder_id`. Custom relationships can be established between a folder and
    * other resources within the 'data' domain service (folders, items, and versions).
    */
  def getFolderRelationshipsRefs(
    projectId: String,
    folderId: String,
    opts: FilterDirection,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a new folder in the `data` domain service.
    */
  def postFolder(projectId: String, body: CreateFolder, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a custom relationship between a folder and another resource within the 'data' domain service (folder, item, or version).
    */
  def postFolderRelationshipsRef(
    projectId: String,
    folderId: String,
    body: CreateRef,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
}
