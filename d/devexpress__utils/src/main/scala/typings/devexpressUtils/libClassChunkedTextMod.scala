package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassChunkedTextMod {
  
  @JSImport("@devexpress/utils/lib/class/chunked-text", "ChunkedText")
  @js.native
  open class ChunkedText protected () extends StObject {
    def this(text: String) = this()
    def this(text: String, maxChunkSize: Double) = this()
    
    /* protected */ var _currPos: Double = js.native
    
    /* protected */ var _textLength: Double = js.native
    
    def addText(text: String): Unit = js.native
    
    /* protected */ var chunk: String = js.native
    
    /* protected */ var chunkIndex: Double = js.native
    
    /* protected */ var chunkLength: Double = js.native
    
    /* protected */ var chunks: js.Array[String] = js.native
    
    def currChar: String = js.native
    
    def currPos: Double = js.native
    
    def getText(): String = js.native
    
    /* protected */ var maxChunkSize: Double = js.native
    
    def moveToNextChar(): Boolean = js.native
    
    def moveToPrevChar(): Boolean = js.native
    
    /* protected */ var posInChunk: Double = js.native
    
    /* private */ var pushText: Any = js.native
    
    def resetToEnd(): Unit = js.native
    
    def resetToStart(): Unit = js.native
    
    /* private */ var setChunk: Any = js.native
    
    def setPositionTo(position: Double): Unit = js.native
    
    def textLength: Double = js.native
  }
}
