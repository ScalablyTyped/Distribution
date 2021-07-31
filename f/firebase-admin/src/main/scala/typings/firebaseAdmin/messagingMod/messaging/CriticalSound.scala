package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CriticalSound extends StObject {
  
  /**
    * The critical alert flag. Set to `true` to enable the critical alert.
    */
  var critical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of a sound file in the app's main bundle or in the `Library/Sounds`
    * folder of the app's container directory. Specify the string "default" to play
    * the system sound.
    */
  var name: String
  
  /**
    * The volume for the critical alert's sound. Must be a value between 0.0
    * (silent) and 1.0 (full volume).
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object CriticalSound {
  
  @scala.inline
  def apply(name: String): CriticalSound = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriticalSound]
  }
  
  @scala.inline
  implicit class CriticalSoundMutableBuilder[Self <: CriticalSound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
