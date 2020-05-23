package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

