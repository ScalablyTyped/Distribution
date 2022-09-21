package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "CommandsApi")
@js.native
open class CommandsApi () extends StObject {
  def this(apiClient: Any) = this()
  
  /**
    * Checks if a user has permission to perform specified actions on specified resources.
    */
  def checkPermission(
    projectId: String,
    body: CommandsBodyObject,
    opts: js.Object,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Creates folders in BIM 360 Docs.
    */
  def createFolder(
    projectId: String,
    body: CommandsBodyObject,
    opts: js.Object,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Verifies whether a Collaboration for Revit (C4R) model needs to be published to BIM 360 Docs.
    */
  def getPublishModelJob(
    projectId: String,
    body: CommandsBodyObject,
    opts: js.Object,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Retrieves metadata for up to 50 specified items. For example, an item name, or the date it was created. It returns the tip (latest) version of the items.
    */
  def listItems(
    projectId: String,
    body: CommandsBodyObject,
    opts: js.Object,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Retrieves the custom relationships between specified versions of items and other resources in the data domain service
    */
  def listRefs(
    projectId: String,
    body: CommandsBodyObject,
    opts: js.Object,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Publishes the latest version of a Collaboration for Revit (C4R) model to BIM 360 Docs.
    */
  def publishModel(
    projectId: String,
    body: CommandsBodyObject,
    opts: js.Object,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
}
