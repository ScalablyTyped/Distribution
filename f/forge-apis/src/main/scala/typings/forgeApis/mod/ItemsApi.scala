package typings.forgeApis.mod

import typings.forgeApis.anon.FilterId
import typings.forgeApis.anon.FilterRefType
import typings.forgeApis.anon.FilterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "ItemsApi")
@js.native
class ItemsApi () extends StObject {
  
  /**
    * Returns a resource item by ID for any item within a given project. Resource items represent word documents, fusion design files, drawings, spreadsheets, etc.
    */
  def getItem(projectId: String, itemId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the 'parent' folder for the given item.
    */
  def getItemParentFolder(projectId: String, itemId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the resources (`items`, `folders`, and `versions`) which have a custom relationship with the given `item_id`. Custom relationships
    * can be established between an item and other resources within the 'data' domain service (folders, items, and versions).
    */
  def getItemRefs(
    projectId: String,
    itemId: String,
    opts: FilterId,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the custom relationships that are associated to the given `item_id`. Custom relationships can be established between an item and
    * other resources within the 'data' domain service (folders, items, and versions).
    */
  def getItemRelationshipsRefs(
    projectId: String,
    itemId: String,
    opts: FilterRefType,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the 'tip' version for the given item. Multiple versions of a resource item can be uploaded in a project. The tip version is the most recent one.
    */
  def getItemTip(projectId: String, itemId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns versions for the given item. Multiple versions of a resource item can be uploaded in a project.
    */
  def getItemVersions(
    projectId: String,
    itemId: String,
    opts: FilterType,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a new item in the 'data' domain service.
    */
  def postItem(projectId: String, body: CreateItem, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a custom relationship between an item and another resource within the 'data' domain service (folder, item, or version).
    */
  def postItemRelationshipsRef(
    projectId: String,
    itemId: String,
    body: CreateRef,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
}
