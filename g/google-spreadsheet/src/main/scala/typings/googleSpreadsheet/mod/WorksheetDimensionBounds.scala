package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetDimensionBounds extends StObject {
  
  var endIndex: Double
  
  var startIndex: Double
}
object WorksheetDimensionBounds {
  
  inline def apply(endIndex: Double, startIndex: Double): WorksheetDimensionBounds = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetDimensionBounds]
  }
  
  extension [Self <: WorksheetDimensionBounds](x: Self) {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
