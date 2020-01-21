package typings.ejWebAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickPlacement extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
@js.native
object TickPlacement extends js.Object {
  //string
  @js.native
  sealed trait Inside extends TickPlacement
  
  //string
  @js.native
  sealed trait Outside extends TickPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickPlacement with Double] = js.native
  /* 0 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 1 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
}

