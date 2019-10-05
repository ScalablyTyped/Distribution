package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PortConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PortConstraints")
@js.native
object PortConstraints extends js.Object {
  //Enables connections with connector
  @js.native
  sealed trait Connect extends PortConstraints
  
  //Enables to create the connection when mouse hover on the port.
  @js.native
  sealed trait ConnectOnDrag extends PortConstraints
  
  //Disable all constraints
  @js.native
  sealed trait None extends PortConstraints
  
  /* 1 */ val Connect: typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortConstraints.Connect with Double = js.native
  /* 2 */ val ConnectOnDrag: typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortConstraints.ConnectOnDrag with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortConstraints.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PortConstraints with Double] = js.native
}

