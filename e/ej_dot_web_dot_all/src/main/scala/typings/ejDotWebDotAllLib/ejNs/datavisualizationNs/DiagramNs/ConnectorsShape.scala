package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsShape extends js.Object {
  /** Defines the shape of UMLActivity to connector. Applicable, if the connector is of type UMLActivity
    * @Default {ej.datavisualization.Diagram.UMLActivityFlow.Control}
    */
  var ActivityFlow: js.UndefOr[UMLActivityFlow | java.lang.String] = js.undefined
  /** Sets the type of the Association in a BPMN Process
    * @Default {ej.datavisualization.Diagram.AssociationFlows.Default}
    */
  var association: js.UndefOr[AssociationFlows | java.lang.String] = js.undefined
  /** Sets the type of the flow in a BPMN Process
    * @Default {ej.datavisualization.Diagram.BPMNFlows.Sequence}
    */
  var flow: js.UndefOr[BPMNFlows | java.lang.String] = js.undefined
  /** Sets the type of the message flow. Applicable, if the connector is of type &quot;BPMN&quot;
    * @Default {ej.datavisualization.Diagram.BPMNMessageFlows.Default}
    */
  var message: js.UndefOr[BPMNMessageFlows | java.lang.String] = js.undefined
  /** Defines the multiplicity option of the connector
    * @Default {null}
    */
  var multiplicity: js.UndefOr[ConnectorsShapeMultiplicity] = js.undefined
  /** Defines the role of the connector in a UML Class Diagram. Applicable, if the type of the connector is &quot;classifier&quot;.
    * @Default {ej.datavisualization.Diagram.ClassifierShapes.Association}
    */
  var relationship: js.UndefOr[ClassifierShapes | java.lang.String] = js.undefined
  /** Sets the type of BPMN sequence flow
    * @Default {ej.datavisualization.Diagram.BPMNSequenceFlows.Normal}
    */
  var sequence: js.UndefOr[BPMNSequenceFlows | java.lang.String] = js.undefined
  /** Sets the type of the connector
    * @Default {ej.datavisualization.Diagram.ConnectorShapes.BPMN}
    */
  var `type`: js.UndefOr[ConnectorShapes | java.lang.String] = js.undefined
}

