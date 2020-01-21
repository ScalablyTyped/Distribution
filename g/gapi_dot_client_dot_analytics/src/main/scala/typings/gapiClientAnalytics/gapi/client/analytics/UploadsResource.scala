package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltCustomDataSourceId
import typings.gapiClientAnalytics.AnonAccountIdAltCustomDataSourceIdFields
import typings.gapiClientAnalytics.AnonAccountIdAltCustomDataSourceIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: AnonAccountIdAltCustomDataSourceId): Request_[Unit]
  /** List uploads to which the user has access. */
  def get(request: AnonAccountIdAltCustomDataSourceIdFields): Request_[Upload]
  /** List uploads to which the user has access. */
  def list(request: AnonAccountIdAltCustomDataSourceIdFieldsKey): Request_[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: AnonAccountIdAltCustomDataSourceId): Request_[Upload]
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: AnonAccountIdAltCustomDataSourceId => Request_[Unit],
    get: AnonAccountIdAltCustomDataSourceIdFields => Request_[Upload],
    list: AnonAccountIdAltCustomDataSourceIdFieldsKey => Request_[Uploads],
    uploadData: AnonAccountIdAltCustomDataSourceId => Request_[Upload]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = js.Any.fromFunction1(deleteUploadData), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), uploadData = js.Any.fromFunction1(uploadData))
  
    __obj.asInstanceOf[UploadsResource]
  }
}

