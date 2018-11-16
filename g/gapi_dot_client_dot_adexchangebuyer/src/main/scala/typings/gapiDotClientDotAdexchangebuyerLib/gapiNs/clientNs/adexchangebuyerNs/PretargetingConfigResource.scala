package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
}

