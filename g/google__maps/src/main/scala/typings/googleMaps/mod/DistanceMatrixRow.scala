package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceMatrixRow extends StObject {
  
  var elements: js.Array[DistanceMatrixRowElement]
}
object DistanceMatrixRow {
  
  inline def apply(elements: js.Array[DistanceMatrixRowElement]): DistanceMatrixRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixRow]
  }
  
  extension [Self <: DistanceMatrixRow](x: Self) {
    
    inline def setElements(value: js.Array[DistanceMatrixRowElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: DistanceMatrixRowElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
