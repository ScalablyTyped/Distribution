package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an instance of an ad.
  */
trait AdInstance extends js.Object {
  /**
    * Return the Audience Network placement ID of this ad instance.
    */
  def getPlacementID(): java.lang.String
  /**
    * Preload the ad. The returned promise resolves when the preload completes, and rejects if it failed.
    * @throws ADS_FREQUENT_LOAD
    * @throws ADS_NO_FILL
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def loadAsync(): js.Promise[scala.Unit]
  /**
    * Present the ad. The returned promise resolves when user finished watching the ad, and rejects if it failed to present or was closed during the ad.
    * @throws ADS_NOT_LOADED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def showAsync(): js.Promise[scala.Unit]
}

object AdInstance {
  @scala.inline
  def apply(
    getPlacementID: () => java.lang.String,
    loadAsync: () => js.Promise[scala.Unit],
    showAsync: () => js.Promise[scala.Unit]
  ): AdInstance = {
    val __obj = js.Dynamic.literal(getPlacementID = js.Any.fromFunction0(getPlacementID), loadAsync = js.Any.fromFunction0(loadAsync), showAsync = js.Any.fromFunction0(showAsync))
  
    __obj.asInstanceOf[AdInstance]
  }
}

