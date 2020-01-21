package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFields
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKey
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[Webproperty]
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: AnonAccountIdAltFields): Request_[Webproperty]
  /** Lists web properties to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKey): Request_[Webproperties]
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[Webproperty]
  /** Updates an existing web property. */
  def update(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[Webproperty]
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: AnonAccountIdAltFieldsKeyOauthtoken => Request_[Webproperty],
    insert: AnonAccountIdAltFields => Request_[Webproperty],
    list: AnonAccountIdAltFieldsKey => Request_[Webproperties],
    patch: AnonAccountIdAltFieldsKeyOauthtoken => Request_[Webproperty],
    update: AnonAccountIdAltFieldsKeyOauthtoken => Request_[Webproperty]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebpropertiesResource]
  }
}

