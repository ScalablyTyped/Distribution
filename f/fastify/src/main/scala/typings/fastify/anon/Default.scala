package typings.fastify.anon

import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesPluginMod.FastifyPluginCallback
import typings.fastify.typesPluginMod.FastifyPluginOptions
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default[?, ?, ?], Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] (val x: Self & (Default[Options, Server, TypeProvider])) extends AnyVal {
    
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
