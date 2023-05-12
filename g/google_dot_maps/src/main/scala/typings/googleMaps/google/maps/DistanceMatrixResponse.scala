package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceMatrixResponse extends StObject {
  
  /**
    * The formatted destination addresses.
    */
  var destinationAddresses: js.Array[String]
  
  /**
    * The formatted origin addresses.
    */
  var originAddresses: js.Array[String]
  
  /**
    * The rows of the matrix, corresponding to the origin addresses.
    */
  var rows: js.Array[DistanceMatrixResponseRow]
}
object DistanceMatrixResponse {
  
  inline def apply(
    destinationAddresses: js.Array[String],
    originAddresses: js.Array[String],
    rows: js.Array[DistanceMatrixResponseRow]
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destinationAddresses = destinationAddresses.asInstanceOf[js.Any], originAddresses = originAddresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceMatrixResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinationAddresses(value: js.Array[String]): Self = StObject.set(x, "destinationAddresses", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressesVarargs(value: String*): Self = StObject.set(x, "destinationAddresses", js.Array(value*))
    
    inline def setOriginAddresses(value: js.Array[String]): Self = StObject.set(x, "originAddresses", value.asInstanceOf[js.Any])
    
    inline def setOriginAddressesVarargs(value: String*): Self = StObject.set(x, "originAddresses", js.Array(value*))
    
    inline def setRows(value: js.Array[DistanceMatrixResponseRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: DistanceMatrixResponseRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
