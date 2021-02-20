package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hunk extends StObject {
  
  var linedelimiters: js.Array[String] = js.native
  
  var lines: js.Array[String] = js.native
  
  var newLines: Double = js.native
  
  var newStart: Double = js.native
  
  var oldLines: Double = js.native
  
  var oldStart: Double = js.native
}
object Hunk {
  
  @scala.inline
  def apply(
    linedelimiters: js.Array[String],
    lines: js.Array[String],
    newLines: Double,
    newStart: Double,
    oldLines: Double,
    oldStart: Double
  ): Hunk = {
    val __obj = js.Dynamic.literal(linedelimiters = linedelimiters.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hunk]
  }
  
  @scala.inline
  implicit class HunkMutableBuilder[Self <: Hunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinedelimiters(value: js.Array[String]): Self = StObject.set(x, "linedelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinedelimitersVarargs(value: String*): Self = StObject.set(x, "linedelimiters", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setNewLines(value: Double): Self = StObject.set(x, "newLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStart(value: Double): Self = StObject.set(x, "newStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLines(value: Double): Self = StObject.set(x, "oldLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldStart(value: Double): Self = StObject.set(x, "oldStart", value.asInstanceOf[js.Any])
  }
}
