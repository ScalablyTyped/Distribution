package typings.fastify

import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type FastifyPlugin[Options /* <: FastifyPluginOptions */] = (FastifyPluginCallback[Options, RawServerDefault]) | (FastifyPluginAsync[Options, RawServerDefault])
  
  type FastifyPluginAsync[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */] = js.Function2[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyLoggerInstance
    ], 
    /* opts */ Options, 
    js.Promise[Unit]
  ]
  
  type FastifyPluginCallback[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */] = js.Function3[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyLoggerInstance
    ], 
    /* opts */ Options, 
    /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
    Unit
  ]
  
  type FastifyPluginOptions = Record[String, js.Any]
}
