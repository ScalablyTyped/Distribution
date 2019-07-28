package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollLimit extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ScrollLimit")
@js.native
object ScrollLimit extends js.Object {
  //Used to set scrollLimit as Diagram
  @js.native
  sealed trait Diagram extends ScrollLimit
  
  //Used to set scrollLimit as Infinite
  @js.native
  sealed trait Infinite extends ScrollLimit
  
  //Used to set scrollLimit as Limited
  @js.native
  sealed trait Limited extends ScrollLimit
  
  /* 1 */ val Diagram: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ScrollLimit.Diagram with Double = js.native
  /* 0 */ val Infinite: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ScrollLimit.Infinite with Double = js.native
  /* 2 */ val Limited: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ScrollLimit.Limited with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollLimit with Double] = js.native
}

