package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClassifierShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ClassifierShapes")
@js.native
object ClassifierShapes extends js.Object {
  //Used to notate aggregation in a UML Class Diagram
  @js.native
  sealed trait Aggregation extends ClassifierShapes
  
  //Used to notate association in UML Class Diagram
  @js.native
  sealed trait Association extends ClassifierShapes
  
  //Used to define a Class
  @js.native
  sealed trait Class extends ClassifierShapes
  
  //Used to notate composition in a UML Class Diagram
  @js.native
  sealed trait Composition extends ClassifierShapes
  
  //Used to notate dependency in a UML Class Diagram
  @js.native
  sealed trait Dependency extends ClassifierShapes
  
  //Used to define an Enumeration
  @js.native
  sealed trait Enumeration extends ClassifierShapes
  
  //Used to notate inheritance in a UML Class Diagram
  @js.native
  sealed trait Inheritance extends ClassifierShapes
  
  //Used to define an Interface
  @js.native
  sealed trait Interface extends ClassifierShapes
  
  /* 4 */ val Aggregation: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Aggregation with Double = js.native
  /* 3 */ val Association: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Association with Double = js.native
  /* 0 */ val Class: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Class with Double = js.native
  /* 5 */ val Composition: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Composition with Double = js.native
  /* 6 */ val Dependency: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Dependency with Double = js.native
  /* 2 */ val Enumeration: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Enumeration with Double = js.native
  /* 7 */ val Inheritance: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Inheritance with Double = js.native
  /* 1 */ val Interface: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes.Interface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassifierShapes with Double] = js.native
}

