package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.VisibilityMode.Hideonexceededlength
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.VisibilityMode.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  //specifies the hide on exceeded length mode
  @js.native
  sealed trait Hideonexceededlength extends VisibilityMode
  
  //specifies the visible mode
  @js.native
  sealed trait Top extends VisibilityMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityMode with Double] = js.native
  /* 1 */ @js.native
  object Hideonexceededlength extends TopLevel[Hideonexceededlength with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

