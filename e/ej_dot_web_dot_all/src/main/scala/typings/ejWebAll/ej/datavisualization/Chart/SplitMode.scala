package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplitMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplitMode")
@js.native
object SplitMode extends js.Object {
  //string
  @js.native
  sealed trait Indexes extends SplitMode
  
  //string
  @js.native
  sealed trait Percentage extends SplitMode
  
  //string
  @js.native
  sealed trait Position extends SplitMode
  
  //string
  @js.native
  sealed trait Value extends SplitMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplitMode with Double] = js.native
  /* 3 */ @js.native
  object Indexes extends TopLevel[Indexes with Double]
  
  /* 2 */ @js.native
  object Percentage extends TopLevel[Percentage with Double]
  
  /* 0 */ @js.native
  object Position
    extends TopLevel[typings.ejWebAll.ej.datavisualization.Chart.SplitMode.Position with Double]
  
  /* 1 */ @js.native
  object Value extends TopLevel[Value with Double]
  
}

