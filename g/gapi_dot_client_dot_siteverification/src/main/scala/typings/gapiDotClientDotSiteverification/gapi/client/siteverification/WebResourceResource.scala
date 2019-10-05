package typings.gapiDotClientDotSiteverification.gapi.client.siteverification

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSiteverification.Anon_Alt
import typings.gapiDotClientDotSiteverification.Anon_AltFields
import typings.gapiDotClientDotSiteverification.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Get the most current data for a website or domain. */
  def get(request: Anon_Alt): Request[SiteVerificationWebResourceResource]
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: Anon_AltFields): Request[SiteVerificationWebResourceGettokenResponse]
  /** Attempt verification of a website or domain. */
  def insert(request: Anon_AltFieldsKey): Request[SiteVerificationWebResourceResource]
  /** Get the list of your verified websites and domains. */
  def list(request: Anon_AltFields): Request[SiteVerificationWebResourceListResponse]
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[SiteVerificationWebResourceResource]
  /** Modify the list of owners for your website or domain. */
  def update(request: Anon_Alt): Request[SiteVerificationWebResourceResource]
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[SiteVerificationWebResourceResource],
    getToken: Anon_AltFields => Request[SiteVerificationWebResourceGettokenResponse],
    insert: Anon_AltFieldsKey => Request[SiteVerificationWebResourceResource],
    list: Anon_AltFields => Request[SiteVerificationWebResourceListResponse],
    patch: Anon_Alt => Request[SiteVerificationWebResourceResource],
    update: Anon_Alt => Request[SiteVerificationWebResourceResource]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getToken = js.Any.fromFunction1(getToken), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebResourceResource]
  }
}

