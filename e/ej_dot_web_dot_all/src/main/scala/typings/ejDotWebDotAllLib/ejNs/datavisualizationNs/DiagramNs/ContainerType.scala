package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerType extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ContainerType")
@js.native
object ContainerType extends js.Object {
  //Sets the container type as Canvas
  @js.native
  sealed trait Canvas
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ContainerType
  
  //Sets the container type as Stack
  @js.native
  sealed trait Stack
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ContainerType
  
  /* 0 */ val Canvas: Canvas with scala.Double = js.native
  /* 1 */ val Stack: Stack with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ContainerType with scala.Double
  ] = js.native
}

