package typings.fastify

import typings.fastify.anon.Default
import typings.fastify.anon.DefaultFastifyPluginAsync
import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesLoggerMod.LogLevel
import typings.fastify.typesPluginMod.FastifyPluginAsync
import typings.fastify.typesPluginMod.FastifyPluginCallback
import typings.fastify.typesPluginMod.FastifyPluginOptions
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

object typesRegisterMod {
  
  @js.native
  trait FastifyRegister[T, RawServer /* <: RawServerBase */, TypeProviderDefault /* <: FastifyTypeProvider */] extends StObject {
    
    def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
      plugin: js.Promise[
          (Default[Options, Server, TypeProvider]) | (DefaultFastifyPluginAsync[Options, Server, TypeProvider])
        ]
    ): T = js.native
    def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
      plugin: js.Promise[
          (Default[Options, Server, TypeProvider]) | (DefaultFastifyPluginAsync[Options, Server, TypeProvider])
        ],
      opts: FastifyRegisterOptions[Options]
    ): T = js.native
    def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](plugin: FastifyPluginAsync[Options, Server, TypeProvider]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](plugin: FastifyPluginAsync[Options, Server, TypeProvider], opts: FastifyRegisterOptions[Options]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](plugin: FastifyPluginCallback[Options, Server, TypeProvider]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
      plugin: FastifyPluginCallback[Options, Server, TypeProvider],
      opts: FastifyRegisterOptions[Options]
    ): T = js.native
  }
  
  type FastifyRegisterOptions[Options] = (RegisterOptions & Options) | (js.Function1[
    /* instance */ FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyBaseLogger, 
      FastifyTypeProviderDefault
    ], 
    RegisterOptions & Options
  ])
  
  trait RegisterOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var logSerializers: js.UndefOr[Record[String, js.Function1[/* value */ Any, String]]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogSerializers(value: Record[String, js.Function1[/* value */ Any, String]]): Self = StObject.set(x, "logSerializers", value.asInstanceOf[js.Any])
      
      inline def setLogSerializersUndefined: Self = StObject.set(x, "logSerializers", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
