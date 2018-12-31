package typings
package gapiDotClientDotSiteverificationLib.gapiNs.clientNs.siteverificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get the most current data for a website or domain. */
  def get(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceGettokenResponse]
  /** Attempt verification of a website or domain. */
  def insert(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  /** Get the list of your verified websites and domains. */
  def list(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceListResponse]
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  /** Modify the list of owners for your website or domain. */
  def update(request: gapiDotClientDotSiteverificationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
}

