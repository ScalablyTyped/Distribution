package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/launch/SplashScreen", JSImport.Namespace)
@js.native
object splashScreenMod extends js.Object {
  def hide(): Unit = js.native
  def hideAsync(): js.Promise[Boolean] = js.native
  def preventAutoHide(): Unit = js.native
  def preventAutoHideAsync(): js.Promise[Boolean] = js.native
}

