package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionCommitmentsUpdateReservationsRequest extends StObject {
  
  /**
    * A list of two reservations to transfer GPUs and local SSD between.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.undefined
}
object SchemaRegionCommitmentsUpdateReservationsRequest {
  
  inline def apply(): SchemaRegionCommitmentsUpdateReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionCommitmentsUpdateReservationsRequest]
  }
  
  extension [Self <: SchemaRegionCommitmentsUpdateReservationsRequest](x: Self) {
    
    inline def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    inline def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value*))
  }
}
