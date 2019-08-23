package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthDataQuality extends js.Object

@JSImport("expo/build/AR", "DepthDataQuality")
@js.native
object DepthDataQuality extends js.Object {
  @js.native
  sealed trait High extends DepthDataQuality
  
  @js.native
  sealed trait Low extends DepthDataQuality
  
  /* "AVDepthDataQualityHigh" */ val High: typings.expo.buildARMod.DepthDataQuality.High with String = js.native
  /* "AVDepthDataQualityLow" */ val Low: typings.expo.buildARMod.DepthDataQuality.Low with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DepthDataQuality with String] = js.native
}

