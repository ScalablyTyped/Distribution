package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hunk extends StObject {
  
  // Line Delimiters is only returned by parsePatch()
  var linedelimiters: js.UndefOr[js.Array[String]] = js.undefined
  
  var lines: js.Array[String]
  
  var newLines: Double
  
  var newStart: Double
  
  var oldLines: Double
  
  var oldStart: Double
}
object Hunk {
  
  inline def apply(lines: js.Array[String], newLines: Double, newStart: Double, oldLines: Double, oldStart: Double): Hunk = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hunk] (val x: Self) extends AnyVal {
    
    inline def setLinedelimiters(value: js.Array[String]): Self = StObject.set(x, "linedelimiters", value.asInstanceOf[js.Any])
    
    inline def setLinedelimitersUndefined: Self = StObject.set(x, "linedelimiters", js.undefined)
    
    inline def setLinedelimitersVarargs(value: String*): Self = StObject.set(x, "linedelimiters", js.Array(value*))
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setNewLines(value: Double): Self = StObject.set(x, "newLines", value.asInstanceOf[js.Any])
    
    inline def setNewStart(value: Double): Self = StObject.set(x, "newStart", value.asInstanceOf[js.Any])
    
    inline def setOldLines(value: Double): Self = StObject.set(x, "oldLines", value.asInstanceOf[js.Any])
    
    inline def setOldStart(value: Double): Self = StObject.set(x, "oldStart", value.asInstanceOf[js.Any])
  }
}
