package typings.fastify.anon

import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.pluginMod.FastifyPluginCallback
import typings.fastify.pluginMod.FastifyPluginOptions
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
  
  def default(
    instance: FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ],
    opts: Options,
    done: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit
  @JSName("default")
  var default_Original: FastifyPluginCallback[Options, Server, TypeProvider]
}
object Default {
  
  inline def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
    default: (/* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], Options, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
  ): Default[Options, Server, TypeProvider] = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction3(default))
    __obj.asInstanceOf[Default[Options, Server, TypeProvider]]
  }
  
  extension [Self <: Default[?, ?, ?], Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](x: Self & (Default[Options, Server, TypeProvider])) {
    
    inline def setDefault(
      value: (/* instance */ FastifyInstance[
          Server, 
          RawRequestDefaultExpression[Server], 
          RawReplyDefaultExpression[Server], 
          FastifyBaseLogger, 
          TypeProvider
        ], Options, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
    ): Self = StObject.set(x, "default", js.Any.fromFunction3(value))
  }
}
