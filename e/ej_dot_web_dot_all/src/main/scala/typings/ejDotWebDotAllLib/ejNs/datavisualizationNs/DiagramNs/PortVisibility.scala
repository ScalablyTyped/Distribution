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
  
  /* 3 */ val Connect: Connect with scala.Double = js.native
  /* 4 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Hidden: Hidden with scala.Double = js.native
  /* 2 */ val Hover: Hover with scala.Double = js.native
  /* 0 */ val Visible: Visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortVisibility with scala.Double
  ] = js.native
}

