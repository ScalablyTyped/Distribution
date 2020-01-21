package typings.expo.mod

import typings.expo.screenOrientationTypesMod.OrientationChangeListener
import typings.expo.screenOrientationTypesMod.OrientationInfo
import typings.expo.screenOrientationTypesMod.OrientationLock
import typings.expo.screenOrientationTypesMod.PlatformOrientationInfo
import typings.unimodulesReactNativeAdapter.eventEmitterMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ScreenOrientation")
@js.native
object ScreenOrientation extends js.Object {
  def addOrientationChangeListener(listener: OrientationChangeListener): Subscription = js.native
  def allow(orientationLock: OrientationLock): Unit = js.native
  def allowAsync(orientationLock: OrientationLock): js.Promise[Unit] = js.native
  def doesSupportAsync(orientationLock: OrientationLock): js.Promise[Boolean] = js.native
  def getOrientationAsync(): js.Promise[OrientationInfo] = js.native
  def getOrientationLockAsync(): js.Promise[OrientationLock] = js.native
  def getPlatformOrientationLockAsync(): js.Promise[PlatformOrientationInfo] = js.native
  def lockAsync(orientationLock: OrientationLock): js.Promise[Unit] = js.native
  def lockPlatformAsync(options: PlatformOrientationInfo): js.Promise[Unit] = js.native
  def removeOrientationChangeListener(subscription: Subscription): Unit = js.native
  def removeOrientationChangeListeners(): Unit = js.native
  def supportsOrientationLockAsync(orientationLock: OrientationLock): js.Promise[Boolean] = js.native
  def unlockAsync(): js.Promise[Unit] = js.native
  @js.native
  object Orientation extends js.Object {
    /* "LANDSCAPE" */ val LANDSCAPE: typings.expo.screenOrientationTypesMod.Orientation.LANDSCAPE with String = js.native
    /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typings.expo.screenOrientationTypesMod.Orientation.LANDSCAPE_LEFT with String = js.native
    /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typings.expo.screenOrientationTypesMod.Orientation.LANDSCAPE_RIGHT with String = js.native
    /* "PORTRAIT" */ val PORTRAIT: typings.expo.screenOrientationTypesMod.Orientation.PORTRAIT with String = js.native
    /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typings.expo.screenOrientationTypesMod.Orientation.PORTRAIT_DOWN with String = js.native
    /* "PORTRAIT_UP" */ val PORTRAIT_UP: typings.expo.screenOrientationTypesMod.Orientation.PORTRAIT_UP with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typings.expo.screenOrientationTypesMod.Orientation.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.screenOrientationTypesMod.Orientation with String] = js.native
  }
  
  @js.native
  object OrientationLock extends js.Object {
    /* "ALL" */ val ALL: typings.expo.screenOrientationTypesMod.OrientationLock.ALL with String = js.native
    /* "ALL_BUT_UPSIDE_DOWN" */ val ALL_BUT_UPSIDE_DOWN: typings.expo.screenOrientationTypesMod.OrientationLock.ALL_BUT_UPSIDE_DOWN with String = js.native
    /* "DEFAULT" */ val DEFAULT: typings.expo.screenOrientationTypesMod.OrientationLock.DEFAULT with String = js.native
    /* "LANDSCAPE" */ val LANDSCAPE: typings.expo.screenOrientationTypesMod.OrientationLock.LANDSCAPE with String = js.native
    /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typings.expo.screenOrientationTypesMod.OrientationLock.LANDSCAPE_LEFT with String = js.native
    /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typings.expo.screenOrientationTypesMod.OrientationLock.LANDSCAPE_RIGHT with String = js.native
    /* "OTHER" */ val OTHER: typings.expo.screenOrientationTypesMod.OrientationLock.OTHER with String = js.native
    /* "PORTRAIT" */ val PORTRAIT: typings.expo.screenOrientationTypesMod.OrientationLock.PORTRAIT with String = js.native
    /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typings.expo.screenOrientationTypesMod.OrientationLock.PORTRAIT_DOWN with String = js.native
    /* "PORTRAIT_UP" */ val PORTRAIT_UP: typings.expo.screenOrientationTypesMod.OrientationLock.PORTRAIT_UP with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typings.expo.screenOrientationTypesMod.OrientationLock.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.screenOrientationTypesMod.OrientationLock with String] = js.native
  }
  
  @js.native
  object SizeClassIOS extends js.Object {
    /* "COMPACT" */ val COMPACT: typings.expo.screenOrientationTypesMod.SizeClassIOS.COMPACT with String = js.native
    /* "REGULAR" */ val REGULAR: typings.expo.screenOrientationTypesMod.SizeClassIOS.REGULAR with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typings.expo.screenOrientationTypesMod.SizeClassIOS.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.screenOrientationTypesMod.SizeClassIOS with String] = js.native
  }
  
  @js.native
  object WebOrientationLock extends js.Object {
    /* "any" */ val ANY: typings.expo.screenOrientationTypesMod.WebOrientationLock.ANY with String = js.native
    /* "landscape" */ val LANDSCAPE: typings.expo.screenOrientationTypesMod.WebOrientationLock.LANDSCAPE with String = js.native
    /* "landscape-primary" */ val LANDSCAPE_PRIMARY: typings.expo.screenOrientationTypesMod.WebOrientationLock.LANDSCAPE_PRIMARY with String = js.native
    /* "landscape-secondary" */ val LANDSCAPE_SECONDARY: typings.expo.screenOrientationTypesMod.WebOrientationLock.LANDSCAPE_SECONDARY with String = js.native
    /* "natural" */ val NATURAL: typings.expo.screenOrientationTypesMod.WebOrientationLock.NATURAL with String = js.native
    /* "portrait" */ val PORTRAIT: typings.expo.screenOrientationTypesMod.WebOrientationLock.PORTRAIT with String = js.native
    /* "portrait-primary" */ val PORTRAIT_PRIMARY: typings.expo.screenOrientationTypesMod.WebOrientationLock.PORTRAIT_PRIMARY with String = js.native
    /* "portrait-secondary" */ val PORTRAIT_SECONDARY: typings.expo.screenOrientationTypesMod.WebOrientationLock.PORTRAIT_SECONDARY with String = js.native
    /* "unknown" */ val UNKNOWN: typings.expo.screenOrientationTypesMod.WebOrientationLock.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.screenOrientationTypesMod.WebOrientationLock with String] = js.native
  }
  
}

