package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextAlign")
@js.native
object TextAlign extends js.Object {
  //Used to align text on center of node/connector
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextAlign
  
  //Used to align text on left side of node/connector
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextAlign
  
  //Used to align text on Right side of node/connector
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextAlign
  
  val Center: Center with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextAlign with java.lang.String
  ] = js.native
}

