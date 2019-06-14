package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait BiDirectional
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.AssociationFlows
  
  //Used to notate default association in a BPMN Process
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.AssociationFlows
  
  //Used to notate directional association in a BPMN Process
  @js.native
  sealed trait Directional
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.AssociationFlows
  
  /* 2 */ val BiDirectional: BiDirectional with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Directional: Directional with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.AssociationFlows with scala.Double
  ] = js.native
}

