package typings.feedme

import typings.feedme.distParserMod.Feed
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeedmeMod {
  
  @JSImport("feedme/dist/feedme", JSImport.Default)
  @js.native
  /**
    * Creates an instance of a parser. Parser can be JSON/XML.
    *
    * @param {boolean} buffer If true, feed will be buffered into memory
    *   and can be retrieved using `parser.done()` on the `end` event.
    * @constructor
    */
  open class default () extends FeedMe {
    def this(buffer: Boolean) = this()
  }
  
  @js.native
  trait FeedMe extends Writable {
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _parser: Any = js.native
    
    def _proxyEvents(): Unit = js.native
    
    /**
      * @param {Buffer} data
      */
    def _write(
      data: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def done(): js.UndefOr[Feed] = js.native
  }
}
