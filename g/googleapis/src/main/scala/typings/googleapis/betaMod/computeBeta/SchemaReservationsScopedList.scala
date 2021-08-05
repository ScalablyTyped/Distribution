package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservationsScopedList extends StObject {
  
  /**
    * A list of reservations contained in this scope.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.undefined
  
  /**
    * Informational warning which replaces the list of reservations when the
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaReservationsScopedList {
  
  inline def apply(): SchemaReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsScopedList]
  }
  
  extension [Self <: SchemaReservationsScopedList](x: Self) {
    
    inline def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    inline def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
