package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomDataSourceId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomDataSourceIdFields
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomDataSourceIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: Anon_AccountIdAltCustomDataSourceId): Request[Unit]
  /** List uploads to which the user has access. */
  def get(request: Anon_AccountIdAltCustomDataSourceIdFields): Request[Upload]
  /** List uploads to which the user has access. */
  def list(request: Anon_AccountIdAltCustomDataSourceIdFieldsKey): Request[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: Anon_AccountIdAltCustomDataSourceId): Request[Upload]
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: Anon_AccountIdAltCustomDataSourceId => Request[Unit],
    get: Anon_AccountIdAltCustomDataSourceIdFields => Request[Upload],
    list: Anon_AccountIdAltCustomDataSourceIdFieldsKey => Request[Uploads],
    uploadData: Anon_AccountIdAltCustomDataSourceId => Request[Upload]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = js.Any.fromFunction1(deleteUploadData), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), uploadData = js.Any.fromFunction1(uploadData))
  
    __obj.asInstanceOf[UploadsResource]
  }
}

