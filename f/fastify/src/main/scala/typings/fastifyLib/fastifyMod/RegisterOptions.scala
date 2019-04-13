package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Register options
  */
trait RegisterOptions[HttpServer, HttpRequest, HttpResponse]
  extends RouteShorthandOptions[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply[HttpServer, HttpRequest, HttpResponse](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attachValidation: js.UndefOr[scala.Boolean] = js.undefined,
    bodyLimit: scala.Int | scala.Double = null,
    config: js.Any = null,
    logLevel: java.lang.String = null,
    preHandler: (FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]) | (js.Array[
      FastifyMiddleware[
        HttpServer, 
        HttpRequest, 
        HttpResponse, 
        DefaultQuery, 
        DefaultParams, 
        DefaultHeaders, 
        DefaultBody
      ]
    ]) = null,
    preSerialization: (FastifyMiddlewareWithPayload[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]) | (js.Array[
      FastifyMiddlewareWithPayload[
        HttpServer, 
        HttpRequest, 
        HttpResponse, 
        DefaultQuery, 
        DefaultParams, 
        DefaultHeaders, 
        DefaultBody
      ]
    ]) = null,
    preValidation: (FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]) | (js.Array[
      FastifyMiddleware[
        HttpServer, 
        HttpRequest, 
        HttpResponse, 
        DefaultQuery, 
        DefaultParams, 
        DefaultHeaders, 
        DefaultBody
      ]
    ]) = null,
    prefix: java.lang.String = null,
    prefixTrailingSlash: fastifyLib.fastifyLibStrings.slash | fastifyLib.fastifyLibStrings.`no-slash` | fastifyLib.fastifyLibStrings.both = null,
    schema: RouteSchema = null,
    schemaCompiler: SchemaCompiler = null
  ): RegisterOptions[HttpServer, HttpRequest, HttpResponse] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(attachValidation)) __obj.updateDynamic("attachValidation")(attachValidation)
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (preHandler != null) __obj.updateDynamic("preHandler")(preHandler.asInstanceOf[js.Any])
    if (preSerialization != null) __obj.updateDynamic("preSerialization")(preSerialization.asInstanceOf[js.Any])
    if (preValidation != null) __obj.updateDynamic("preValidation")(preValidation.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixTrailingSlash != null) __obj.updateDynamic("prefixTrailingSlash")(prefixTrailingSlash.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaCompiler != null) __obj.updateDynamic("schemaCompiler")(schemaCompiler)
    __obj.asInstanceOf[RegisterOptions[HttpServer, HttpRequest, HttpResponse]]
  }
}

