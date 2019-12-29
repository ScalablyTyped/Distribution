package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.Alignment")
@js.native
object Alignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends Alignment
  
  //string
  @js.native
  sealed trait Far extends Alignment
  
  //string
  @js.native
  sealed trait Near extends Alignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 1 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

