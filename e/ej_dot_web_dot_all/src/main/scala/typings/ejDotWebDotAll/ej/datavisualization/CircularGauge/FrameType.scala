package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.FrameType")
@js.native
object FrameType extends js.Object {
  //string
  @js.native
  sealed trait FullCircle extends FrameType
  
  //string
  @js.native
  sealed trait HalfCircle extends FrameType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameType with Double] = js.native
  /* 0 */ @js.native
  object FullCircle extends TopLevel[FullCircle with Double]
  
  /* 1 */ @js.native
  object HalfCircle extends TopLevel[HalfCircle with Double]
  
}

