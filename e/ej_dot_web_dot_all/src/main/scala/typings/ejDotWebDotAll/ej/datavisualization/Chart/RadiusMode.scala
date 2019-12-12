package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.RadiusMode.Auto
import typings.ejDotWebDotAll.ej.datavisualization.Chart.RadiusMode.MinMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadiusMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.RadiusMode")
@js.native
object RadiusMode extends js.Object {
  //string
  @js.native
  sealed trait Auto extends RadiusMode
  
  //string
  @js.native
  sealed trait MinMax extends RadiusMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadiusMode with Double] = js.native
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 0 */ @js.native
  object MinMax extends TopLevel[MinMax with Double]
  
}

