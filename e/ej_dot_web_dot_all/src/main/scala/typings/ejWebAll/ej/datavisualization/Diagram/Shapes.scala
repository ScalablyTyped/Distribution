package typings.ejWebAll.ej.datavisualization.Diagram

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
  sealed trait Html extends Shapes
  
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
  
}

