package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PortVisibility with Double] = js.native
  /* 3 */ @js.native
  object Connect extends TopLevel[Connect with Double]
  
  /* 4 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 2 */ @js.native
  object Hover extends TopLevel[Hover with Double]
  
  /* 0 */ @js.native
  object Visible extends TopLevel[Visible with Double]
  
}

