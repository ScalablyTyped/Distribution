package typings.expoXcpretty

import typings.expoXcpretty.formatterMod.Formatter
import typings.expoXcpretty.parserMod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metroParserMod {
  
  @JSImport("@expo/xcpretty/build/MetroParser", "MetroParser")
  @js.native
  open class MetroParser protected () extends Parser {
    def this(formatter: Formatter) = this()
    
    def checkMetroError(text: String): String = js.native
    
    /* private */ var isCollectingMetroError: Any = js.native
    
    /* private */ var metroError: Any = js.native
  }
}
