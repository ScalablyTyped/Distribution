package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorsShape extends js.Object {
  
  /** Defines the shape of UMLActivity to connector. Applicable, if the connector is of type UMLActivity
    * @Default {ej.datavisualization.Diagram.UMLActivityFlow.Control}
    */
  var ActivityFlow: js.UndefOr[UMLActivityFlow | String] = js.native
  
  /** Sets the type of the Association in a BPMN Process
    * @Default {ej.datavisualization.Diagram.AssociationFlows.Default}
    */
  var association: js.UndefOr[AssociationFlows | String] = js.native
  
  /** Sets the type of the flow in a BPMN Process
    * @Default {ej.datavisualization.Diagram.BPMNFlows.Sequence}
    */
  var flow: js.UndefOr[BPMNFlows | String] = js.native
  
  /** Sets the type of the message flow. Applicable, if the connector is of type &quot;BPMN&quot;
    * @Default {ej.datavisualization.Diagram.BPMNMessageFlows.Default}
    */
  var message: js.UndefOr[BPMNMessageFlows | String] = js.native
  
  /** Defines the multiplicity option of the connector
    * @Default {null}
    */
  var multiplicity: js.UndefOr[ConnectorsShapeMultiplicity] = js.native
  
  /** Defines the role of the connector in a UML Class Diagram. Applicable, if the type of the connector is &quot;classifier&quot;.
    * @Default {ej.datavisualization.Diagram.ClassifierShapes.Association}
    */
  var relationship: js.UndefOr[ClassifierShapes | String] = js.native
  
  /** Sets the type of BPMN sequence flow
    * @Default {ej.datavisualization.Diagram.BPMNSequenceFlows.Normal}
    */
  var sequence: js.UndefOr[BPMNSequenceFlows | String] = js.native
  
  /** Sets the type of the connector
    * @Default {ej.datavisualization.Diagram.ConnectorShapes.BPMN}
    */
  var `type`: js.UndefOr[ConnectorShapes | String] = js.native
}
object ConnectorsShape {
  
  @scala.inline
  def apply(): ConnectorsShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsShape]
  }
  
  @scala.inline
  implicit class ConnectorsShapeOps[Self <: ConnectorsShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivityFlow(value: UMLActivityFlow | String): Self = this.set("ActivityFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityFlow: Self = this.set("ActivityFlow", js.undefined)
    
    @scala.inline
    def setAssociation(value: AssociationFlows | String): Self = this.set("association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("association", js.undefined)
    
    @scala.inline
    def setFlow(value: BPMNFlows | String): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlow: Self = this.set("flow", js.undefined)
    
    @scala.inline
    def setMessage(value: BPMNMessageFlows | String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMultiplicity(value: ConnectorsShapeMultiplicity): Self = this.set("multiplicity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplicity: Self = this.set("multiplicity", js.undefined)
    
    @scala.inline
    def setRelationship(value: ClassifierShapes | String): Self = this.set("relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationship: Self = this.set("relationship", js.undefined)
    
    @scala.inline
    def setSequence(value: BPMNSequenceFlows | String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setType(value: ConnectorShapes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
