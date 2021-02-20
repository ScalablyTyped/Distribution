package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalSourcePosition extends StObject {
  
  /**
    * Column number.
    */
  var column: Double = js.native
  
  /**
    * Line number.
    */
  var line: Double = js.native
  
  /**
    * Identifier, if available.
    */
  var name: String | Null = js.native
  
  /**
    * Source file name.
    */
  var source: String = js.native
}
object OriginalSourcePosition {
  
  @scala.inline
  def apply(column: Double, line: Double, source: String): OriginalSourcePosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalSourcePosition]
  }
  
  @scala.inline
  implicit class OriginalSourcePositionMutableBuilder[Self <: OriginalSourcePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
