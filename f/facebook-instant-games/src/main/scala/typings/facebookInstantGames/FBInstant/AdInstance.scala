package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an instance of an ad.
  */
@js.native
trait AdInstance extends js.Object {
  /**
    * Return the Audience Network placement ID of this ad instance.
    */
  def getPlacementID(): String = js.native
  /**
    * Preload the ad. The returned promise resolves when the preload completes, and rejects if it failed.
    * @throws ADS_FREQUENT_LOAD
    * @throws ADS_NO_FILL
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def loadAsync(): js.Promise[Unit] = js.native
  /**
    * Present the ad. The returned promise resolves when user finished watching the ad, and rejects if it failed to present or was closed during the ad.
    * @throws ADS_NOT_LOADED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def showAsync(): js.Promise[Unit] = js.native
}

object AdInstance {
  @scala.inline
  def apply(getPlacementID: () => String, loadAsync: () => js.Promise[Unit], showAsync: () => js.Promise[Unit]): AdInstance = {
    val __obj = js.Dynamic.literal(getPlacementID = js.Any.fromFunction0(getPlacementID), loadAsync = js.Any.fromFunction0(loadAsync), showAsync = js.Any.fromFunction0(showAsync))
    __obj.asInstanceOf[AdInstance]
  }
  @scala.inline
  implicit class AdInstanceOps[Self <: AdInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPlacementID(value: () => String): Self = this.set("getPlacementID", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadAsync(value: () => js.Promise[Unit]): Self = this.set("loadAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setShowAsync(value: () => js.Promise[Unit]): Self = this.set("showAsync", js.Any.fromFunction0(value))
  }
  
}

