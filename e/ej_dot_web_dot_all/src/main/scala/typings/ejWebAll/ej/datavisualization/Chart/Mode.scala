package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Chart.Mode")
@js.native
object Mode extends js.Object {
  //string
  @js.native
  sealed trait Cluster extends Mode
  
  //string
  @js.native
  sealed trait Point extends Mode
  
  //string
  @js.native
  sealed trait Range extends Mode
  
  //string
  @js.native
  sealed trait Series extends Mode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
  /* 2 */ @js.native
  object Cluster extends TopLevel[Cluster with Double]
  
  /* 1 */ @js.native
  object Point extends TopLevel[Point with Double]
  
  /* 3 */ @js.native
  object Range extends TopLevel[Range with Double]
  
  /* 0 */ @js.native
  object Series
    extends TopLevel[typings.ejWebAll.ej.datavisualization.Chart.Mode.Series with Double]
  
}

