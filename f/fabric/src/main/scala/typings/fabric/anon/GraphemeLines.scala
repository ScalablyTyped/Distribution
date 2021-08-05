package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphemeLines extends StObject {
  
  var _unwrappedLines: js.Array[String]
  
  var graphemeLines: js.Array[String]
  
  var graphemeText: js.Array[String]
  
  var lines: js.Array[String]
}
object GraphemeLines {
  
  inline def apply(
    _unwrappedLines: js.Array[String],
    graphemeLines: js.Array[String],
    graphemeText: js.Array[String],
    lines: js.Array[String]
  ): GraphemeLines = {
    val __obj = js.Dynamic.literal(_unwrappedLines = _unwrappedLines.asInstanceOf[js.Any], graphemeLines = graphemeLines.asInstanceOf[js.Any], graphemeText = graphemeText.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphemeLines]
  }
  
  extension [Self <: GraphemeLines](x: Self) {
    
    inline def setGraphemeLines(value: js.Array[String]): Self = StObject.set(x, "graphemeLines", value.asInstanceOf[js.Any])
    
    inline def setGraphemeLinesVarargs(value: String*): Self = StObject.set(x, "graphemeLines", js.Array(value :_*))
    
    inline def setGraphemeText(value: js.Array[String]): Self = StObject.set(x, "graphemeText", value.asInstanceOf[js.Any])
    
    inline def setGraphemeTextVarargs(value: String*): Self = StObject.set(x, "graphemeText", js.Array(value :_*))
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    inline def set_unwrappedLines(value: js.Array[String]): Self = StObject.set(x, "_unwrappedLines", value.asInstanceOf[js.Any])
    
    inline def set_unwrappedLinesVarargs(value: String*): Self = StObject.set(x, "_unwrappedLines", js.Array(value :_*))
  }
}
