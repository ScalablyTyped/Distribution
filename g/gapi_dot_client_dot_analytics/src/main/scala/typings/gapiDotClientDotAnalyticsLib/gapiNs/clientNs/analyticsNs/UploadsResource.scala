package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: gapiDotClientDotAnalyticsLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** List uploads to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Upload]
  /** List uploads to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_MaxresultsStartindexPrettyPrintAccountIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: gapiDotClientDotAnalyticsLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Upload]
}

