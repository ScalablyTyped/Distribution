package typings.expo

import typings.expo.screenOrientationTypesMod.OrientationInfo
import typings.expo.screenOrientationTypesMod.OrientationLock
import typings.expo.screenOrientationTypesMod.WebOrientationLock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/ScreenOrientation/ExpoScreenOrientation.web", JSImport.Namespace)
@js.native
object expoScreenOrientationWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def getOrientationAsync(): js.Promise[OrientationInfo] = js.native
    def getPlatformOrientationLockAsync(): js.Promise[WebOrientationLock] = js.native
    def lockAsync(orientationLock: OrientationLock): js.Promise[Unit] = js.native
    def lockPlatformAsync(webOrientationLock: WebOrientationLock): js.Promise[Unit] = js.native
    def supportsOrientationLockAsync(orientationLock: OrientationLock): js.Promise[Boolean] = js.native
    def unlockAsync(): js.Promise[Unit] = js.native
  }
  
}

