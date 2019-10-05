package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait ManyToMany extends Multiplicity
  
  //Multiple instances of an entity can be related to a single instance of the other entity
  @js.native
  sealed trait ManyToOne extends Multiplicity
  
  //An entity instance can be related to multiple instances of the other entities
  @js.native
  sealed trait OneToMany extends Multiplicity
  
  //Each entity instance is related to a single instance of another entity
  @js.native
  sealed trait OneToOne extends Multiplicity
  
  /* 3 */ val ManyToMany: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Multiplicity.ManyToMany with Double = js.native
  /* 2 */ val ManyToOne: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Multiplicity.ManyToOne with Double = js.native
  /* 1 */ val OneToMany: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Multiplicity.OneToMany with Double = js.native
  /* 0 */ val OneToOne: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Multiplicity.OneToOne with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Multiplicity with Double] = js.native
}

