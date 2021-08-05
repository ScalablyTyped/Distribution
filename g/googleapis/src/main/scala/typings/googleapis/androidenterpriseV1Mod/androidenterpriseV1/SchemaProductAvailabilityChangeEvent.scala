package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated whenever a product&#39;s availability changes.
  */
trait SchemaProductAvailabilityChangeEvent extends StObject {
  
  /**
    * The new state of the product. This field will always be present.
    */
  var availabilityStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the product availability changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaProductAvailabilityChangeEvent {
  
  inline def apply(): SchemaProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAvailabilityChangeEvent]
  }
  
  extension [Self <: SchemaProductAvailabilityChangeEvent](x: Self) {
    
    inline def setAvailabilityStatus(value: String): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
