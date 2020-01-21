package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.getInterstitialAdAsync")
@js.native
object getInterstitialAdAsync extends js.Object {
  /**
    * Attempt to create an instance of interstitial ad. This instance can then be preloaded and presented.
    * @param placementID The placement ID that's been setup in your Audience Network settings.
    * @returns A promise that resolves with a AdInstance, or rejects with a APIError if it couldn't be created.
    * @throws ADS_TOO_MANY_INSTANCES
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def apply(placementID: String): js.Promise[AdInstance] = js.native
}

