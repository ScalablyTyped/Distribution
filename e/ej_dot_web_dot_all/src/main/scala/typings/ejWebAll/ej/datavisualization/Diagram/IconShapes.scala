package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.IconShapes")
@js.native
object IconShapes extends js.Object {
  //Used to set collapse icon shape as Arrow(Up/Down)
  @js.native
  sealed trait Arrow extends IconShapes
  
  //Used to set icon shape as image
  @js.native
  sealed trait Image extends IconShapes
  
  //Used to set collapse icon shape as Minus
  @js.native
  sealed trait Minus extends IconShapes
  
  //Used to set collapse icon shape as none
  @js.native
  sealed trait None extends IconShapes
  
  //Used to set collapse icon shape as path
  @js.native
  sealed trait Path extends IconShapes
  
  //Used to set collapse icon shape as Plus
  @js.native
  sealed trait Plus extends IconShapes
  
  //Used to set icon shape as template
  @js.native
  sealed trait Template extends IconShapes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconShapes with Double] = js.native
  /* 1 */ @js.native
  object Arrow extends TopLevel[Arrow with Double]
  
  /* 6 */ @js.native
  object Image extends TopLevel[Image with Double]
  
  /* 3 */ @js.native
  object Minus extends TopLevel[Minus with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Path extends TopLevel[Path with Double]
  
  /* 2 */ @js.native
  object Plus extends TopLevel[Plus with Double]
  
  /* 5 */ @js.native
  object Template extends TopLevel[Template with Double]
  
}

