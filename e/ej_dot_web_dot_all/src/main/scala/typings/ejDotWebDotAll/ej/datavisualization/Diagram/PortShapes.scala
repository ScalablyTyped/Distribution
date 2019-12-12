package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortShapes.Circle
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortShapes.Path
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortShapes.Square
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.PortShapes.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PortShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PortShapes")
@js.native
object PortShapes extends js.Object {
  //Used to set port shape as Circle
  @js.native
  sealed trait Circle extends PortShapes
  
  //Used to set port shape as Path
  @js.native
  sealed trait Path extends PortShapes
  
  //Used to set port shape as Square
  @js.native
  sealed trait Square extends PortShapes
  
  //Used to set port shape as X
  @js.native
  sealed trait X extends PortShapes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PortShapes with Double] = js.native
  /* 1 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 3 */ @js.native
  object Path extends TopLevel[Path with Double]
  
  /* 2 */ @js.native
  object Square extends TopLevel[Square with Double]
  
  /* 0 */ @js.native
  object X extends TopLevel[X with Double]
  
}

