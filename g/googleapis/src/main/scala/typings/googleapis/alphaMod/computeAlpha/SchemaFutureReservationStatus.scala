package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFutureReservationStatus extends StObject {
  
  /**
    * Fully qualified urls of the automatically created reservations at start_time.
    */
  var autoCreatedReservations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This count indicates the fulfilled capacity so far. This is set during "PROVISIONING" state. This count also includes capacity delivered as part of existing matching reservations.
    */
  var fulfilledCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when Future Reservation would become LOCKED, after which no modifications to Future Reservation will be allowed. Applicable only after the Future Reservation is in the APPROVED state. The lock_time is an RFC3339 string. The procurement_status will transition to PROCURING state at this time.
    */
  var lockTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current state of this Future Reservation
    */
  var procurementStatus: js.UndefOr[String | Null] = js.undefined
  
  var specificSkuProperties: js.UndefOr[SchemaFutureReservationStatusSpecificSKUProperties] = js.undefined
}
object SchemaFutureReservationStatus {
  
  inline def apply(): SchemaFutureReservationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFutureReservationStatus]
  }
  
  extension [Self <: SchemaFutureReservationStatus](x: Self) {
    
    inline def setAutoCreatedReservations(value: js.Array[String]): Self = StObject.set(x, "autoCreatedReservations", value.asInstanceOf[js.Any])
    
    inline def setAutoCreatedReservationsNull: Self = StObject.set(x, "autoCreatedReservations", null)
    
    inline def setAutoCreatedReservationsUndefined: Self = StObject.set(x, "autoCreatedReservations", js.undefined)
    
    inline def setAutoCreatedReservationsVarargs(value: String*): Self = StObject.set(x, "autoCreatedReservations", js.Array(value*))
    
    inline def setFulfilledCount(value: String): Self = StObject.set(x, "fulfilledCount", value.asInstanceOf[js.Any])
    
    inline def setFulfilledCountNull: Self = StObject.set(x, "fulfilledCount", null)
    
    inline def setFulfilledCountUndefined: Self = StObject.set(x, "fulfilledCount", js.undefined)
    
    inline def setLockTime(value: String): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
    
    inline def setLockTimeNull: Self = StObject.set(x, "lockTime", null)
    
    inline def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
    
    inline def setProcurementStatus(value: String): Self = StObject.set(x, "procurementStatus", value.asInstanceOf[js.Any])
    
    inline def setProcurementStatusNull: Self = StObject.set(x, "procurementStatus", null)
    
    inline def setProcurementStatusUndefined: Self = StObject.set(x, "procurementStatus", js.undefined)
    
    inline def setSpecificSkuProperties(value: SchemaFutureReservationStatusSpecificSKUProperties): Self = StObject.set(x, "specificSkuProperties", value.asInstanceOf[js.Any])
    
    inline def setSpecificSkuPropertiesUndefined: Self = StObject.set(x, "specificSkuProperties", js.undefined)
  }
}
