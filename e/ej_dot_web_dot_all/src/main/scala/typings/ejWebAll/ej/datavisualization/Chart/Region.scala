package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region extends js.Object

@JSGlobal("ej.datavisualization.Chart.Region")
@js.native
object Region extends js.Object {
  //string
  @js.native
  sealed trait Chart extends Region
  
  //string
  @js.native
  sealed trait Series extends Region
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region with Double] = js.native
  /* 0 */ @js.native
  object Chart
    extends TopLevel[typings.ejWebAll.ej.datavisualization.Chart.Region.Chart with Double]
  
  /* 1 */ @js.native
  object Series
    extends TopLevel[typings.ejWebAll.ej.datavisualization.Chart.Region.Series with Double]
  
}

