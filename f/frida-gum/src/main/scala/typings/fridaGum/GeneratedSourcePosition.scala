package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedSourcePosition extends StObject {
  
  /**
    * Column number, if available.
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * Line number.
    */
  var line: Double
}
object GeneratedSourcePosition {
  
  @scala.inline
  def apply(line: Double): GeneratedSourcePosition = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSourcePosition]
  }
  
  @scala.inline
  implicit class GeneratedSourcePositionMutableBuilder[Self <: GeneratedSourcePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
