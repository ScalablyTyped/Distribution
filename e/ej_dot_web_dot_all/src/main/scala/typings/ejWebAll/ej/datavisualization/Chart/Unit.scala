package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Unit extends js.Object

@JSGlobal("ej.datavisualization.Chart.Unit")
@js.native
object Unit extends js.Object {
  //string
  @js.native
  sealed trait Percentage extends Unit
  
  //string
  @js.native
  sealed trait Pixel extends Unit
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Unit with Double] = js.native
  /* 0 */ @js.native
  object Percentage extends TopLevel[Percentage with Double]
  
  /* 1 */ @js.native
  object Pixel extends TopLevel[Pixel with Double]
  
}

