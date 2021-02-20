package typings.expressPinoLogger

import typings.pino.mod.DestinationStream
import typings.pino.mod.Logger
import typings.pinoHttp.mod.HttpLogger
import typings.pinoHttp.mod.Options
import typings.pinoHttp.mod.ReqId
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-pino-logger", JSImport.Namespace)
  @js.native
  def apply(): HttpLogger = js.native
  @JSImport("express-pino-logger", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): HttpLogger = js.native
  @JSImport("express-pino-logger", JSImport.Namespace)
  @js.native
  def apply(opts: Options): HttpLogger = js.native
  @JSImport("express-pino-logger", JSImport.Namespace)
  @js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  @JSImport("express-pino-logger", JSImport.Namespace)
  @js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
  
  @JSImport("express-pino-logger", "startTime")
  @js.native
  val startTime: js.Symbol = js.native
  
  /* augmented module */
  object httpAugmentingMod {
    
    @js.native
    trait IncomingMessage extends StObject {
      
      var id: ReqId = js.native
      
      var log: Logger = js.native
    }
    object IncomingMessage {
      
      @scala.inline
      def apply(id: ReqId, log: Logger): IncomingMessage = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[IncomingMessage]
      }
      
      @scala.inline
      implicit class IncomingMessageMutableBuilder[Self <: IncomingMessage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: ReqId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OutgoingMessage extends StObject
    
    @js.native
    trait ServerResponse extends StObject {
      
      var err: js.UndefOr[Error] = js.native
    }
    object ServerResponse {
      
      @scala.inline
      def apply(): ServerResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ServerResponse]
      }
      
      @scala.inline
      implicit class ServerResponseMutableBuilder[Self <: ServerResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      }
    }
  }
}
