package typings.fancyLog

import org.scalablytyped.runtime.Shortcut
import typings.fancyLog.mod.FancyLog.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fancy-log", JSImport.Namespace)
  @js.native
  val ^ : Logger = js.native
  
  object FancyLog {
    
    @js.native
    trait Logger extends StObject {
      
      def apply(args: js.Any*): Logger = js.native
      
      def dir(args: js.Any*): Logger = js.native
      
      def error(args: js.Any*): Logger = js.native
      
      def info(args: js.Any*): Logger = js.native
      
      def warn(args: js.Any*): Logger = js.native
    }
  }
  
  type _To = Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Logger = ^
}
