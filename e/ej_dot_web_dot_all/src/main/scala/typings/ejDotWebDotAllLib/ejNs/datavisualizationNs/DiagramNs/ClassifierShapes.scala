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
  
  val Aggregation: Aggregation with java.lang.String = js.native
  val Association: Association with java.lang.String = js.native
  val Class: Class with java.lang.String = js.native
  val Composition: Composition with java.lang.String = js.native
  val Dependency: Dependency with java.lang.String = js.native
  val Enumeration: Enumeration with java.lang.String = js.native
  val Inheritance: Inheritance with java.lang.String = js.native
  val Interface: Interface with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ClassifierShapes with java.lang.String
  ] = js.native
}

