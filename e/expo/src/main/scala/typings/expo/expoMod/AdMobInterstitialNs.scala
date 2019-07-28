package typings.expo.expoMod

import typings.expo.expoStrings.interstitialDidFailToLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AdMobInterstitial")
@js.native
object AdMobInterstitialNs extends js.Object {
  def addEventListener(event: AdMobInterstitialEmptyEvent, handler: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interstitialDidFailToLoad(event: interstitialDidFailToLoad, handler: js.Function1[/* error */ String, Unit]): Unit = js.native
  def dismissAdAsync(): js.Promise[Unit] = js.native
  def getIsReadyAsync(): js.Promise[Boolean] = js.native
  def removeAllListeners(): Unit = js.native
  def removeEventListener(event: AdMobInterstitialEmptyEvent, handler: js.Function0[Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interstitialDidFailToLoad(event: interstitialDidFailToLoad, handler: js.Function1[/* error */ String, Unit]): Unit = js.native
  def requestAdAsync(): js.Promise[Unit] = js.native
  def setAdUnitID(id: String): Unit = js.native
  def setTestDeviceID(id: String): Unit = js.native
  def showAdAsync(): js.Promise[Unit] = js.native
}

