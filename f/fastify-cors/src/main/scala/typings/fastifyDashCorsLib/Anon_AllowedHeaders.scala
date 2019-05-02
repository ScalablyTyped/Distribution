package typings
package fastifyDashCorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedHeaders extends js.Object {
  /**
    * Configures the Access-Control-Allow-Headers CORS header.
    * Expects a comma-delimited string (ex: 'Content-Type,Authorization')
    * or an array (ex: ['Content-Type', 'Authorization']). If not
    * specified, defaults to reflecting the headers specified in the
    * request's Access-Control-Request-Headers header.
    */
  var allowedHeaders: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Configures the Access-Control-Allow-Credentials CORS header.
    * Set to true to pass the header, otherwise it is omitted.
    */
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the Access-Control-Expose-Headers CORS header.
    * Expects a comma-delimited string (ex: 'Content-Range,X-Content-Range')
    * or an array (ex: ['Content-Range', 'X-Content-Range']).
    * If not specified, no custom headers are exposed.
    */
  var exposedHeaders: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Configures the Access-Control-Max-Age CORS header.
    * Set to an integer to pass the header, otherwise it is omitted.
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * Configures the Access-Control-Allow-Methods CORS header.
    * Expects a comma-delimited string (ex: 'GET,PUT,POST') or an array (ex: ['GET', 'PUT', 'POST']).
    */
  var methods: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Provides a status code to use for successful OPTIONS requests,
    * since some legacy browsers (IE11, various SmartTVs) choke on 204.
    */
  var optionsSuccessStatus: js.UndefOr[scala.Double] = js.undefined
  /**
    * Configures the Access-Control-Allow-Origin CORS header.
    */
  var origin: js.UndefOr[
    java.lang.String | scala.Boolean | stdLib.RegExp | js.Array[java.lang.String] | js.Array[stdLib.RegExp] | fastifyDashCorsLib.fastifyDashCorsMod.originFunction
  ] = js.undefined
  /**
    * Pass the CORS preflight response to the route handler (default: false).
    */
  var preflight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pass the CORS preflight response to the route handler (default: false).
    */
  var preflightContinue: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowedHeaders {
  @scala.inline
  def apply(
    allowedHeaders: java.lang.String | js.Array[java.lang.String] = null,
    credentials: js.UndefOr[scala.Boolean] = js.undefined,
    exposedHeaders: java.lang.String | js.Array[java.lang.String] = null,
    maxAge: scala.Int | scala.Double = null,
    methods: java.lang.String | js.Array[java.lang.String] = null,
    optionsSuccessStatus: scala.Int | scala.Double = null,
    origin: java.lang.String | scala.Boolean | stdLib.RegExp | js.Array[java.lang.String] | js.Array[stdLib.RegExp] | fastifyDashCorsLib.fastifyDashCorsMod.originFunction = null,
    preflight: js.UndefOr[scala.Boolean] = js.undefined,
    preflightContinue: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AllowedHeaders = {
    val __obj = js.Dynamic.literal()
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials)
    if (exposedHeaders != null) __obj.updateDynamic("exposedHeaders")(exposedHeaders.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (optionsSuccessStatus != null) __obj.updateDynamic("optionsSuccessStatus")(optionsSuccessStatus.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(preflight)) __obj.updateDynamic("preflight")(preflight)
    if (!js.isUndefined(preflightContinue)) __obj.updateDynamic("preflightContinue")(preflightContinue)
    __obj.asInstanceOf[Anon_AllowedHeaders]
  }
}

