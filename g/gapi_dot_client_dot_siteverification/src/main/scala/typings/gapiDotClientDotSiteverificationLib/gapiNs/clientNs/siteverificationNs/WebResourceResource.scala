package typings
package gapiDotClientDotSiteverificationLib.gapiNs.clientNs.siteverificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: gapiDotClientDotSiteverificationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get the most current data for a website or domain. */
  def get(request: gapiDotClientDotSiteverificationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: gapiDotClientDotSiteverificationLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceGettokenResponse]
  /** Attempt verification of a website or domain. */
  def insert(request: gapiDotClientDotSiteverificationLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  /** Get the list of your verified websites and domains. */
  def list(request: gapiDotClientDotSiteverificationLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceListResponse]
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: gapiDotClientDotSiteverificationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  /** Modify the list of owners for your website or domain. */
  def update(request: gapiDotClientDotSiteverificationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotSiteverificationLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotSiteverificationLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource],
    getToken: gapiDotClientDotSiteverificationLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceGettokenResponse],
    insert: gapiDotClientDotSiteverificationLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource],
    list: gapiDotClientDotSiteverificationLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceListResponse],
    patch: gapiDotClientDotSiteverificationLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource],
    update: gapiDotClientDotSiteverificationLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[SiteVerificationWebResourceResource]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getToken = js.Any.fromFunction1(getToken), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebResourceResource]
  }
}

