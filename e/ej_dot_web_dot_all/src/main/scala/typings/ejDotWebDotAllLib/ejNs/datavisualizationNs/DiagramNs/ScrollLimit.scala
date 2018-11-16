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
  
  val Diagram: Diagram with java.lang.String = js.native
  val Infinite: Infinite with java.lang.String = js.native
  val Limited: Limited with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ScrollLimit with java.lang.String
  ] = js.native
}

