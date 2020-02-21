package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Shapes with Double] = js.native
  /* 6 */ @js.native
  object BPMN extends TopLevel[BPMN with Double]
  
  /* 4 */ @js.native
  object Basic extends TopLevel[Basic with Double]
  
  /* 5 */ @js.native
  object Flow extends TopLevel[Flow with Double]
  
  /* 2 */ @js.native
  object Html extends TopLevel[Html with Double]
  
  /* 1 */ @js.native
  object Image extends TopLevel[Image with Double]
  
  /* 3 */ @js.native
  object Native extends TopLevel[Native with Double]
  
  /* 0 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /* 8 */ @js.native
  object UMLActivity extends TopLevel[UMLActivity with Double]
  
  /* 7 */ @js.native
  object UMLClassifier extends TopLevel[UMLClassifier with Double]
  
}

