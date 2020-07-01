package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for allowing client side cross-origin requests. Please
  * see W3C Recommendation for Cross Origin Resource Sharing
  */
@js.native
trait SchemaCorsPolicy extends js.Object {
  /**
    * In response to a preflight request, setting this to true indicates that
    * the actual request can include user credentials. This translates to the
    * Access-Control-Allow-Credentials header. Default is false.
    */
  var allowCredentials: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the content for the Access-Control-Allow-Headers header.
    */
  var allowHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the content for the Access-Control-Allow-Methods header.
    */
  var allowMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the regualar expression patterns that match allowed origins.
    * For regular expression grammar please see
    * en.cppreference.com/w/cpp/regex/ecmascript  An origin is allowed if it
    * matches either allow_origins or allow_origin_regex.
    */
  var allowOriginRegexes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the list of origins that will be allowed to do CORS requests.
    * An origin is allowed if it matches either allow_origins or
    * allow_origin_regex.
    */
  var allowOrigins: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, specifies the CORS policy is disabled. The default value of
    * false, which indicates that the CORS policy is in effect.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the content for the Access-Control-Expose-Headers header.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies how long the results of a preflight request can be cached. This
    * translates to the content for the Access-Control-Max-Age header.
    */
  var maxAge: js.UndefOr[Double] = js.native
}

object SchemaCorsPolicy {
  @scala.inline
  def apply(
    allowCredentials: js.UndefOr[Boolean] = js.undefined,
    allowHeaders: js.Array[String] = null,
    allowMethods: js.Array[String] = null,
    allowOriginRegexes: js.Array[String] = null,
    allowOrigins: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    exposeHeaders: js.Array[String] = null,
    maxAge: js.UndefOr[Double] = js.undefined
  ): SchemaCorsPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCredentials)) __obj.updateDynamic("allowCredentials")(allowCredentials.get.asInstanceOf[js.Any])
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders.asInstanceOf[js.Any])
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods.asInstanceOf[js.Any])
    if (allowOriginRegexes != null) __obj.updateDynamic("allowOriginRegexes")(allowOriginRegexes.asInstanceOf[js.Any])
    if (allowOrigins != null) __obj.updateDynamic("allowOrigins")(allowOrigins.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCorsPolicy]
  }
}

