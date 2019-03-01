package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): fastifyLib.fastifyMod.fastifyNs.FastifyInstance[
    nodeLib.http2Mod.Http2SecureServer, 
    nodeLib.http2Mod.Http2ServerRequest, 
    nodeLib.http2Mod.Http2ServerResponse
  ] = js.native
  def apply(opts: fastifyLib.fastifyMod.fastifyNs.ServerOptionsAsHttp): fastifyLib.fastifyMod.fastifyNs.FastifyInstance[
    nodeLib.httpMod.Server, 
    nodeLib.httpMod.IncomingMessage, 
    nodeLib.httpMod.ServerResponse
  ] = js.native
  def apply(opts: fastifyLib.fastifyMod.fastifyNs.ServerOptionsAsHttp2): fastifyLib.fastifyMod.fastifyNs.FastifyInstance[
    nodeLib.http2Mod.Http2Server, 
    nodeLib.http2Mod.Http2ServerRequest, 
    nodeLib.http2Mod.Http2ServerResponse
  ] = js.native
  def apply(opts: fastifyLib.fastifyMod.fastifyNs.ServerOptionsAsSecureHttp): fastifyLib.fastifyMod.fastifyNs.FastifyInstance[
    nodeLib.httpsMod.Server, 
    nodeLib.httpMod.IncomingMessage, 
    nodeLib.httpMod.ServerResponse
  ] = js.native
  def apply(opts: fastifyLib.fastifyMod.fastifyNs.ServerOptionsAsSecureHttp2): fastifyLib.fastifyMod.fastifyNs.FastifyInstance[
    nodeLib.http2Mod.Http2SecureServer, 
    nodeLib.http2Mod.Http2ServerRequest, 
    nodeLib.http2Mod.Http2ServerResponse
  ] = js.native
  def apply[HttpServer /* <: nodeLib.httpMod.Server | nodeLib.http2Mod.Http2Server */, HttpRequest /* <: nodeLib.httpMod.IncomingMessage | nodeLib.http2Mod.Http2ServerRequest */, HttpResponse /* <: nodeLib.httpMod.ServerResponse | nodeLib.http2Mod.Http2ServerResponse */](opts: fastifyLib.fastifyMod.fastifyNs.ServerOptions): fastifyLib.fastifyMod.fastifyNs.FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
}

