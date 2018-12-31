package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallsResource extends js.Object {
  /** Requests to remove an app from a device. A call to get or list will still show the app as installed on the device until it is actually removed. */
  def delete(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIpOauthtokenAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of an installation of an app on a device. */
  def get(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIpOauthtokenAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[Install]
  /** Retrieves the details of all apps installed on the specified device. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[InstallsListResponse]
  /**
    * Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary.
    * This method supports patch semantics.
    */
  def patch(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIpOauthtokenAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[Install]
  /** Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary. */
  def update(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIpOauthtokenAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[Install]
}

