package typings.expoConfigureSplashScreen.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Platform extends js.Object

@JSImport("@expo/configure-splash-screen/build/constants", "Platform")
@js.native
object Platform extends js.Object {
  @js.native
  sealed trait ALL extends Platform
  
  @js.native
  sealed trait ANDROID extends Platform
  
  @js.native
  sealed trait IOS extends Platform
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Platform with String] = js.native
  /* "all" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  /* "android" */ @js.native
  object ANDROID extends TopLevel[ANDROID with String]
  
  /* "ios" */ @js.native
  object IOS extends TopLevel[IOS with String]
  
}

