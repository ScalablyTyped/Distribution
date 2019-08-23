package typings.expo.buildScreenOrientationScreenOrientationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebOrientation extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "WebOrientation")
@js.native
object WebOrientation extends js.Object {
  @js.native
  sealed trait LANDSCAPE_PRIMARY extends WebOrientation
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY extends WebOrientation
  
  @js.native
  sealed trait PORTRAIT_PRIMARY extends WebOrientation
  
  @js.native
  sealed trait PORTRAIT_SECONDARY extends WebOrientation
  
  /* "landscape-primary" */ val LANDSCAPE_PRIMARY: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientation.LANDSCAPE_PRIMARY with String = js.native
  /* "landscape-secondary" */ val LANDSCAPE_SECONDARY: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientation.LANDSCAPE_SECONDARY with String = js.native
  /* "portrait-primary" */ val PORTRAIT_PRIMARY: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientation.PORTRAIT_PRIMARY with String = js.native
  /* "portrait-secondary" */ val PORTRAIT_SECONDARY: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientation.PORTRAIT_SECONDARY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebOrientation with String] = js.native
}

