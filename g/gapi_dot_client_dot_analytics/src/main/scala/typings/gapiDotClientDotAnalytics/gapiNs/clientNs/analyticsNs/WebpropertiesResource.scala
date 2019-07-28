package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFields
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKey
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[Webproperty]
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: Anon_AccountIdAltFields): Request[Webproperty]
  /** Lists web properties to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKey): Request[Webproperties]
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[Webproperty]
  /** Updates an existing web property. */
  def update(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[Webproperty]
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAltFieldsKeyOauthtoken => Request[Webproperty],
    insert: Anon_AccountIdAltFields => Request[Webproperty],
    list: Anon_AccountIdAltFieldsKey => Request[Webproperties],
    patch: Anon_AccountIdAltFieldsKeyOauthtoken => Request[Webproperty],
    update: Anon_AccountIdAltFieldsKeyOauthtoken => Request[Webproperty]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebpropertiesResource]
  }
}

