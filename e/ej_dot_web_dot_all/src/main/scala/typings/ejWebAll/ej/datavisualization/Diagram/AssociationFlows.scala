package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
