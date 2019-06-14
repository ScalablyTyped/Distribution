package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Diagram
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ScrollLimit
  
  //Used to set scrollLimit as Infinite
  @js.native
  sealed trait Infinite
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ScrollLimit
  
  //Used to set scrollLimit as Limited
  @js.native
  sealed trait Limited
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ScrollLimit
  
  /* 1 */ val Diagram: Diagram with scala.Double = js.native
  /* 0 */ val Infinite: Infinite with scala.Double = js.native
  /* 2 */ val Limited: Limited with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ScrollLimit with scala.Double
  ] = js.native
}

