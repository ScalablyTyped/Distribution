package typings.feedme

import typings.feedme.parserMod.Parser
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlfeedparserMod {
  
  @JSImport("feedme/dist/xmlfeedparser", JSImport.Default)
  @js.native
  open class default protected () extends XMLFeedParser {
    def this(buffer: Boolean) = this()
  }
  
  @js.native
  trait XMLFeedParser extends Parser {
    
    /* private */ var _obj: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    def _write(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
}
