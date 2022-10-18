package typings.fastify

import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
import typings.fastify.typesUtilsMod.RawServerDefault
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginMod {
  
  type FastifyPlugin[Options /* <: FastifyPluginOptions */] = (FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault]) | (FastifyPluginAsync[Options, RawServerDefault, FastifyTypeProviderDefault])
  
  type FastifyPluginAsync[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] = js.Function2[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], 
    /* opts */ Options, 
    js.Promise[Unit]
  ]
  
  type FastifyPluginCallback[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] = js.Function3[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], 
    /* opts */ Options, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ]
  
  type FastifyPluginOptions = Record[String, Any]
}
