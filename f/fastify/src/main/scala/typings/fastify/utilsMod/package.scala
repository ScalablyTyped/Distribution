package typings.fastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilsMod {
  
  type ContextConfigDefault = js.Any
  
  type RawReplyDefaultExpression[RawServer /* <: typings.fastify.utilsMod.RawServerBase */] = typings.node.http2Mod.Http2ServerResponse | typings.node.httpMod.ServerResponse
  
  type RawRequestDefaultExpression[RawServer /* <: typings.fastify.utilsMod.RawServerBase */] = typings.node.http2Mod.Http2ServerRequest | typings.node.httpMod.IncomingMessage
  
  type RawServerBase = typings.node.httpMod.Server | typings.node.httpsMod.Server | typings.node.http2Mod.Http2Server | typings.node.http2Mod.Http2SecureServer
  
  type RawServerDefault = typings.node.httpMod.Server
  
  type ReplyDefault = js.Any
  
  type RequestBodyDefault = js.Any
  
  type RequestHeadersDefault = js.Any
  
  type RequestParamsDefault = js.Any
  
  type RequestQuerystringDefault = js.Any
}
