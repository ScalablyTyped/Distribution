package typings.expo

import typings.expo.anon.Response
import typings.fbemitter.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteLoggingMod {
  
  @JSImport("expo/build/logs/RemoteLogging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("expo/build/logs/RemoteLogging", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo/build/logs/RemoteLogging", "default.addTransportErrorListener")
    @js.native
    def addTransportErrorListener: js.Function1[/* listener */ TransportErrorListener, EventSubscription] = js.native
    inline def addTransportErrorListener_=(x: js.Function1[/* listener */ TransportErrorListener, EventSubscription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addTransportErrorListener")(x.asInstanceOf[js.Any])
    
    @JSImport("expo/build/logs/RemoteLogging", "default.enqueueRemoteLogAsync")
    @js.native
    def enqueueRemoteLogAsync: js.Function3[
        /* level */ LogLevel, 
        /* additionalFields */ LogEntryFields, 
        /* data */ js.Array[js.Any], 
        js.Promise[Unit]
      ] = js.native
    inline def enqueueRemoteLogAsync_=(
      x: js.Function3[
          /* level */ LogLevel, 
          /* additionalFields */ LogEntryFields, 
          /* data */ js.Array[js.Any], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enqueueRemoteLogAsync")(x.asInstanceOf[js.Any])
  }
  
  inline def waitForEmptyLogQueueAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("__waitForEmptyLogQueueAsync")().asInstanceOf[js.Promise[Unit]]
  
  type LogData = String | LogErrorData
  
  trait LogEntryFields extends StObject {
    
    var groupCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var groupDepth: js.UndefOr[Double] = js.undefined
    
    var shouldHide: js.UndefOr[Boolean] = js.undefined
  }
  object LogEntryFields {
    
    inline def apply(): LogEntryFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogEntryFields]
    }
    
    extension [Self <: LogEntryFields](x: Self) {
      
      inline def setGroupCollapsed(value: Boolean): Self = StObject.set(x, "groupCollapsed", value.asInstanceOf[js.Any])
      
      inline def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
      
      inline def setGroupDepth(value: Double): Self = StObject.set(x, "groupDepth", value.asInstanceOf[js.Any])
      
      inline def setGroupDepthUndefined: Self = StObject.set(x, "groupDepth", js.undefined)
      
      inline def setShouldHide(value: Boolean): Self = StObject.set(x, "shouldHide", value.asInstanceOf[js.Any])
      
      inline def setShouldHideUndefined: Self = StObject.set(x, "shouldHide", js.undefined)
    }
  }
  
  trait LogErrorData extends StObject {
    
    var message: String
    
    var stack: String
  }
  object LogErrorData {
    
    inline def apply(message: String, stack: String): LogErrorData = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogErrorData]
    }
    
    extension [Self <: LogErrorData](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoStrings.debug
    - typings.expo.expoStrings.info
    - typings.expo.expoStrings.warn
    - typings.expo.expoStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.expo.expoStrings.debug = "debug".asInstanceOf[typings.expo.expoStrings.debug]
    
    inline def error: typings.expo.expoStrings.error = "error".asInstanceOf[typings.expo.expoStrings.error]
    
    inline def info: typings.expo.expoStrings.info = "info".asInstanceOf[typings.expo.expoStrings.info]
    
    inline def warn: typings.expo.expoStrings.warn = "warn".asInstanceOf[typings.expo.expoStrings.warn]
  }
  
  type TransportErrorListener = js.Function1[/* event */ Response, Unit]
}
