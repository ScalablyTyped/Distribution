package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Cardinal
import typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Clamped
import typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Monotonic
import typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Natural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplineType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplineType")
@js.native
object SplineType extends js.Object {
  //string
  @js.native
  sealed trait Cardinal extends SplineType
  
  //string
  @js.native
  sealed trait Clamped extends SplineType
  
  //string
  @js.native
  sealed trait Monotonic extends SplineType
  
  //string
  @js.native
  sealed trait Natural extends SplineType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplineType with Double] = js.native
  /* 2 */ @js.native
  object Cardinal extends TopLevel[Cardinal with Double]
  
  /* 3 */ @js.native
  object Clamped extends TopLevel[Clamped with Double]
  
  /* 1 */ @js.native
  object Monotonic extends TopLevel[Monotonic with Double]
  
  /* 0 */ @js.native
  object Natural extends TopLevel[Natural with Double]
  
}

