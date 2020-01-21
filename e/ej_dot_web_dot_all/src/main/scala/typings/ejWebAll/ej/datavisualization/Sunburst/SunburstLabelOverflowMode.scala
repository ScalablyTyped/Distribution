package typings.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelOverflowMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLabelOverflowMode")
@js.native
object SunburstLabelOverflowMode extends js.Object {
  //string
  @js.native
  sealed trait Hide extends SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait None extends SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait Trim extends SunburstLabelOverflowMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLabelOverflowMode with Double] = js.native
  /* 1 */ @js.native
  object Hide extends TopLevel[Hide with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0 */ @js.native
  object Trim extends TopLevel[Trim with Double]
  
}

