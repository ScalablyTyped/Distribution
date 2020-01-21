package typings.ejWebAll.ej.datavisualization.TreeMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait selectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.selectionMode")
@js.native
object selectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends selectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple extends selectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[selectionMode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
}

