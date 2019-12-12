package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Aggregation
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Association
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Class
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Composition
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Dependency
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Enumeration
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Inheritance
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Interface
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassifierShapes with Double] = js.native
  /* 4 */ @js.native
  object Aggregation extends TopLevel[Aggregation with Double]
  
  /* 3 */ @js.native
  object Association extends TopLevel[Association with Double]
  
  /* 0 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  /* 5 */ @js.native
  object Composition extends TopLevel[Composition with Double]
  
  /* 6 */ @js.native
  object Dependency extends TopLevel[Dependency with Double]
  
  /* 2 */ @js.native
  object Enumeration extends TopLevel[Enumeration with Double]
  
  /* 7 */ @js.native
  object Inheritance extends TopLevel[Inheritance with Double]
  
  /* 1 */ @js.native
  object Interface extends TopLevel[Interface with Double]
  
}

