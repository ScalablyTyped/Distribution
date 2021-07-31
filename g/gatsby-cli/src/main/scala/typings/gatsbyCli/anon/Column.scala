package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: js.Any
  
  var filePath: js.Any
  
  var line: js.Any
  
  var path: js.Any
}
object Column {
  
  @scala.inline
  def apply(column: js.Any, filePath: js.Any, line: js.Any, path: js.Any): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: js.Any): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: js.Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
