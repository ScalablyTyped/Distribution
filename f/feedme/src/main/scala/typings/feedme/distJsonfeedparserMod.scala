package typings.feedme

import typings.feedme.distParserMod.Parser
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsonfeedparserMod {
  
  @JSImport("feedme/dist/jsonfeedparser", JSImport.Default)
  @js.native
  open class default protected () extends JSONFeedParser {
    def this(buffer: Boolean) = this()
  }
  
  @js.native
  trait JSONFeedParser extends Parser {
    
    /* private */ var _currKey: Any = js.native
    
    /* private */ var _currObj: Any = js.native
    
    def _write(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
}
