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
  
  val BiDirectional: BiDirectional with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Directional: Directional with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.AssociationFlows with java.lang.String
  ] = js.native
}

