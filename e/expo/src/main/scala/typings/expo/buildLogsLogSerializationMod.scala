package typings.expo

import typings.expo.buildLogsRemoteLoggingMod.LogData
import typings.expo.buildLogsRemoteLoggingMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLogsLogSerializationMod {
  
  object default {
    
    @JSImport("expo/build/logs/LogSerialization", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo/build/logs/LogSerialization", "default.serializeLogDataAsync")
    @js.native
    def serializeLogDataAsync: js.Function2[/* data */ js.Array[Any], /* level */ LogLevel, js.Promise[SerializedData]] = js.native
    inline def serializeLogDataAsync_=(x: js.Function2[/* data */ js.Array[Any], /* level */ LogLevel, js.Promise[SerializedData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializeLogDataAsync")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("expo/build/logs/LogSerialization", "EXPO_CONSOLE_METHOD_NAME")
  @js.native
  val EXPO_CONSOLE_METHOD_NAME: /* "__expoConsoleLog" */ String = js.native
  
  trait SerializedData extends StObject {
    
    var body: js.Array[LogData]
    
    var includesStack: Boolean
  }
  object SerializedData {
    
    inline def apply(body: js.Array[LogData], includesStack: Boolean): SerializedData = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], includesStack = includesStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedData]
    }
    
    extension [Self <: SerializedData](x: Self) {
      
      inline def setBody(value: js.Array[LogData]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: LogData*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setIncludesStack(value: Boolean): Self = StObject.set(x, "includesStack", value.asInstanceOf[js.Any])
    }
  }
}
