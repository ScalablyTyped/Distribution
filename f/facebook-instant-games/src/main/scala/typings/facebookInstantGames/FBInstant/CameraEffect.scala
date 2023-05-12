package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an AR effect object that can be shown in a Messenger Rooms call.
  *
  * @since 7.1
  */
trait CameraEffect extends StObject {
  
  /**
    * The unique camera effect ID.
    *
    * @example
    * FBInstant.room.loadCameraEffectAsync()
    *   .then(function(effect) {
    *     console.log(effect.getID());
    *   });
    * @returns The camera effect ID.
    */
  def getID(): String
  
  /**
    * Shows the AR effect for the user in the room session. If the user has a non-game effect applied, it will
    * prompt the user for permission for the first time. If the user denis, the promise is rejected, otherwise it
    * is resolved after applying the effect.
    *
    * @example
    * FBInstant.room.loadCameraEffectAsync()
    *   .then(function(effect) {
    *     effect.showAsync().then(() => console.log("Effect shown"));
    *   });
    * @returns Resolves when the effect is applied to the player.
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    */
  def showAsync(): js.Promise[Unit]
}
object CameraEffect {
  
  inline def apply(getID: () => String, showAsync: () => js.Promise[Unit]): CameraEffect = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), showAsync = js.Any.fromFunction0(showAsync))
    __obj.asInstanceOf[CameraEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraEffect] (val x: Self) extends AnyVal {
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    inline def setShowAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "showAsync", js.Any.fromFunction0(value))
  }
}
