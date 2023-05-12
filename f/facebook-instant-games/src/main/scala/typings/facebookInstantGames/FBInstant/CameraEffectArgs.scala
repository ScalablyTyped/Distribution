package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents arguments to be sent to load an AR effect in Messenger Rooms.
  *
  * @since 7.1
  */
trait CameraEffectArgs extends StObject {
  
  /**
    * The ID of the effect to be loaded that is registered with the game.
    */
  var effectID: String
}
object CameraEffectArgs {
  
  inline def apply(effectID: String): CameraEffectArgs = {
    val __obj = js.Dynamic.literal(effectID = effectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraEffectArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraEffectArgs] (val x: Self) extends AnyVal {
    
    inline def setEffectID(value: String): Self = StObject.set(x, "effectID", value.asInstanceOf[js.Any])
  }
}
