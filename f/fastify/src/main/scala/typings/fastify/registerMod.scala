package typings.fastify

import typings.fastify.anon.Default
import typings.fastify.anon.DefaultFastifyPluginAsync
import typings.fastify.loggerMod.LogLevel
import typings.fastify.pluginMod.FastifyPluginAsync
import typings.fastify.pluginMod.FastifyPluginCallback
import typings.fastify.pluginMod.FastifyPluginOptions
import typings.fastify.utilsMod.RawServerDefault
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @js.native
  trait FastifyRegister[T] extends StObject {
    
    def apply[Options /* <: FastifyPluginOptions */](plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](
      plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]],
      opts: FastifyRegisterOptions[Options]
    ): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): T = js.native
  }
  
  type FastifyRegisterOptions[Options] = (RegisterOptions & Options) | (js.Function0[RegisterOptions & Options])
  
  trait RegisterOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var logSerializers: js.UndefOr[Record[String, js.Function1[/* value */ js.Any, String]]] = js.undefined
    
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
      
      inline def setLogSerializers(value: Record[String, js.Function1[/* value */ js.Any, String]]): Self = StObject.set(x, "logSerializers", value.asInstanceOf[js.Any])
      
      inline def setLogSerializersUndefined: Self = StObject.set(x, "logSerializers", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
