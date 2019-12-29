package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
@js.native
object TickPosition extends js.Object {
  //string
  @js.native
  sealed trait Above extends TickPosition
  
  //string
  @js.native
  sealed trait Below extends TickPosition
  
  //string
  @js.native
  sealed trait Cross extends TickPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickPosition with Double] = js.native
  /* 1 */ @js.native
  object Above extends TopLevel[Above with Double]
  
  /* 0 */ @js.native
  object Below extends TopLevel[Below with Double]
  
  /* 2 */ @js.native
  object Cross extends TopLevel[Cross with Double]
  
}

