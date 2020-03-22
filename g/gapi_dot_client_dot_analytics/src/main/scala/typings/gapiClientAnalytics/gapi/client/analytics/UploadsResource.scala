package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAlt
import typings.gapiClientAnalytics.AnonCustomDataSourceId
import typings.gapiClientAnalytics.AnonUploadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: AnonCustomDataSourceId): Request_[Unit]
  /** List uploads to which the user has access. */
  def get(request: AnonUploadId): Request_[Upload]
  /** List uploads to which the user has access. */
  def list(request: AnonAccountIdAlt): Request_[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: AnonCustomDataSourceId): Request_[Upload]
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: AnonCustomDataSourceId => Request_[Unit],
    get: AnonUploadId => Request_[Upload],
    list: AnonAccountIdAlt => Request_[Uploads],
    uploadData: AnonCustomDataSourceId => Request_[Upload]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = js.Any.fromFunction1(deleteUploadData), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), uploadData = js.Any.fromFunction1(uploadData))
  
    __obj.asInstanceOf[UploadsResource]
  }
}

