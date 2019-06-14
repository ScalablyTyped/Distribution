package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Aggregation
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to notate association in UML Class Diagram
  @js.native
  sealed trait Association
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to define a Class
  @js.native
  sealed trait Class
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to notate composition in a UML Class Diagram
  @js.native
  sealed trait Composition
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to notate dependency in a UML Class Diagram
  @js.native
  sealed trait Dependency
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to define an Enumeration
  @js.native
  sealed trait Enumeration
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to notate inheritance in a UML Class Diagram
  @js.native
  sealed trait Inheritance
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  //Used to define an Interface
  @js.native
  sealed trait Interface
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes
  
  /* 4 */ val Aggregation: Aggregation with scala.Double = js.native
  /* 3 */ val Association: Association with scala.Double = js.native
  /* 0 */ val Class: Class with scala.Double = js.native
  /* 5 */ val Composition: Composition with scala.Double = js.native
  /* 6 */ val Dependency: Dependency with scala.Double = js.native
  /* 2 */ val Enumeration: Enumeration with scala.Double = js.native
  /* 7 */ val Inheritance: Inheritance with scala.Double = js.native
  /* 1 */ val Interface: Interface with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes with scala.Double
  ] = js.native
}

