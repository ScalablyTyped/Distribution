package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): FastifyInstance[
    nodeLib.http2Mod.Http2SecureServer, 
    nodeLib.http2Mod.Http2ServerRequest, 
    nodeLib.http2Mod.Http2ServerResponse
  ] = js.native
  def apply(opts: ServerOptionsAsHttp): FastifyInstance[
    nodeLib.httpMod.Server, 
    nodeLib.httpMod.IncomingMessage, 
    nodeLib.httpMod.ServerResponse
  ] = js.native
  def apply(opts: ServerOptionsAsHttp2): FastifyInstance[
    nodeLib.http2Mod.Http2Server, 
    nodeLib.http2Mod.Http2ServerRequest, 
    nodeLib.http2Mod.Http2ServerResponse
  ] = js.native
  def apply(opts: ServerOptionsAsSecureHttp): FastifyInstance[
    nodeLib.httpsMod.Server, 
    nodeLib.httpMod.IncomingMessage, 
    nodeLib.httpMod.ServerResponse
  ] = js.native
  def apply(opts: ServerOptionsAsSecureHttp2): FastifyInstance[
    nodeLib.http2Mod.Http2SecureServer, 
    nodeLib.http2Mod.Http2ServerRequest, 
    nodeLib.http2Mod.Http2ServerResponse
  ] = js.native
  def apply[HttpServer /* <: nodeLib.httpMod.Server | nodeLib.http2Mod.Http2Server */, HttpRequest /* <: nodeLib.httpMod.IncomingMessage | nodeLib.http2Mod.Http2ServerRequest */, HttpResponse /* <: nodeLib.httpMod.ServerResponse | nodeLib.http2Mod.Http2ServerResponse */](opts: ServerOptions): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
}

