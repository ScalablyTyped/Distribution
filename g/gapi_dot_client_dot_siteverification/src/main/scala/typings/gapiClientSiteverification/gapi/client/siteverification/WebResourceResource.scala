package typings.gapiClientSiteverification.gapi.client.siteverification

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSiteverification.anon.Alt
import typings.gapiClientSiteverification.anon.Fields
import typings.gapiClientSiteverification.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: Alt): Request[Unit]
  /** Get the most current data for a website or domain. */
  def get(request: Alt): Request[SiteVerificationWebResourceResource]
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: Fields): Request[SiteVerificationWebResourceGettokenResponse]
  /** Attempt verification of a website or domain. */
  def insert(request: Key): Request[SiteVerificationWebResourceResource]
  /** Get the list of your verified websites and domains. */
  def list(request: Fields): Request[SiteVerificationWebResourceListResponse]
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: Alt): Request[SiteVerificationWebResourceResource]
  /** Modify the list of owners for your website or domain. */
  def update(request: Alt): Request[SiteVerificationWebResourceResource]
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[SiteVerificationWebResourceResource],
    getToken: Fields => Request[SiteVerificationWebResourceGettokenResponse],
    insert: Key => Request[SiteVerificationWebResourceResource],
    list: Fields => Request[SiteVerificationWebResourceListResponse],
    patch: Alt => Request[SiteVerificationWebResourceResource],
    update: Alt => Request[SiteVerificationWebResourceResource]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getToken = js.Any.fromFunction1(getToken), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebResourceResource]
  }
}

