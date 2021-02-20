package typings.glaze

import typings.glaze.anon.PickConsoleLogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("glaze/dist-types/logger", "errorOnce")
  @js.native
  def errorOnce(message: String): Unit = js.native
  
  @JSImport("glaze/dist-types/logger", "setLogger")
  @js.native
  def setLogger(logger: PickConsoleLogLevel): Unit = js.native
  
  @JSImport("glaze/dist-types/logger", "warnOnce")
  @js.native
  def warnOnce(message: String): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.glaze.glazeStrings.warn
    - typings.glaze.glazeStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def error: typings.glaze.glazeStrings.error = "error".asInstanceOf[typings.glaze.glazeStrings.error]
    
    @scala.inline
    def warn: typings.glaze.glazeStrings.warn = "warn".asInstanceOf[typings.glaze.glazeStrings.warn]
  }
}
