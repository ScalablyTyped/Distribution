package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKey extends js.Object {
  /**
    * The API Key to use.
    */
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The app's client ID, found and created in the Google Developers Console.
    */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of discovery doc URLs or discovery doc JSON objects.
    */
  var discoveryDocs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hosted_domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The scopes to request, as a space-delimited string.
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ApiKey {
  @scala.inline
  def apply(
    apiKey: java.lang.String = null,
    clientId: java.lang.String = null,
    discoveryDocs: js.Array[java.lang.String] = null,
    hosted_domain: java.lang.String = null,
    scope: java.lang.String = null
  ): Anon_ApiKey = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (discoveryDocs != null) __obj.updateDynamic("discoveryDocs")(discoveryDocs)
    if (hosted_domain != null) __obj.updateDynamic("hosted_domain")(hosted_domain)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_ApiKey]
  }
}

