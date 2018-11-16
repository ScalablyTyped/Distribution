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
  
  val Canvas: Canvas with java.lang.String = js.native
  val Stack: Stack with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ContainerType with java.lang.String
  ] = js.native
}

