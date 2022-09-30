package typings.expoDevServer.anon

import typings.expoBunyan.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var logger: ^
  
  var port: Double
  
  var watchFolders: js.Array[String]
}
object Logger {
  
  inline def apply(logger: ^, port: Double, watchFolders: js.Array[String]): Logger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setLogger(value: ^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
    
    inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
  }
}
