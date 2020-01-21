package typings.gapiClientSiteverification.gapi.client.siteverification

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSiteverification.AnonAlt
import typings.gapiClientSiteverification.AnonAltFields
import typings.gapiClientSiteverification.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Get the most current data for a website or domain. */
  def get(request: AnonAlt): Request_[SiteVerificationWebResourceResource]
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: AnonAltFields): Request_[SiteVerificationWebResourceGettokenResponse]
  /** Attempt verification of a website or domain. */
  def insert(request: AnonAltFieldsKey): Request_[SiteVerificationWebResourceResource]
  /** Get the list of your verified websites and domains. */
  def list(request: AnonAltFields): Request_[SiteVerificationWebResourceListResponse]
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[SiteVerificationWebResourceResource]
  /** Modify the list of owners for your website or domain. */
  def update(request: AnonAlt): Request_[SiteVerificationWebResourceResource]
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[SiteVerificationWebResourceResource],
    getToken: AnonAltFields => Request_[SiteVerificationWebResourceGettokenResponse],
    insert: AnonAltFieldsKey => Request_[SiteVerificationWebResourceResource],
    list: AnonAltFields => Request_[SiteVerificationWebResourceListResponse],
    patch: AnonAlt => Request_[SiteVerificationWebResourceResource],
    update: AnonAlt => Request_[SiteVerificationWebResourceResource]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getToken = js.Any.fromFunction1(getToken), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebResourceResource]
  }
}

