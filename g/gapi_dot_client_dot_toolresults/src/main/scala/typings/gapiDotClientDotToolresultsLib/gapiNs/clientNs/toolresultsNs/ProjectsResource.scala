package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var histories: HistoriesResource
  /**
    * Gets the Tool Results settings for a project.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read from project
    */
  def getSettings(request: gapiDotClientDotToolresultsLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ProjectSettings]
  /**
    * Creates resources for settings which have not yet been set.
    *
    * Currently, this creates a single resource: a Google Cloud Storage bucket, to be used as the default bucket for this project. The bucket is created in
    * an FTL-own storage project. Except for in rare cases, calling this method in parallel from multiple clients will only create a single bucket. In order
    * to avoid unnecessary storage charges, the bucket is configured to automatically delete objects older than 90 days.
    *
    * The bucket is created with the following permissions: - Owner access for owners of central storage project (FTL-owned) - Writer access for
    * owners/editors of customer project - Reader access for viewers of customer project The default ACL on objects created in the bucket is: - Owner access
    * for owners of central storage project - Reader access for owners/editors/viewers of customer project See Google Cloud Storage documentation for more
    * details.
    *
    * If there is already a default bucket set and the project can access the bucket, this call does nothing. However, if the project doesn't have the
    * permission to access the bucket or the bucket is deleted, a new bucket will be created.
    *
    * May return any canonical error codes, including the following:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - Any error code raised by Google Cloud Storage
    */
  def initializeSettings(request: gapiDotClientDotToolresultsLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ProjectSettings]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getSettings: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProjectSettings]
    ],
    histories: HistoriesResource,
    initializeSettings: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProjectSettings]
    ]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getSettings = getSettings, histories = histories, initializeSettings = initializeSettings)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

