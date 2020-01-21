package typings.expo.screenOrientationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebOrientationLock extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "WebOrientationLock")
@js.native
object WebOrientationLock extends js.Object {
  @js.native
  sealed trait ANY extends WebOrientationLock
  
  @js.native
  sealed trait LANDSCAPE extends WebOrientationLock
  
  @js.native
  sealed trait LANDSCAPE_PRIMARY extends WebOrientationLock
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY extends WebOrientationLock
  
  @js.native
  sealed trait NATURAL extends WebOrientationLock
  
  @js.native
  sealed trait PORTRAIT extends WebOrientationLock
  
  @js.native
  sealed trait PORTRAIT_PRIMARY extends WebOrientationLock
  
  @js.native
  sealed trait PORTRAIT_SECONDARY extends WebOrientationLock
  
  @js.native
  sealed trait UNKNOWN extends WebOrientationLock
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebOrientationLock with String] = js.native
  /* "any" */ @js.native
  object ANY extends TopLevel[ANY with String]
  
  /* "landscape" */ @js.native
  object LANDSCAPE extends TopLevel[LANDSCAPE with String]
  
  /* "landscape-primary" */ @js.native
  object LANDSCAPE_PRIMARY extends TopLevel[LANDSCAPE_PRIMARY with String]
  
  /* "landscape-secondary" */ @js.native
  object LANDSCAPE_SECONDARY extends TopLevel[LANDSCAPE_SECONDARY with String]
  
  /* "natural" */ @js.native
  object NATURAL extends TopLevel[NATURAL with String]
  
  /* "portrait" */ @js.native
  object PORTRAIT extends TopLevel[PORTRAIT with String]
  
  /* "portrait-primary" */ @js.native
  object PORTRAIT_PRIMARY extends TopLevel[PORTRAIT_PRIMARY with String]
  
  /* "portrait-secondary" */ @js.native
  object PORTRAIT_SECONDARY extends TopLevel[PORTRAIT_SECONDARY with String]
  
  /* "unknown" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
}

