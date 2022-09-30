package typings.gestalt.anon

import typings.gestalt.mod.UnsignedUpTo12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: UnsignedUpTo12
  
  var row: UnsignedUpTo12
}
object Column {
  
  inline def apply(column: UnsignedUpTo12, row: UnsignedUpTo12): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: UnsignedUpTo12): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: UnsignedUpTo12): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
