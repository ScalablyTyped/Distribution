package typings.expo.buildScreenOrientationScreenOrientationMod

import typings.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.Subscription
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationChangeListener
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationInfo
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.PlatformOrientationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/ScreenOrientation/ScreenOrientation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addOrientationChangeListener(listener: OrientationChangeListener): Subscription = js.native
  def allow(orientationLock: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock): Unit = js.native
  def allowAsync(orientationLock: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock): js.Promise[Unit] = js.native
  def doesSupportAsync(orientationLock: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock): js.Promise[Boolean] = js.native
  def getOrientationAsync(): js.Promise[OrientationInfo] = js.native
  def getOrientationLockAsync(): js.Promise[typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock] = js.native
  def getPlatformOrientationLockAsync(): js.Promise[PlatformOrientationInfo] = js.native
  def lockAsync(orientationLock: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock): js.Promise[Unit] = js.native
  def lockPlatformAsync(options: PlatformOrientationInfo): js.Promise[Unit] = js.native
  def removeOrientationChangeListener(subscription: Subscription): Unit = js.native
  def removeOrientationChangeListeners(): Unit = js.native
  def supportsOrientationLockAsync(orientationLock: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock): js.Promise[Boolean] = js.native
  def unlockAsync(): js.Promise[Unit] = js.native
}

