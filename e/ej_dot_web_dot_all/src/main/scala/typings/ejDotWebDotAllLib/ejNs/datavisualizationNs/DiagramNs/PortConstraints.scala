package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Connect
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortConstraints
  
  //Enables to create the connection when mouse hover on the port.
  @js.native
  sealed trait ConnectOnDrag
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortConstraints
  
  //Disable all constraints
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortConstraints
  
  val Connect: Connect with java.lang.String = js.native
  val ConnectOnDrag: ConnectOnDrag with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortConstraints with java.lang.String
  ] = js.native
}

