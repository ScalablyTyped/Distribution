package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait BPMN extends Shapes
  
  //Used to specify node type as Basic
  @js.native
  sealed trait Basic extends Shapes
  
  //Used to specify node type as Flow
  @js.native
  sealed trait Flow extends Shapes
  
  //Used to specify node type as HTML
  @js.native
  sealed trait HTML extends Shapes
  
  //Used to specify node type as Image
  @js.native
  sealed trait Image extends Shapes
  
  //Used to specify node type as Native
  @js.native
  sealed trait Native extends Shapes
  
  //Used to specify node type as Text
  @js.native
  sealed trait Text extends Shapes
  
  //Used to specify node type as UMLActivity
  @js.native
  sealed trait UMLActivity extends Shapes
  
  //Used to specify node type as UMLClassifier
  @js.native
  sealed trait UMLClassifier extends Shapes
  
  /* 6 */ val BPMN: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.BPMN with Double = js.native
  /* 4 */ val Basic: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.Basic with Double = js.native
  /* 5 */ val Flow: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.Flow with Double = js.native
  /* 2 */ val HTML: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.HTML with Double = js.native
  /* 1 */ val Image: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.Image with Double = js.native
  /* 3 */ val Native: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.Native with Double = js.native
  /* 0 */ val Text: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.Text with Double = js.native
  /* 8 */ val UMLActivity: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.UMLActivity with Double = js.native
  /* 7 */ val UMLClassifier: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Shapes.UMLClassifier with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Shapes with Double] = js.native
}

