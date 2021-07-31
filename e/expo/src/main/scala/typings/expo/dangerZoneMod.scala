package typings.expo

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dangerZoneMod extends Shortcut {
  
  @JSImport("expo/build/DangerZone", JSImport.Default)
  @js.native
  val default: DangerZone = js.native
  
  @js.native
  trait DangerZone extends StObject {
    
    def Animated: js.Any = js.native
    
    def Branch: js.Any = js.native
    
    def DeviceMotion: js.Any = js.native
    
    def Easing: js.Any = js.native
    
    def Lottie: js.Any = js.native
    
    def Screen: js.Any = js.native
    
    def ScreenContainer: js.Any = js.native
    
    def Stripe: js.Any = js.native
  }
  
  type _To = DangerZone
  
  /* This means you don't have to write `default`, but can instead just say `dangerZoneMod.foo` */
  override def _to: DangerZone = default
}
