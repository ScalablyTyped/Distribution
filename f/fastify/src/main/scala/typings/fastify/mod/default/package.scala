package typings.fastify.mod.default

import org.scalablytyped.runtime.Instantiable1
import typings.fastify.mod.FastifyHttp2Options
import typings.fastify.mod.FastifyHttp2SecureOptions
import typings.fastify.mod.FastifyHttpsOptions
import typings.fastify.mod.FastifyServerOptions
import typings.fastify.mod.default.^
import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply[Server /* <: typings.node.httpMod.Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]] */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
inline def apply[Server /* <: Http2Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyHttp2Options[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
/**
  * Fastify factory function for the standard fastify http, https, or http2 server instance.
  *
  * The default function utilizes http
  *
  * @param opts Fastify server options
  * @returns Fastify server instance
  */
inline def apply[Server /* <: Http2SecureServer */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyHttp2SecureOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
inline def apply[Server /* <: typings.node.httpsMod.Server[
Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
]] */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyHttpsOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
inline def apply[Server /* <: typings.node.httpMod.Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]] */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyServerOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
