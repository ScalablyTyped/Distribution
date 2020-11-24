package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
