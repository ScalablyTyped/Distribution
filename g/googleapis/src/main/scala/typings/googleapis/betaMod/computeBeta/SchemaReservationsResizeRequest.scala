package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservationsResizeRequest extends StObject {
  
  /**
    * Number of allocated resources can be resized with minimum = 1 and maximum
    * = 1000.
    */
  var specificSkuCount: js.UndefOr[String] = js.undefined
}
object SchemaReservationsResizeRequest {
  
  @scala.inline
  def apply(): SchemaReservationsResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsResizeRequest]
  }
  
  @scala.inline
  implicit class SchemaReservationsResizeRequestMutableBuilder[Self <: SchemaReservationsResizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpecificSkuCount(value: String): Self = StObject.set(x, "specificSkuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificSkuCountUndefined: Self = StObject.set(x, "specificSkuCount", js.undefined)
  }
}
