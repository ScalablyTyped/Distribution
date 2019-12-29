package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZIndex extends js.Object

@JSGlobal("ej.datavisualization.Chart.ZIndex")
@js.native
object ZIndex extends js.Object {
  //string
  @js.native
  sealed trait Inside extends ZIndex
  
  //string
  @js.native
  sealed trait Over extends ZIndex
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZIndex with Double] = js.native
  /* 0 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 1 */ @js.native
  object Over extends TopLevel[Over with Double]
  
}

