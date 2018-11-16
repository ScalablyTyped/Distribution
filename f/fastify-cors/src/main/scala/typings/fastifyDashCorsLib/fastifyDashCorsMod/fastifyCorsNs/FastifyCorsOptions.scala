package typings
package fastifyDashCorsLib.fastifyDashCorsMod.fastifyCorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Options for configuring the fastify-cors plugin.
   */

trait FastifyCorsOptions extends js.Object {
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
    java.lang.String | scala.Boolean | stdLib.RegExp | js.Array[java.lang.String] | js.Array[stdLib.RegExp] | fastifyDashCorsLib.originCallback
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

