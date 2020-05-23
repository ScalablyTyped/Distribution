package typings.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  /**
    * The API Key to use.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  /**
    * The app's client ID, found and created in the Google Developers Console.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * An array of discovery doc URLs or discovery doc JSON objects.
    */
  var discoveryDocs: js.UndefOr[js.Array[String]] = js.undefined
  var hosted_domain: js.UndefOr[String] = js.undefined
  /**
    * The scopes to request, as a space-delimited string.
    */
  var scope: js.UndefOr[String] = js.undefined
}

object ApiKey {
  @scala.inline
  def apply(
    apiKey: String = null,
    clientId: String = null,
    discoveryDocs: js.Array[String] = null,
    hosted_domain: String = null,
    scope: String = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (discoveryDocs != null) __obj.updateDynamic("discoveryDocs")(discoveryDocs.asInstanceOf[js.Any])
    if (hosted_domain != null) __obj.updateDynamic("hosted_domain")(hosted_domain.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}

