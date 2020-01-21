package typings.ejWebAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.LabelPosition")
@js.native
object LabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Above extends LabelPosition
  
  //string
  @js.native
  sealed trait Below extends LabelPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPosition with Double] = js.native
  /* 0 */ @js.native
  object Above extends TopLevel[Above with Double]
  
  /* 1 */ @js.native
  object Below extends TopLevel[Below with Double]
  
}

