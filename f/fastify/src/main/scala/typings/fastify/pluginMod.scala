package typings.fastify

import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
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
