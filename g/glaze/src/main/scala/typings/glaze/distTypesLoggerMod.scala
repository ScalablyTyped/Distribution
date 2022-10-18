package typings.glaze

import typings.glaze.anon.PickConsoleLogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoggerMod {
  
  @JSImport("glaze/dist-types/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorOnce(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLogger(logger: PickConsoleLogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warnOnce(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnOnce")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glaze.glazeStrings.warn
    - typings.glaze.glazeStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def error: typings.glaze.glazeStrings.error = "error".asInstanceOf[typings.glaze.glazeStrings.error]
    
    inline def warn: typings.glaze.glazeStrings.warn = "warn".asInstanceOf[typings.glaze.glazeStrings.warn]
  }
}
