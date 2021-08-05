package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance of an ad.
  */
trait AdInstance extends StObject {
  
  /**
    * Return the Audience Network placement ID of this ad instance.
    */
  def getPlacementID(): String
  
  /**
    * Preload the ad. The returned promise resolves when the preload completes, and rejects if it failed.
    * @throws ADS_FREQUENT_LOAD
    * @throws ADS_NO_FILL
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def loadAsync(): js.Promise[Unit]
  
  /**
    * Present the ad. The returned promise resolves when user finished watching the ad, and rejects if it failed to present or was closed during the ad.
    * @throws ADS_NOT_LOADED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def showAsync(): js.Promise[Unit]
}
object AdInstance {
  
  inline def apply(getPlacementID: () => String, loadAsync: () => js.Promise[Unit], showAsync: () => js.Promise[Unit]): AdInstance = {
    val __obj = js.Dynamic.literal(getPlacementID = js.Any.fromFunction0(getPlacementID), loadAsync = js.Any.fromFunction0(loadAsync), showAsync = js.Any.fromFunction0(showAsync))
    __obj.asInstanceOf[AdInstance]
  }
  
  extension [Self <: AdInstance](x: Self) {
    
    inline def setGetPlacementID(value: () => String): Self = StObject.set(x, "getPlacementID", js.Any.fromFunction0(value))
    
    inline def setLoadAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
    
    inline def setShowAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "showAsync", js.Any.fromFunction0(value))
  }
}
