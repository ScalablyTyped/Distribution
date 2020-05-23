package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Maxresults
import typings.gapiClientAnalytics.anon.Oauthtoken
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: QuotaUser): Request[Webproperty]
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: Oauthtoken): Request[Webproperty]
  /** Lists web properties to which the user has access. */
  def list(request: Maxresults): Request[Webproperties]
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Webproperty]
  /** Updates an existing web property. */
  def update(request: QuotaUser): Request[Webproperty]
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: QuotaUser => Request[Webproperty],
    insert: Oauthtoken => Request[Webproperty],
    list: Maxresults => Request[Webproperties],
    patch: QuotaUser => Request[Webproperty],
    update: QuotaUser => Request[Webproperty]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertiesResource]
  }
}

