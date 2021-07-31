package typings.expressPinoLogger

import typings.pino.mod.DestinationStream
import typings.pino.mod.Logger
import typings.pinoHttp.mod.HttpLogger
import typings.pinoHttp.mod.Options
import typings.pinoHttp.mod.ReqId
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): HttpLogger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[HttpLogger]
  @scala.inline
  def apply(opts: Unit, stream: DestinationStream): HttpLogger = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[HttpLogger]
  @scala.inline
  def apply(opts: Options): HttpLogger = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[HttpLogger]
  @scala.inline
  def apply(opts: Options, stream: DestinationStream): HttpLogger = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[HttpLogger]
  @scala.inline
  def apply(stream: DestinationStream): HttpLogger = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[HttpLogger]
  
  @JSImport("express-pino-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-pino-logger", "startTime")
  @js.native
  val startTime: js.Symbol = js.native
  
  /* augmented module */
  object httpAugmentingMod {
    
    trait IncomingMessage extends StObject {
      
      var id: ReqId
      
      var log: Logger
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
    
    trait ServerResponse extends StObject {
      
      var err: js.UndefOr[Error] = js.undefined
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
