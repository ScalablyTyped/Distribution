package typings.expo.expoMod

import typings.expo.expoStrings.rewardedVideoDidFailToLoad
import typings.expo.expoStrings.rewardedVideoDidRewardUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AdMobRewarded")
@js.native
object AdMobRewardedNs extends js.Object {
  def addEventListener(event: AdMobRewardedEmptyEvent, handler: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rewardedVideoDidFailToLoad(event: rewardedVideoDidFailToLoad, handler: js.Function1[/* error */ String, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rewardedVideoDidRewardUser(
    event: rewardedVideoDidRewardUser,
    handler: js.Function2[/* type */ String, /* amount */ Double, Unit]
  ): Unit = js.native
  def dismissAdAsync(): js.Promise[Unit] = js.native
  def getIsReadyAsync(): js.Promise[Boolean] = js.native
  def removeAllListeners(): Unit = js.native
  def removeEventListener(event: AdMobRewardedEmptyEvent, handler: js.Function0[Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rewardedVideoDidFailToLoad(event: rewardedVideoDidFailToLoad, handler: js.Function1[/* error */ String, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rewardedVideoDidRewardUser(
    event: rewardedVideoDidRewardUser,
    handler: js.Function2[/* type */ String, /* amount */ Double, Unit]
  ): Unit = js.native
  def requestAdAsync(): js.Promise[Unit] = js.native
  def setAdUnitID(id: String): Unit = js.native
  def setTestDeviceID(id: String): Unit = js.native
  def showAdAsync(): js.Promise[Unit] = js.native
}

