package typings.ecmarkup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterLineBuilderMod {
  
  @JSImport("ecmarkup/lib/formatter/line-builder", "LineBuilder")
  @js.native
  open class LineBuilder protected () extends StObject {
    def this(indent: Double) = this()
    
    def append(other: LineBuilder): Unit = js.native
    
    def appendLine(text: String): Unit = js.native
    def appendLine(text: String, allowMultiSpace: Boolean): Unit = js.native
    
    def appendText(text: String): Unit = js.native
    def appendText(text: String, allowMultiSpace: Boolean): Unit = js.native
    
    var firstLineIsPartial: Boolean = js.native
    
    var indent: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def last: String = js.native
    def last_=(o: String): Unit = js.native
    
    def linebreak(): Unit = js.native
    
    var lines: js.Array[String] = js.native
    
    /* private */ var needsIndent: Any = js.native
    
    def trim(): Unit = js.native
  }
}
