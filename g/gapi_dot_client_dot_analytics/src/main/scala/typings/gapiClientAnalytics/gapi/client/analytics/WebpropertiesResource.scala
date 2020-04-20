package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonMaxresults
import typings.gapiClientAnalytics.AnonOauthtoken
import typings.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: AnonQuotaUser): Request_[Webproperty]
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: AnonOauthtoken): Request_[Webproperty]
  /** Lists web properties to which the user has access. */
  def list(request: AnonMaxresults): Request_[Webproperties]
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: AnonQuotaUser): Request_[Webproperty]
  /** Updates an existing web property. */
  def update(request: AnonQuotaUser): Request_[Webproperty]
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: AnonQuotaUser => Request_[Webproperty],
    insert: AnonOauthtoken => Request_[Webproperty],
    list: AnonMaxresults => Request_[Webproperties],
    patch: AnonQuotaUser => Request_[Webproperty],
    update: AnonQuotaUser => Request_[Webproperty]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertiesResource]
  }
}

