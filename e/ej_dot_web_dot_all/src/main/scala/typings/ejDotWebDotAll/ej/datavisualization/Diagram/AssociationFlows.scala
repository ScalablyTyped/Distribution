package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AssociationFlows with Double] = js.native
  /* 2 */ @js.native
  object BiDirectional extends TopLevel[BiDirectional with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Directional extends TopLevel[Directional with Double]
  
}

