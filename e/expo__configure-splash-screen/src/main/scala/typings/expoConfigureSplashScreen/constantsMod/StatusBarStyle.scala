package typings.expoConfigureSplashScreen.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusBarStyle extends js.Object

@JSImport("@expo/configure-splash-screen/build/constants", "StatusBarStyle")
@js.native
object StatusBarStyle extends js.Object {
  @js.native
  sealed trait DARK_CONTENT extends StatusBarStyle
  
  @js.native
  sealed trait DEFAULT extends StatusBarStyle
  
  @js.native
  sealed trait LIGHT_CONTENT extends StatusBarStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusBarStyle with String] = js.native
  /* "dark-content" */ @js.native
  object DARK_CONTENT extends TopLevel[DARK_CONTENT with String]
  
  /* "default" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  /* "light-content" */ @js.native
  object LIGHT_CONTENT extends TopLevel[LIGHT_CONTENT with String]
  
}

