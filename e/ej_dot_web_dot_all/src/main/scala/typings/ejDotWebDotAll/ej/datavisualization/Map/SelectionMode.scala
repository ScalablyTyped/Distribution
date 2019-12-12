package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.SelectionMode.Default
import typings.ejDotWebDotAll.ej.datavisualization.Map.SelectionMode.Multiple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSGlobal("ej.datavisualization.Map.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  //specifies the default position
  @js.native
  sealed trait Default extends SelectionMode
  
  //specifies the multiple position
  @js.native
  sealed trait Multiple extends SelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
}

