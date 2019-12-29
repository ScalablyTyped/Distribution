package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoordinateUnit extends js.Object

@JSGlobal("ej.datavisualization.Chart.CoordinateUnit")
@js.native
object CoordinateUnit extends js.Object {
  //string
  @js.native
  sealed trait None extends CoordinateUnit
  
  //string
  @js.native
  sealed trait Pixels extends CoordinateUnit
  
  //string
  @js.native
  sealed trait Points extends CoordinateUnit
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoordinateUnit with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Pixels extends TopLevel[Pixels with Double]
  
  /* 2 */ @js.native
  object Points extends TopLevel[Points with Double]
  
}

