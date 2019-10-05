package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssociationFlows extends js.Object

@JSGlobal("ej.datavisualization.Diagram.AssociationFlows")
@js.native
object AssociationFlows extends js.Object {
  //User to notate bi-directional association in a BPMN Process
  @js.native
  sealed trait BiDirectional extends AssociationFlows
  
  //Used to notate default association in a BPMN Process
  @js.native
  sealed trait Default extends AssociationFlows
  
  //Used to notate directional association in a BPMN Process
  @js.native
  sealed trait Directional extends AssociationFlows
  
  /* 2 */ val BiDirectional: typings.ejDotWebDotAll.ej.datavisualization.Diagram.AssociationFlows.BiDirectional with Double = js.native
  /* 0 */ val Default: typings.ejDotWebDotAll.ej.datavisualization.Diagram.AssociationFlows.Default with Double = js.native
  /* 1 */ val Directional: typings.ejDotWebDotAll.ej.datavisualization.Diagram.AssociationFlows.Directional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AssociationFlows with Double] = js.native
}

