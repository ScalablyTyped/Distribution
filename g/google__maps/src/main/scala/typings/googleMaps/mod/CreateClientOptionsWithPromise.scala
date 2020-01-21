package typings.googleMaps.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientOptionsWithPromise extends CreateClientOptions {
  /** Promise constructor */
  var Promise: PromiseConstructor
}

object CreateClientOptionsWithPromise {
  @scala.inline
  def apply(
    Promise: PromiseConstructor,
    key: String,
    channel: String = null,
    clientId: String = null,
    clientSecret: String = null,
    language: Language = null,
    rate: RateOptions = null,
    retryOptions: RetryOptions = null,
    timeout: Int | Double = null
  ): CreateClientOptionsWithPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (retryOptions != null) __obj.updateDynamic("retryOptions")(retryOptions.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptionsWithPromise]
  }
}

