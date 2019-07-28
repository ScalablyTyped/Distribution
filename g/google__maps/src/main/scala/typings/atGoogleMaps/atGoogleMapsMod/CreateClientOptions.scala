package typings.atGoogleMaps.atGoogleMapsMod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientOptions extends js.Object {
  /** Promise constructor (optional). */
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  /** Maps API for Work channel. */
  var channel: js.UndefOr[String] = js.undefined
  /** Maps API for Work client ID. */
  var clientId: js.UndefOr[String] = js.undefined
  /** Maps API for Work client secret (a.k.a. private key). */
  var clientSecret: js.UndefOr[String] = js.undefined
  /** API key (required, unless clientID and clientSecret provided). */
  var key: String
  /** Default language for all queries. */
  var language: js.UndefOr[Language] = js.undefined
  /** Rate options. */
  var rate: js.UndefOr[RateOptions] = js.undefined
  /** Retry options. */
  var retryOptions: js.UndefOr[RetryOptions] = js.undefined
  /** Timeout in milliseconds. (Default: 60 * 1000 ms). */
  var timeout: js.UndefOr[Double] = js.undefined
}

object CreateClientOptions {
  @scala.inline
  def apply(
    key: String,
    Promise: PromiseConstructor = null,
    channel: String = null,
    clientId: String = null,
    clientSecret: String = null,
    language: Language = null,
    rate: RateOptions = null,
    retryOptions: RetryOptions = null,
    timeout: Int | Double = null
  ): CreateClientOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (language != null) __obj.updateDynamic("language")(language)
    if (rate != null) __obj.updateDynamic("rate")(rate)
    if (retryOptions != null) __obj.updateDynamic("retryOptions")(retryOptions)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptions]
  }
}

