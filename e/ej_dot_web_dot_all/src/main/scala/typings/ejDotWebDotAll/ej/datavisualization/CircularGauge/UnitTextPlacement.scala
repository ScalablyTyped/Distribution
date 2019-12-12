package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.UnitTextPlacement.Back
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.UnitTextPlacement.Front
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back extends UnitTextPlacement
  
  //string
  @js.native
  sealed trait Front extends UnitTextPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitTextPlacement with Double] = js.native
  /* 0 */ @js.native
  object Back extends TopLevel[Back with Double]
  
  /* 1 */ @js.native
  object Front extends TopLevel[Front with Double]
  
}

