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
    deleteUploadData: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Upload]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Uploads]
    ],
    uploadData: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDataSourceId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Upload]
    ]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = deleteUploadData, get = get, list = list, uploadData = uploadData)
  
    __obj.asInstanceOf[UploadsResource]
  }
}

