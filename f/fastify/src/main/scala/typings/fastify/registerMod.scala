package typings.fastify

import typings.fastify.anon.Default
import typings.fastify.anon.DefaultFastifyPluginAsync
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.loggerMod.LogLevel
import typings.fastify.pluginMod.FastifyPluginAsync
import typings.fastify.pluginMod.FastifyPluginCallback
import typings.fastify.pluginMod.FastifyPluginOptions
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

object registerMod {
  
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
    
    extension [Self <: RegisterOptions](x: Self) {
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogSerializers(value: Record[String, js.Function1[/* value */ Any, String]]): Self = StObject.set(x, "logSerializers", value.asInstanceOf[js.Any])
      
      inline def setLogSerializersUndefined: Self = StObject.set(x, "logSerializers", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
