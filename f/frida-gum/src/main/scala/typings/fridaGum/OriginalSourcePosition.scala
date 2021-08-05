package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalSourcePosition extends StObject {
  
  /**
    * Column number.
    */
  var column: Double
  
  /**
    * Line number.
    */
  var line: Double
  
  /**
    * Identifier, if available.
    */
  var name: String | Null
  
  /**
    * Source file name.
    */
  var source: String
}
object OriginalSourcePosition {
  
  inline def apply(column: Double, line: Double, source: String): OriginalSourcePosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], name = null)
    __obj.asInstanceOf[OriginalSourcePosition]
  }
  
  extension [Self <: OriginalSourcePosition](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
