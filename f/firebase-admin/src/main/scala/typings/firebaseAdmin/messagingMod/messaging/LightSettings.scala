package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightSettings extends StObject {
  
  /**
    * Required. Sets color of the LED in `#rrggbb` or `#rrggbbaa` format.
    */
  var color: String = js.native
  
  /**
    * Required. Along with `light_on_duration`, defines the blink rate of LED flashes.
    */
  var lightOffDurationMillis: Double = js.native
  
  /**
    * Required. Along with `light_off_duration`, defines the blink rate of LED flashes.
    */
  var lightOnDurationMillis: Double = js.native
}
object LightSettings {
  
  @scala.inline
  def apply(color: String, lightOffDurationMillis: Double, lightOnDurationMillis: Double): LightSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], lightOffDurationMillis = lightOffDurationMillis.asInstanceOf[js.Any], lightOnDurationMillis = lightOnDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSettings]
  }
  
  @scala.inline
  implicit class LightSettingsMutableBuilder[Self <: LightSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightOffDurationMillis(value: Double): Self = StObject.set(x, "lightOffDurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightOnDurationMillis(value: Double): Self = StObject.set(x, "lightOnDurationMillis", value.asInstanceOf[js.Any])
  }
}
