package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Associate extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Associate")
@js.native
object Associate extends js.Object {
  //Used to set the associate of tooltip as MouseEnter
  @js.native
  sealed trait MouseEnter extends Associate
  
  //Used to set the associate of tooltip as MouseFollow
  @js.native
  sealed trait MouseFollow extends Associate
  
  //Used to set the associate of tooltip as Target
  @js.native
  sealed trait Target extends Associate
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Associate with Double] = js.native
  /* 2 */ @js.native
  object MouseEnter extends TopLevel[MouseEnter with Double]
  
  /* 1 */ @js.native
  object MouseFollow extends TopLevel[MouseFollow with Double]
  
  /* 0 */ @js.native
  object Target extends TopLevel[Target with Double]
  
}

