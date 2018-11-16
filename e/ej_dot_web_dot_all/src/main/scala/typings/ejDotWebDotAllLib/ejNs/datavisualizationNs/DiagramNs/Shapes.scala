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
  
  val BPMN: BPMN with java.lang.String = js.native
  val Basic: Basic with java.lang.String = js.native
  val Flow: Flow with java.lang.String = js.native
  val HTML: HTML with java.lang.String = js.native
  val Image: Image with java.lang.String = js.native
  val Native: Native with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  val UMLActivity: UMLActivity with java.lang.String = js.native
  val UMLClassifier: UMLClassifier with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Shapes with java.lang.String
  ] = js.native
}

