package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.AxisOrientation.Horizontal
import typings.ejDotWebDotAll.ej.datavisualization.Chart.AxisOrientation.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AxisOrientation extends js.Object

@JSGlobal("ej.datavisualization.Chart.AxisOrientation")
@js.native
object AxisOrientation extends js.Object {
  //string
  @js.native
  sealed trait Horizontal extends AxisOrientation
  
  //string
  @js.native
  sealed trait Vertical extends AxisOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AxisOrientation with Double] = js.native
  /* 0 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

