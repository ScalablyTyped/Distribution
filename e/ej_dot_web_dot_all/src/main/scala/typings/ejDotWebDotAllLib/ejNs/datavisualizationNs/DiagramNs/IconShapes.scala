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
  
  val Arrow: Arrow with java.lang.String = js.native
  val Image: Image with java.lang.String = js.native
  val Minus: Minus with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Path: Path with java.lang.String = js.native
  val Plus: Plus with java.lang.String = js.native
  val Template: Template with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.IconShapes with java.lang.String
  ] = js.native
}

