package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions and properties related to the messenger rooms environment.
  *
  * @since 7.1
  */
trait Room extends StObject {
  
  /**
    * Clears the current AR effect in the rooms call. If an effect is present that was not applied by the game, the
    * player will be prompted to approve the removal of the effect. The API will resolve after the effect is cleared,
    * or will reject if the user denies the effect removal.
    *
    * @example
    * FBInstant.room.clearCameraEffectAsync()
    *   .then(function() {
    *     ...
    *   });
    * @returns Resolves if the effect is cleared.
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    */
  def clearCameraEffectAsync(): js.Promise[Unit]
  
  /**
    * Retrieves the current real-time match for the gameplay environment, if one exists.
    *
    * @example
    * FBInstant.room.getCurrentMatchAsync()
    *   .then(function(match) {
    *     ...
    *   });
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws LIVE_MATCH_NOT_FOUND
    */
  def getCurrentMatchAsync(): js.Promise[LiveMatch]
  
  /**
    * Retrieves and loads a specified AR effect that has been registered for the game.
    *
    * @example
    * FBInstant.room.loadCameraEffectAsync({effectID: '123'})
    *   .then(function(effect) {
    *     ...
    *   });
    * @param cameraEffectArgs The args representing the effect to be loaded. See example for details
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws CAMERA_EFFECT_NOT_FOUND
    */
  def loadCameraEffectAsync(cameraEffectArgs: CameraEffectArgs): js.Promise[CameraEffect]
}
object Room {
  
  inline def apply(
    clearCameraEffectAsync: () => js.Promise[Unit],
    getCurrentMatchAsync: () => js.Promise[LiveMatch],
    loadCameraEffectAsync: CameraEffectArgs => js.Promise[CameraEffect]
  ): Room = {
    val __obj = js.Dynamic.literal(clearCameraEffectAsync = js.Any.fromFunction0(clearCameraEffectAsync), getCurrentMatchAsync = js.Any.fromFunction0(getCurrentMatchAsync), loadCameraEffectAsync = js.Any.fromFunction1(loadCameraEffectAsync))
    __obj.asInstanceOf[Room]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
    
    inline def setClearCameraEffectAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearCameraEffectAsync", js.Any.fromFunction0(value))
    
    inline def setGetCurrentMatchAsync(value: () => js.Promise[LiveMatch]): Self = StObject.set(x, "getCurrentMatchAsync", js.Any.fromFunction0(value))
    
    inline def setLoadCameraEffectAsync(value: CameraEffectArgs => js.Promise[CameraEffect]): Self = StObject.set(x, "loadCameraEffectAsync", js.Any.fromFunction1(value))
  }
}
