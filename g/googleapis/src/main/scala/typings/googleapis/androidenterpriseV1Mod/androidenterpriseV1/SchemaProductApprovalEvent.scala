package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when a product&#39;s approval status is changed.
  */
trait SchemaProductApprovalEvent extends StObject {
  
  /**
    * Whether the product was approved or unapproved. This field will always be
    * present.
    */
  var approved: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the approval status has changed. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaProductApprovalEvent {
  
  @scala.inline
  def apply(): SchemaProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductApprovalEvent]
  }
  
  @scala.inline
  implicit class SchemaProductApprovalEventMutableBuilder[Self <: SchemaProductApprovalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproved(value: String): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
