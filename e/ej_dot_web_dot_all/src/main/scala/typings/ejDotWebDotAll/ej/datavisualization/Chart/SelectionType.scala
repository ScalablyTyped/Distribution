package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.SelectionType.Multiple
import typings.ejDotWebDotAll.ej.datavisualization.Chart.SelectionType.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SelectionType")
@js.native
object SelectionType extends js.Object {
  //string
  @js.native
  sealed trait Multiple extends SelectionType
  
  //string
  @js.native
  sealed trait Single extends SelectionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
  /* 0 */ @js.native
  object Single extends TopLevel[Single with Double]
  
}

