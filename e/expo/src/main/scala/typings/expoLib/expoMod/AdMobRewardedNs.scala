package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AdMobRewarded")
@js.native
object AdMobRewardedNs extends js.Object {
  def addEventListener(event: expoLib.expoMod.AdMobRewardedEmptyEvent, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rewardedVideoDidFailToLoad(
    event: expoLib.expoLibStrings.rewardedVideoDidFailToLoad,
    handler: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rewardedVideoDidRewardUser(
    event: expoLib.expoLibStrings.rewardedVideoDidRewardUser,
    handler: js.Function2[/* type */ java.lang.String, /* amount */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def dismissAdAsync(): js.Promise[scala.Unit] = js.native
  def getIsReadyAsync(): js.Promise[scala.Boolean] = js.native
  def removeAllListeners(): scala.Unit = js.native
  def removeEventListener(event: expoLib.expoMod.AdMobRewardedEmptyEvent, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rewardedVideoDidFailToLoad(
    event: expoLib.expoLibStrings.rewardedVideoDidFailToLoad,
    handler: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rewardedVideoDidRewardUser(
    event: expoLib.expoLibStrings.rewardedVideoDidRewardUser,
    handler: js.Function2[/* type */ java.lang.String, /* amount */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def requestAdAsync(): js.Promise[scala.Unit] = js.native
  def setAdUnitID(id: java.lang.String): scala.Unit = js.native
  def setTestDeviceID(id: java.lang.String): scala.Unit = js.native
  def showAdAsync(): js.Promise[scala.Unit] = js.native
}

