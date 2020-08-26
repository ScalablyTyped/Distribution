package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientOptions extends js.Object {
  /** Maps API for Work channel. */
  var channel: js.UndefOr[String] = js.native
  /** Maps API for Work client ID. */
  var clientId: js.UndefOr[String] = js.native
  /** Maps API for Work client secret (a.k.a. private key). */
  var clientSecret: js.UndefOr[String] = js.native
  /** API key (required, unless clientID and clientSecret provided). */
  var key: String = js.native
  /** Default language for all queries. */
  var language: js.UndefOr[Language] = js.native
  /** Rate options. */
  var rate: js.UndefOr[RateOptions] = js.native
  /** Retry options. */
  var retryOptions: js.UndefOr[RetryOptions] = js.native
  /** Timeout in milliseconds. (Default: 60 * 1000 ms). */
  var timeout: js.UndefOr[Double] = js.native
}

object CreateClientOptions {
  @scala.inline
  def apply(key: String): CreateClientOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptions]
  }
  @scala.inline
  implicit class CreateClientOptionsOps[Self <: CreateClientOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setRate(value: RateOptions): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setRetryOptions(value: RetryOptions): Self = this.set("retryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryOptions: Self = this.set("retryOptions", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

