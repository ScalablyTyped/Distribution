package typings.fontoxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object com_ {
  
  object fontoxml {
    
    trait IFontoMessageEventData extends StObject {
      
      var command: String
      
      var metadata: js.Any
      
      var scope: IInvocator
      
      var `type`: String
    }
    object IFontoMessageEventData {
      
      inline def apply(command: String, metadata: js.Any, scope: IInvocator, `type`: String): IFontoMessageEventData = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFontoMessageEventData]
      }
      
      extension [Self <: IFontoMessageEventData](x: Self) {
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setScope(value: IInvocator): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait IInvocator extends StObject {
      
      //Allow/disallow auto-save functionality.
      var autosave: js.UndefOr[Boolean] = js.undefined
      
      //The base URL where the CMS endpoints are exposed.
      var cmsBaseUrl: String
      
      //The document id's of the documents to load from the CMS.
      var documentIds: js.Array[String]
      
      //The edit session token to use for accessing the CMS endpoints.
      var editSessionToken: String
      
      //If set to a positive integer, enable the Heartbeat API to send every x seconds.
      var heartbeat: js.UndefOr[Double] = js.undefined
      
      //User information.
      var user: js.UndefOr[IUserInfo] = js.undefined
      
      //Workflow information.
      var workflow: js.UndefOr[IWorkflowInfo] = js.undefined
    }
    object IInvocator {
      
      inline def apply(cmsBaseUrl: String, documentIds: js.Array[String], editSessionToken: String): IInvocator = {
        val __obj = js.Dynamic.literal(cmsBaseUrl = cmsBaseUrl.asInstanceOf[js.Any], documentIds = documentIds.asInstanceOf[js.Any], editSessionToken = editSessionToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[IInvocator]
      }
      
      extension [Self <: IInvocator](x: Self) {
        
        inline def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
        
        inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
        
        inline def setCmsBaseUrl(value: String): Self = StObject.set(x, "cmsBaseUrl", value.asInstanceOf[js.Any])
        
        inline def setDocumentIds(value: js.Array[String]): Self = StObject.set(x, "documentIds", value.asInstanceOf[js.Any])
        
        inline def setDocumentIdsVarargs(value: String*): Self = StObject.set(x, "documentIds", js.Array(value :_*))
        
        inline def setEditSessionToken(value: String): Self = StObject.set(x, "editSessionToken", value.asInstanceOf[js.Any])
        
        inline def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
        
        inline def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
        
        inline def setUser(value: IUserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        inline def setWorkflow(value: IWorkflowInfo): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
        
        inline def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
      }
    }
    
    trait IUserInfo
      extends StObject
         with IWorkflowInfo {
      
      var roleId: String
    }
    object IUserInfo {
      
      inline def apply(displayName: String, id: String, roleId: String): IUserInfo = {
        val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any])
        __obj.asInstanceOf[IUserInfo]
      }
      
      extension [Self <: IUserInfo](x: Self) {
        
        inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
      }
    }
    
    trait IWorkflowInfo extends StObject {
      
      var displayName: String
      
      var id: String
    }
    object IWorkflowInfo {
      
      inline def apply(displayName: String, id: String): IWorkflowInfo = {
        val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[IWorkflowInfo]
      }
      
      extension [Self <: IWorkflowInfo](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
  }
}
