package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Arrow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  //Used to set icon shape as image
  @js.native
  sealed trait Image
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  //Used to set collapse icon shape as Minus
  @js.native
  sealed trait Minus
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  //Used to set collapse icon shape as none
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  //Used to set collapse icon shape as path
  @js.native
  sealed trait Path
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  //Used to set collapse icon shape as Plus
  @js.native
  sealed trait Plus
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  //Used to set icon shape as template
  @js.native
  sealed trait Template
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes
  
  /* 1 */ val Arrow: Arrow with scala.Double = js.native
  /* 6 */ val Image: Image with scala.Double = js.native
  /* 3 */ val Minus: Minus with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Path: Path with scala.Double = js.native
  /* 2 */ val Plus: Plus with scala.Double = js.native
  /* 5 */ val Template: Template with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes with scala.Double
  ] = js.native
}

