package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Multiplicity extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Multiplicity")
@js.native
object Multiplicity extends js.Object {
  //The entity instances can be related to multiple instances of each other
  @js.native
  sealed trait ManyToMany
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Multiplicity
  
  //Multiple instances of an entity can be related to a single instance of the other entity
  @js.native
  sealed trait ManyToOne
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Multiplicity
  
  //An entity instance can be related to multiple instances of the other entities
  @js.native
  sealed trait OneToMany
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Multiplicity
  
  //Each entity instance is related to a single instance of another entity
  @js.native
  sealed trait OneToOne
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Multiplicity
  
  val ManyToMany: ManyToMany with java.lang.String = js.native
  val ManyToOne: ManyToOne with java.lang.String = js.native
  val OneToMany: OneToMany with java.lang.String = js.native
  val OneToOne: OneToOne with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Multiplicity with java.lang.String
  ] = js.native
}

