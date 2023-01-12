package typings.fastify.anon

import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesPluginMod.FastifyPluginAsync
import typings.fastify.typesPluginMod.FastifyPluginOptions
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultFastifyPluginAsync[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
  
  def default(
    instance: FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ],
    opts: Options
  ): js.Promise[Unit]
  @JSName("default")
  var default_Original: FastifyPluginAsync[Options, Server, TypeProvider]
}
object DefaultFastifyPluginAsync {
  
  inline def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
    default: (/* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], Options) => js.Promise[Unit]
  ): DefaultFastifyPluginAsync[Options, Server, TypeProvider] = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction2(default))
    __obj.asInstanceOf[DefaultFastifyPluginAsync[Options, Server, TypeProvider]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultFastifyPluginAsync[?, ?, ?], Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] (val x: Self & (DefaultFastifyPluginAsync[Options, Server, TypeProvider])) extends AnyVal {
    
    inline def setDefault(
      value: (/* instance */ FastifyInstance[
          Server, 
          RawRequestDefaultExpression[Server], 
          RawReplyDefaultExpression[Server], 
          FastifyBaseLogger, 
          TypeProvider
        ], Options) => js.Promise[Unit]
    ): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
  }
}
