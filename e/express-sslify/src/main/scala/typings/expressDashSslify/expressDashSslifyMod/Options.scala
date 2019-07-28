package typings.expressDashSslify.expressDashSslifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Azure has a slightly different way of signaling encrypted connections.
    * To tell express-sslify to look out for Azure's x-arr-ssl header.
    * @default false
    */
  var trustAzureHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Heroku, nodejitsu and other hosters often use reverse proxies which offer SSL endpoints but then forward unencrypted HTTP traffic to the website.
    * This makes it difficult to detect if the original request was indeed via HTTPS.
    * Luckily, most reverse proxies set the x-forwarded-proto header flag with the original request scheme.
    * @default false
    */
  var trustProtoHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * If your reverse proxy sends the original host using the X-Forwarded-Host header and you need to use that instead of the Host header for the redirect.
    * @default false
    */
  var trustXForwardedHostHeader: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    trustAzureHeader: js.UndefOr[Boolean] = js.undefined,
    trustProtoHeader: js.UndefOr[Boolean] = js.undefined,
    trustXForwardedHostHeader: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(trustAzureHeader)) __obj.updateDynamic("trustAzureHeader")(trustAzureHeader)
    if (!js.isUndefined(trustProtoHeader)) __obj.updateDynamic("trustProtoHeader")(trustProtoHeader)
    if (!js.isUndefined(trustXForwardedHostHeader)) __obj.updateDynamic("trustXForwardedHostHeader")(trustXForwardedHostHeader)
    __obj.asInstanceOf[Options]
  }
}

