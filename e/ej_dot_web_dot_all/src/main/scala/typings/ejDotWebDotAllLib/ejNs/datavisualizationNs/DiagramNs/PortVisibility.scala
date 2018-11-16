package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PortVisibility extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PortVisibility")
@js.native
object PortVisibility extends js.Object {
  //Port gets visible when connect connector to node
  @js.native
  sealed trait Connect
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility
  
  //Specifies the port visibility as default
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility
  
  //Set the port visibility as Hidden
  @js.native
  sealed trait Hidden
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility
  
  //Port get visible when hover connector on node
  @js.native
  sealed trait Hover
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility
  
  //Set the port visibility as Visible
  @js.native
  sealed trait Visible
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility
  
  val Connect: Connect with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Hidden: Hidden with java.lang.String = js.native
  val Hover: Hover with java.lang.String = js.native
  val Visible: Visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility with java.lang.String
  ] = js.native
}

