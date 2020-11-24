package typings.forgeApis.mod

import typings.forgeApis.anon.FilterDirection
import typings.forgeApis.anon.FilterId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "VersionsApi")
@js.native
class VersionsApi () extends js.Object {
  
  /**
    * Returns the version with the given `version_id`.
    */
  def getVersion(projectId: String, versionId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the item the given version is associated with.
    */
  def getVersionItem(projectId: String, versionId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the resources (`items`, `folders`, and `versions`) which have a custom relationship with the given `version_id`.
    * Custom relationships can be established between a version of an item and other resources within the 'data' domain service
    * (folders, items, and versions).
    */
  def getVersionRefs(
    projectId: String,
    versionId: String,
    opts: FilterId,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the custom relationships that are associated to the given `version_id`. Custom relationships can be established between
    * a version of an item and other resources within the 'data' domain service (folders, items, and versions).
    */
  def getVersionRelationshipsRefs(
    projectId: String,
    versionId: String,
    opts: FilterDirection,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a new version of an item in the 'data' domain service.
    */
  def postVersion(projectId: String, body: CreateVersion, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates a new version of an item in the 'data' domain service.
    */
  def postVersionRelationshipsRef(
    projectId: String,
    versionId: String,
    body: CreateRef,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
}
