package typings.expo.aRMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameAttribute extends js.Object

@JSImport("expo/build/AR", "FrameAttribute")
@js.native
object FrameAttribute extends js.Object {
  @js.native
  sealed trait Anchors extends FrameAttribute
  
  @js.native
  sealed trait CapturedDepthData extends FrameAttribute
  
  @js.native
  sealed trait LightEstimation extends FrameAttribute
  
  @js.native
  sealed trait RawFeaturePoints extends FrameAttribute
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FrameAttribute with String] = js.native
  /* "anchors" */ @js.native
  object Anchors extends TopLevel[Anchors with String]
  
  /* "capturedDepthData" */ @js.native
  object CapturedDepthData
    extends TopLevel[typings.expo.aRMod.FrameAttribute.CapturedDepthData with String]
  
  /* "lightEstimation" */ @js.native
  object LightEstimation
    extends TopLevel[typings.expo.aRMod.FrameAttribute.LightEstimation with String]
  
  /* "rawFeaturePoints" */ @js.native
  object RawFeaturePoints extends TopLevel[RawFeaturePoints with String]
  
}

