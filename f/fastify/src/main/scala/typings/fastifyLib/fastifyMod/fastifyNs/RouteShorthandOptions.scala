package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional configuration parameters for the route being created
  */
trait RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] extends js.Object {
  var attachValidation: js.UndefOr[scala.Boolean] = js.undefined
  var bodyLimit: js.UndefOr[scala.Double] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var preHandler: js.UndefOr[
    (FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ])
  ] = js.undefined
  var preSerialization: js.UndefOr[
    (FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ])
  ] = js.undefined
  var preValidation: js.UndefOr[
    (FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ])
  ] = js.undefined
  var schema: js.UndefOr[RouteSchema] = js.undefined
  var schemaCompiler: js.UndefOr[SchemaCompiler] = js.undefined
}

object RouteShorthandOptions {
  @scala.inline
  def apply[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body](
    attachValidation: js.UndefOr[scala.Boolean] = js.undefined,
    bodyLimit: scala.Int | scala.Double = null,
    config: js.Any = null,
    logLevel: java.lang.String = null,
    preHandler: (FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ]) = null,
    preSerialization: (FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ]) = null,
    preValidation: (FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ]) = null,
    schema: RouteSchema = null,
    schemaCompiler: SchemaCompiler = null
  ): RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachValidation)) __obj.updateDynamic("attachValidation")(attachValidation)
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (preHandler != null) __obj.updateDynamic("preHandler")(preHandler.asInstanceOf[js.Any])
    if (preSerialization != null) __obj.updateDynamic("preSerialization")(preSerialization.asInstanceOf[js.Any])
    if (preValidation != null) __obj.updateDynamic("preValidation")(preValidation.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaCompiler != null) __obj.updateDynamic("schemaCompiler")(schemaCompiler)
    __obj.asInstanceOf[RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]]
  }
}

