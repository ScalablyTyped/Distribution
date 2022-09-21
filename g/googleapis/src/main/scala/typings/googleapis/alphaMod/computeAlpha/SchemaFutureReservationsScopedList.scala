package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFutureReservationsScopedList extends StObject {
  
  /**
    * A list of future reservations contained in this scope.
    */
  var futureReservations: js.UndefOr[js.Array[SchemaFutureReservation]] = js.undefined
  
  /**
    * Informational warning which replaces the list of future reservations when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaFutureReservationsScopedList {
  
  inline def apply(): SchemaFutureReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFutureReservationsScopedList]
  }
  
  extension [Self <: SchemaFutureReservationsScopedList](x: Self) {
    
    inline def setFutureReservations(value: js.Array[SchemaFutureReservation]): Self = StObject.set(x, "futureReservations", value.asInstanceOf[js.Any])
    
    inline def setFutureReservationsUndefined: Self = StObject.set(x, "futureReservations", js.undefined)
    
    inline def setFutureReservationsVarargs(value: SchemaFutureReservation*): Self = StObject.set(x, "futureReservations", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
