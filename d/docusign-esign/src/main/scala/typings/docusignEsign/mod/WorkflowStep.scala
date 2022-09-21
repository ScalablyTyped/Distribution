package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStep extends StObject {
  
  /**
    * Indicates the action to perform.
    * - `pause_before`: The workflow should pause before the trigger described by `triggerOnItem` is reached.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of when the workflow step transitioned to `completed` status.
    */
  var completedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the item being triggered.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * The rules for recipient routing.
    */
  var recipientRouting: js.UndefOr[RecipientRouting] = js.undefined
  
  /**
    * The status of the step. One of:
    * - inactive
    * - in_progress
    * - paused
    * - pending
    * - completed
    * This is a read-only property.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The type of item that triggers this workflow step. Currently, only `routing_order`, is the only supported value.
    */
  var triggerOnItem: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of when the workflow step transitioned to `in_progress` status.
    */
  var triggeredDate: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for this workflow step. This value is available from the `currentWorkflowStepId` property of the workflow object,
    */
  var workflowStepId: js.UndefOr[String] = js.undefined
}
object WorkflowStep {
  
  inline def apply(): WorkflowStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStep]
  }
  
  extension [Self <: WorkflowStep](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateUndefined: Self = StObject.set(x, "completedDate", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setRecipientRouting(value: RecipientRouting): Self = StObject.set(x, "recipientRouting", value.asInstanceOf[js.Any])
    
    inline def setRecipientRoutingUndefined: Self = StObject.set(x, "recipientRouting", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTriggerOnItem(value: String): Self = StObject.set(x, "triggerOnItem", value.asInstanceOf[js.Any])
    
    inline def setTriggerOnItemUndefined: Self = StObject.set(x, "triggerOnItem", js.undefined)
    
    inline def setTriggeredDate(value: String): Self = StObject.set(x, "triggeredDate", value.asInstanceOf[js.Any])
    
    inline def setTriggeredDateUndefined: Self = StObject.set(x, "triggeredDate", js.undefined)
    
    inline def setWorkflowStepId(value: String): Self = StObject.set(x, "workflowStepId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepIdUndefined: Self = StObject.set(x, "workflowStepId", js.undefined)
  }
}
