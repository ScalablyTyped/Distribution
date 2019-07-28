package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Connect extends PortVisibility
  
  //Specifies the port visibility as default
  @js.native
  sealed trait Default extends PortVisibility
  
  //Set the port visibility as Hidden
  @js.native
  sealed trait Hidden extends PortVisibility
  
  //Port get visible when hover connector on node
  @js.native
  sealed trait Hover extends PortVisibility
  
  //Set the port visibility as Visible
  @js.native
  sealed trait Visible extends PortVisibility
  
  /* 3 */ val Connect: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortVisibility.Connect with Double = js.native
  /* 4 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortVisibility.Default with Double = js.native
  /* 1 */ val Hidden: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortVisibility.Hidden with Double = js.native
  /* 2 */ val Hover: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortVisibility.Hover with Double = js.native
  /* 0 */ val Visible: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortVisibility.Visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PortVisibility with Double] = js.native
}

