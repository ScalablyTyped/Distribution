package typings.expo

import typings.expo.anon.Response
import typings.fbemitter.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteLoggingMod {
  
  object default {
    
    @JSImport("expo/build/logs/RemoteLogging", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo/build/logs/RemoteLogging", "default.addTransportErrorListener")
    @js.native
    def addTransportErrorListener: js.Function1[/* listener */ TransportErrorListener, EventSubscription] = js.native
    @scala.inline
    def addTransportErrorListener_=(x: js.Function1[/* listener */ TransportErrorListener, EventSubscription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addTransportErrorListener")(x.asInstanceOf[js.Any])
    
    @JSImport("expo/build/logs/RemoteLogging", "default.enqueueRemoteLogAsync")
    @js.native
    def enqueueRemoteLogAsync: js.Function3[
        /* level */ LogLevel, 
        /* additionalFields */ LogEntryFields, 
        /* data */ js.Array[js.Any], 
        js.Promise[Unit]
      ] = js.native
    @scala.inline
    def enqueueRemoteLogAsync_=(
      x: js.Function3[
          /* level */ LogLevel, 
          /* additionalFields */ LogEntryFields, 
          /* data */ js.Array[js.Any], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enqueueRemoteLogAsync")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("expo/build/logs/RemoteLogging", "__waitForEmptyLogQueueAsync")
  @js.native
  def waitForEmptyLogQueueAsync(): js.Promise[Unit] = js.native
  
  type LogData = String | LogErrorData
  
  @js.native
  trait LogEntryFields extends StObject {
    
    var groupCollapsed: js.UndefOr[Boolean] = js.native
    
    var groupDepth: js.UndefOr[Double] = js.native
    
    var shouldHide: js.UndefOr[Boolean] = js.native
  }
  object LogEntryFields {
    
    @scala.inline
    def apply(): LogEntryFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogEntryFields]
    }
    
    @scala.inline
    implicit class LogEntryFieldsMutableBuilder[Self <: LogEntryFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupCollapsed(value: Boolean): Self = StObject.set(x, "groupCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
      
      @scala.inline
      def setGroupDepth(value: Double): Self = StObject.set(x, "groupDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupDepthUndefined: Self = StObject.set(x, "groupDepth", js.undefined)
      
      @scala.inline
      def setShouldHide(value: Boolean): Self = StObject.set(x, "shouldHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldHideUndefined: Self = StObject.set(x, "shouldHide", js.undefined)
    }
  }
  
  @js.native
  trait LogErrorData extends StObject {
    
    var message: String = js.native
    
    var stack: String = js.native
  }
  object LogErrorData {
    
    @scala.inline
    def apply(message: String, stack: String): LogErrorData = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogErrorData]
    }
    
    @scala.inline
    implicit class LogErrorDataMutableBuilder[Self <: LogErrorData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def debug: typings.expo.expoStrings.debug = "debug".asInstanceOf[typings.expo.expoStrings.debug]
    
    @scala.inline
    def error: typings.expo.expoStrings.error = "error".asInstanceOf[typings.expo.expoStrings.error]
    
    @scala.inline
    def info: typings.expo.expoStrings.info = "info".asInstanceOf[typings.expo.expoStrings.info]
    
    @scala.inline
    def warn: typings.expo.expoStrings.warn = "warn".asInstanceOf[typings.expo.expoStrings.warn]
  }
  
  type TransportErrorListener = js.Function1[/* event */ Response, Unit]
}
