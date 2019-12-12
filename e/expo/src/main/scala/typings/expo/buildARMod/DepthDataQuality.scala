package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import typings.expo.buildARMod.DepthDataQuality.High
import typings.expo.buildARMod.DepthDataQuality.Low
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DepthDataQuality with String] = js.native
  /* "AVDepthDataQualityHigh" */ @js.native
  object High extends TopLevel[High with String]
  
  /* "AVDepthDataQualityLow" */ @js.native
  object Low extends TopLevel[Low with String]
  
}

