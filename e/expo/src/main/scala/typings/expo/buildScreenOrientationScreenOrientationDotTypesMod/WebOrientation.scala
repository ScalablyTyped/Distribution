package typings.expo.buildScreenOrientationScreenOrientationDotTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebOrientation with String] = js.native
  /* "landscape-primary" */ @js.native
  object LANDSCAPE_PRIMARY extends TopLevel[LANDSCAPE_PRIMARY with String]
  
  /* "landscape-secondary" */ @js.native
  object LANDSCAPE_SECONDARY extends TopLevel[LANDSCAPE_SECONDARY with String]
  
  /* "portrait-primary" */ @js.native
  object PORTRAIT_PRIMARY extends TopLevel[PORTRAIT_PRIMARY with String]
  
  /* "portrait-secondary" */ @js.native
  object PORTRAIT_SECONDARY extends TopLevel[PORTRAIT_SECONDARY with String]
  
}

