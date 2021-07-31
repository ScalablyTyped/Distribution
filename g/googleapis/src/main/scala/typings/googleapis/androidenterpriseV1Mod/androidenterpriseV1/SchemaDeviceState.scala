package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of a user&#39;s device, as accessed by the getState and setState
  * methods on device resources.
  */
trait SchemaDeviceState extends StObject {
  
  /**
    * The state of the Google account on the device. &quot;enabled&quot;
    * indicates that the Google account on the device can be used to access
    * Google services (including Google Play), while &quot;disabled&quot; means
    * that it cannot. A new device is initially in the &quot;disabled&quot;
    * state.
    */
  var accountState: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#deviceState&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDeviceState {
  
  @scala.inline
  def apply(): SchemaDeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceState]
  }
  
  @scala.inline
  implicit class SchemaDeviceStateMutableBuilder[Self <: SchemaDeviceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountState(value: String): Self = StObject.set(x, "accountState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountStateUndefined: Self = StObject.set(x, "accountState", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
