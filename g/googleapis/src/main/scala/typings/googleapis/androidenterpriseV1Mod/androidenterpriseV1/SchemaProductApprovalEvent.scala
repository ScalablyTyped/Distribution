package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductApprovalEvent extends StObject {
  
  /**
    * Whether the product was approved or unapproved. This field will always be present.
    */
  var approved: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the product (e.g. "app:com.google.android.gm") for which the approval status has changed. This field will always be present.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductApprovalEvent {
  
  inline def apply(): SchemaProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductApprovalEvent]
  }
  
  extension [Self <: SchemaProductApprovalEvent](x: Self) {
    
    inline def setApproved(value: String): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setApprovedNull: Self = StObject.set(x, "approved", null)
    
    inline def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
