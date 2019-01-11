package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientOptions extends js.Object {
  /** Promise constructor (optional). */
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  /** Maps API for Work channel. */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /** Maps API for Work client ID. */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** Maps API for Work client secret (a.k.a. private key). */
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  /** API key (required, unless clientID and clientSecret provided). */
  var key: java.lang.String
  /** Default language for all queries. */
  var language: js.UndefOr[Language] = js.undefined
  /** Rate options. */
  var rate: js.UndefOr[RateOptions] = js.undefined
  /** Retry options. */
  var retryOptions: js.UndefOr[RetryOptions] = js.undefined
  /** Timeout in milliseconds. (Default: 60 * 1000 ms). */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

