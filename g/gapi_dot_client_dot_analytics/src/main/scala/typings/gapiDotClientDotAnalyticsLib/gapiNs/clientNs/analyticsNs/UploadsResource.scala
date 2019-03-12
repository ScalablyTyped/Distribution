package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** List uploads to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Upload]
  /** List uploads to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceId): gapiDotClientLib.gapiNs.clientNs.Request[Upload]
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Upload],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Uploads],
    uploadData: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceId => gapiDotClientLib.gapiNs.clientNs.Request[Upload]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = js.Any.fromFunction1(deleteUploadData), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), uploadData = js.Any.fromFunction1(uploadData))
  
    __obj.asInstanceOf[UploadsResource]
  }
}

