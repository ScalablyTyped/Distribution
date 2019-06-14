package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Shapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Shapes")
@js.native
object Shapes extends js.Object {
  //Used to specify node type as BPMN
  @js.native
  sealed trait BPMN
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as Basic
  @js.native
  sealed trait Basic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as Flow
  @js.native
  sealed trait Flow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as HTML
  @js.native
  sealed trait HTML
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as Image
  @js.native
  sealed trait Image
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as Native
  @js.native
  sealed trait Native
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as Text
  @js.native
  sealed trait Text
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as UMLActivity
  @js.native
  sealed trait UMLActivity
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  //Used to specify node type as UMLClassifier
  @js.native
  sealed trait UMLClassifier
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes
  
  /* 6 */ val BPMN: BPMN with scala.Double = js.native
  /* 4 */ val Basic: Basic with scala.Double = js.native
  /* 5 */ val Flow: Flow with scala.Double = js.native
  /* 2 */ val HTML: HTML with scala.Double = js.native
  /* 1 */ val Image: Image with scala.Double = js.native
  /* 3 */ val Native: Native with scala.Double = js.native
  /* 0 */ val Text: Text with scala.Double = js.native
  /* 8 */ val UMLActivity: UMLActivity with scala.Double = js.native
  /* 7 */ val UMLClassifier: UMLClassifier with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes with scala.Double] = js.native
}

