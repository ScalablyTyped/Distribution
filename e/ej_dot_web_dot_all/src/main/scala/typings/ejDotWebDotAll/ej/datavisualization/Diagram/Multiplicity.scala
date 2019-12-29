package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Multiplicity with Double] = js.native
  /* 3 */ @js.native
  object ManyToMany extends TopLevel[ManyToMany with Double]
  
  /* 2 */ @js.native
  object ManyToOne extends TopLevel[ManyToOne with Double]
  
  /* 1 */ @js.native
  object OneToMany extends TopLevel[OneToMany with Double]
  
  /* 0 */ @js.native
  object OneToOne extends TopLevel[OneToOne with Double]
  
}

