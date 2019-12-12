package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortConstraints.Connect
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortConstraints.ConnectOnDrag
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortConstraints.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PortConstraints with Double] = js.native
  /* 1 */ @js.native
  object Connect extends TopLevel[Connect with Double]
  
  /* 2 */ @js.native
  object ConnectOnDrag extends TopLevel[ConnectOnDrag with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

