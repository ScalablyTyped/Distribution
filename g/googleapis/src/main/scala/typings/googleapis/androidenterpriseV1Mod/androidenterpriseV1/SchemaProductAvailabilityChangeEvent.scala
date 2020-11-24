package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated whenever a product&#39;s availability changes.
  */
@js.native
trait SchemaProductAvailabilityChangeEvent extends js.Object {
  
  /**
    * The new state of the product. This field will always be present.
    */
  var availabilityStatus: js.UndefOr[String] = js.native
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the product availability changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
}
object SchemaProductAvailabilityChangeEvent {
  
  @scala.inline
  def apply(): SchemaProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAvailabilityChangeEvent]
  }
  
  @scala.inline
  implicit class SchemaProductAvailabilityChangeEventOps[Self <: SchemaProductAvailabilityChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityStatus(value: String): Self = this.set("availabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityStatus: Self = this.set("availabilityStatus", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
}
