package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
