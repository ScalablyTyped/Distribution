package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when an app installation failed on a device
  */
@js.native
trait SchemaInstallFailureEvent extends StObject {
  
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * Additional details on the failure if applicable.
    */
  var failureDetails: js.UndefOr[String] = js.native
  
  /**
    * The reason for the installation failure. This field will always be
    * present.
    */
  var failureReason: js.UndefOr[String] = js.native
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the install failure event occured. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaInstallFailureEvent {
  
  @scala.inline
  def apply(): SchemaInstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallFailureEvent]
  }
  
  @scala.inline
  implicit class SchemaInstallFailureEventMutableBuilder[Self <: SchemaInstallFailureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: String): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailsUndefined: Self = StObject.set(x, "failureDetails", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
