package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of an entitlement. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[EntitlementsListResponse]
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIpOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
  /** Adds or updates an entitlement to an app for a user. */
  def update(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyUserIpOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
}

