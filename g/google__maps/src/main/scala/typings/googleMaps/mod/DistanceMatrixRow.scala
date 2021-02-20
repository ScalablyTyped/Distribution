package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMatrixRow extends StObject {
  
  var elements: js.Array[DistanceMatrixRowElement] = js.native
}
object DistanceMatrixRow {
  
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixRowElement]): DistanceMatrixRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixRow]
  }
  
  @scala.inline
  implicit class DistanceMatrixRowMutableBuilder[Self <: DistanceMatrixRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[DistanceMatrixRowElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: DistanceMatrixRowElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
