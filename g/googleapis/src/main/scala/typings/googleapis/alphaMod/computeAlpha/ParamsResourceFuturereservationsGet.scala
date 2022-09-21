package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFuturereservationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the future reservation to retrieve. Name should conform to RFC1035.
    */
  var futureReservation: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the zone for this request. Name should conform to RFC1035.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceFuturereservationsGet {
  
  inline def apply(): ParamsResourceFuturereservationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFuturereservationsGet]
  }
  
  extension [Self <: ParamsResourceFuturereservationsGet](x: Self) {
    
    inline def setFutureReservation(value: String): Self = StObject.set(x, "futureReservation", value.asInstanceOf[js.Any])
    
    inline def setFutureReservationUndefined: Self = StObject.set(x, "futureReservation", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
