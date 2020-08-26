package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.gapiClientToolresults.anon.AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var histories: HistoriesResource = js.native
  /**
    * Gets the Tool Results settings for a project.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read from project
    */
  def getSettings(request: AltFields): Request[ProjectSettings] = js.native
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
  def initializeSettings(request: AltFields): Request[ProjectSettings] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    getSettings: AltFields => Request[ProjectSettings],
    histories: HistoriesResource,
    initializeSettings: AltFields => Request[ProjectSettings]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getSettings = js.Any.fromFunction1(getSettings), histories = histories.asInstanceOf[js.Any], initializeSettings = js.Any.fromFunction1(initializeSettings))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetSettings(value: AltFields => Request[ProjectSettings]): Self = this.set("getSettings", js.Any.fromFunction1(value))
    @scala.inline
    def setHistories(value: HistoriesResource): Self = this.set("histories", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitializeSettings(value: AltFields => Request[ProjectSettings]): Self = this.set("initializeSettings", js.Any.fromFunction1(value))
  }
  
}

