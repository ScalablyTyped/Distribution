package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.RangeType.X
import typings.ejDotWebDotAll.ej.datavisualization.Chart.RangeType.XY
import typings.ejDotWebDotAll.ej.datavisualization.Chart.RangeType.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeType extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangeType")
@js.native
object RangeType extends js.Object {
  //string
  @js.native
  sealed trait X extends RangeType
  
  //string
  @js.native
  sealed trait XY extends RangeType
  
  //string
  @js.native
  sealed trait Y extends RangeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeType with Double] = js.native
  /* 1 */ @js.native
  object X extends TopLevel[X with Double]
  
  /* 0 */ @js.native
  object XY extends TopLevel[XY with Double]
  
  /* 2 */ @js.native
  object Y extends TopLevel[Y with Double]
  
}

