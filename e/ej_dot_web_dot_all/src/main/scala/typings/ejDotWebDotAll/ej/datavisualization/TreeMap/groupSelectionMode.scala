package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.groupSelectionMode.Default
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.groupSelectionMode.Multiple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait groupSelectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.groupSelectionMode")
@js.native
object groupSelectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends groupSelectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple extends groupSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[groupSelectionMode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
}

