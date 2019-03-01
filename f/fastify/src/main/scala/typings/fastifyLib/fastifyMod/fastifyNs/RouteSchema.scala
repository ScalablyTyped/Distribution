package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSchema extends js.Object {
  var body: js.UndefOr[JSONSchema] = js.undefined
  var headers: js.UndefOr[JSONSchema] = js.undefined
  var params: js.UndefOr[JSONSchema] = js.undefined
  var querystring: js.UndefOr[JSONSchema] = js.undefined
  var response: /* import warning: ImportType.apply Failed type conversion: {[code: number] : fastify.fastify.fastify.JSONSchema, [code: string] : fastify.fastify.fastify.JSONSchema} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {[code: number] : fastify.fastify.fastify.JSONSchema, [code: string] : fastify.fastify.fastify.JSONSchema} */ js.Any
  ] = js.undefined
}

object RouteSchema {
  @scala.inline
  def apply(
    body: JSONSchema = null,
    headers: JSONSchema = null,
    params: JSONSchema = null,
    querystring: JSONSchema = null,
    response: /* import warning: ImportType.apply Failed type conversion: {[code: number] : fastify.fastify.fastify.JSONSchema, [code: string] : fastify.fastify.fastify.JSONSchema} */ js.Any = null
  ): RouteSchema = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    if (querystring != null) __obj.updateDynamic("querystring")(querystring)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RouteSchema]
  }
}

