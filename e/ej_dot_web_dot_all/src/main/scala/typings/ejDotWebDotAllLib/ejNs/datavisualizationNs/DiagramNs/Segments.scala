package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Segments extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Segments")
@js.native
object Segments extends js.Object {
  //Used to specify the lines as Bezier
  @js.native
  sealed trait Bezier
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Segments
  
  //Used to specify the lines as Orthogonal
  @js.native
  sealed trait Orthogonal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Segments
  
  //Used to specify the lines as Straight
  @js.native
  sealed trait Straight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Segments
  
  val Bezier: Bezier with java.lang.String = js.native
  val Orthogonal: Orthogonal with java.lang.String = js.native
  val Straight: Straight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Segments with java.lang.String
  ] = js.native
}

