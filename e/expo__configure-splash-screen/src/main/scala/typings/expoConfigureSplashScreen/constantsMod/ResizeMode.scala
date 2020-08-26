package typings.expoConfigureSplashScreen.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeMode extends js.Object

@JSImport("@expo/configure-splash-screen/build/constants", "ResizeMode")
@js.native
object ResizeMode extends js.Object {
  @js.native
  sealed trait CONTAIN extends ResizeMode
  
  @js.native
  sealed trait COVER extends ResizeMode
  
  @js.native
  sealed trait NATIVE extends ResizeMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResizeMode with String] = js.native
  /* "contain" */ @js.native
  object CONTAIN extends TopLevel[CONTAIN with String]
  
  /* "cover" */ @js.native
  object COVER extends TopLevel[COVER with String]
  
  /* "native" */ @js.native
  object NATIVE extends TopLevel[NATIVE with String]
  
}

