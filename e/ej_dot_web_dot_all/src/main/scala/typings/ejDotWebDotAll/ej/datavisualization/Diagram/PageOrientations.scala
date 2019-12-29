package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientations extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PageOrientations")
@js.native
object PageOrientations extends js.Object {
  //Used to set orientation as Landscape
  @js.native
  sealed trait Landscape extends PageOrientations
  
  //Used to set orientation as portrait
  @js.native
  sealed trait Portrait extends PageOrientations
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageOrientations with Double] = js.native
  /* 0 */ @js.native
  object Landscape extends TopLevel[Landscape with Double]
  
  /* 1 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
  
}

