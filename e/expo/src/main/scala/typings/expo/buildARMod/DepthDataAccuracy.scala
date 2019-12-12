package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import typings.expo.buildARMod.DepthDataAccuracy.Absolute
import typings.expo.buildARMod.DepthDataAccuracy.Relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthDataAccuracy extends js.Object

@JSImport("expo/build/AR", "DepthDataAccuracy")
@js.native
object DepthDataAccuracy extends js.Object {
  @js.native
  sealed trait Absolute extends DepthDataAccuracy
  
  @js.native
  sealed trait Relative extends DepthDataAccuracy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DepthDataAccuracy with String] = js.native
  /* "AVDepthDataAccuracyAbsolute" */ @js.native
  object Absolute extends TopLevel[Absolute with String]
  
  /* "AVDepthDataAccuracyRelative" */ @js.native
  object Relative extends TopLevel[Relative with String]
  
}

