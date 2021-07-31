package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunkedTextMod {
  
  @JSImport("@devexpress/utils/lib/class/chunked-text", "ChunkedText")
  @js.native
  class ChunkedText protected () extends StObject {
    def this(text: String) = this()
    def this(text: String, maxChunkSize: Double) = this()
    
    var _currPos: Double = js.native
    
    var _textLength: Double = js.native
    
    def addText(text: String): Unit = js.native
    
    var chunk: String = js.native
    
    var chunkIndex: Double = js.native
    
    var chunkLength: Double = js.native
    
    var chunks: js.Array[String] = js.native
    
    val currChar: String = js.native
    
    val currPos: Double = js.native
    
    def getText(): String = js.native
    
    var maxChunkSize: Double = js.native
    
    def moveToNextChar(): Boolean = js.native
    
    def moveToPrevChar(): Boolean = js.native
    
    var posInChunk: Double = js.native
    
    var pushText: js.Any = js.native
    
    def resetToEnd(): Unit = js.native
    
    def resetToStart(): Unit = js.native
    
    var setChunk: js.Any = js.native
    
    def setPositionTo(position: Double): Unit = js.native
    
    val textLength: Double = js.native
  }
}
