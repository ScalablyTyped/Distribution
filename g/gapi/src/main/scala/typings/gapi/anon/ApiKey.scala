package typings.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKey extends js.Object {
  /**
    * The API Key to use.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * The app's client ID, found and created in the Google Developers Console.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * An array of discovery doc URLs or discovery doc JSON objects.
    */
  var discoveryDocs: js.UndefOr[js.Array[String]] = js.native
  var hosted_domain: js.UndefOr[String] = js.native
  /**
    * The scopes to request, as a space-delimited string.
    */
  var scope: js.UndefOr[String] = js.native
}

object ApiKey {
  @scala.inline
  def apply(): ApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKey]
  }
  @scala.inline
  implicit class ApiKeyOps[Self <: ApiKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setDiscoveryDocsVarargs(value: String*): Self = this.set("discoveryDocs", js.Array(value :_*))
    @scala.inline
    def setDiscoveryDocs(value: js.Array[String]): Self = this.set("discoveryDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscoveryDocs: Self = this.set("discoveryDocs", js.undefined)
    @scala.inline
    def setHosted_domain(value: String): Self = this.set("hosted_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHosted_domain: Self = this.set("hosted_domain", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

