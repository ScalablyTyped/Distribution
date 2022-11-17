package typings.expo

import typings.expo.anon.Error
import typings.fbemitter.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLogsRemoteLoggingMod {
  
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
        /* data */ js.Array[Any], 
        js.Promise[Unit]
      ] = js.native
    inline def enqueueRemoteLogAsync_=(
      x: js.Function3[
          /* level */ LogLevel, 
          /* additionalFields */ LogEntryFields, 
          /* data */ js.Array[Any], 
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
  
  object LogLevel {
    
    inline def debug: "debug" = "debug".asInstanceOf["debug"]
    
    inline def error: "error" = "error".asInstanceOf["error"]
    
    inline def info: "info" = "info".asInstanceOf["info"]
    
    inline def warn: "warn" = "warn".asInstanceOf["warn"]
  }
  type LogLevel = "debug" | "info" | "warn" | "error"
  
  type TransportErrorListener = js.Function1[/* event */ Error, Unit]
}
