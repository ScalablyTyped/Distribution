package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotification extends StObject {
  
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of crm experiment ids.
    */
  var crmExperimentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var doc_id: js.UndefOr[String | Null] = js.undefined
  
  var doc_type: js.UndefOr[String | Null] = js.undefined
  
  var dont_show_notification: js.UndefOr[Boolean | Null] = js.undefined
  
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  var is_document_mature: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var notificationGroup: js.UndefOr[String | Null] = js.undefined
  
  var notification_type: js.UndefOr[String | Null] = js.undefined
  
  var pcampaign_id: js.UndefOr[String | Null] = js.undefined
  
  var reason: js.UndefOr[String | Null] = js.undefined
  
  var show_notification_settings_action: js.UndefOr[Boolean | Null] = js.undefined
  
  var targetUrl: js.UndefOr[String | Null] = js.undefined
  
  var timeToExpireMs: js.UndefOr[String | Null] = js.undefined
  
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotification {
  
  inline def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  extension [Self <: SchemaNotification](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCrmExperimentIds(value: js.Array[String]): Self = StObject.set(x, "crmExperimentIds", value.asInstanceOf[js.Any])
    
    inline def setCrmExperimentIdsNull: Self = StObject.set(x, "crmExperimentIds", null)
    
    inline def setCrmExperimentIdsUndefined: Self = StObject.set(x, "crmExperimentIds", js.undefined)
    
    inline def setCrmExperimentIdsVarargs(value: String*): Self = StObject.set(x, "crmExperimentIds", js.Array(value*))
    
    inline def setDoc_id(value: String): Self = StObject.set(x, "doc_id", value.asInstanceOf[js.Any])
    
    inline def setDoc_idNull: Self = StObject.set(x, "doc_id", null)
    
    inline def setDoc_idUndefined: Self = StObject.set(x, "doc_id", js.undefined)
    
    inline def setDoc_type(value: String): Self = StObject.set(x, "doc_type", value.asInstanceOf[js.Any])
    
    inline def setDoc_typeNull: Self = StObject.set(x, "doc_type", null)
    
    inline def setDoc_typeUndefined: Self = StObject.set(x, "doc_type", js.undefined)
    
    inline def setDont_show_notification(value: Boolean): Self = StObject.set(x, "dont_show_notification", value.asInstanceOf[js.Any])
    
    inline def setDont_show_notificationNull: Self = StObject.set(x, "dont_show_notification", null)
    
    inline def setDont_show_notificationUndefined: Self = StObject.set(x, "dont_show_notification", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setIs_document_mature(value: Boolean): Self = StObject.set(x, "is_document_mature", value.asInstanceOf[js.Any])
    
    inline def setIs_document_matureNull: Self = StObject.set(x, "is_document_mature", null)
    
    inline def setIs_document_matureUndefined: Self = StObject.set(x, "is_document_mature", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotificationGroup(value: String): Self = StObject.set(x, "notificationGroup", value.asInstanceOf[js.Any])
    
    inline def setNotificationGroupNull: Self = StObject.set(x, "notificationGroup", null)
    
    inline def setNotificationGroupUndefined: Self = StObject.set(x, "notificationGroup", js.undefined)
    
    inline def setNotification_type(value: String): Self = StObject.set(x, "notification_type", value.asInstanceOf[js.Any])
    
    inline def setNotification_typeNull: Self = StObject.set(x, "notification_type", null)
    
    inline def setNotification_typeUndefined: Self = StObject.set(x, "notification_type", js.undefined)
    
    inline def setPcampaign_id(value: String): Self = StObject.set(x, "pcampaign_id", value.asInstanceOf[js.Any])
    
    inline def setPcampaign_idNull: Self = StObject.set(x, "pcampaign_id", null)
    
    inline def setPcampaign_idUndefined: Self = StObject.set(x, "pcampaign_id", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setShow_notification_settings_action(value: Boolean): Self = StObject.set(x, "show_notification_settings_action", value.asInstanceOf[js.Any])
    
    inline def setShow_notification_settings_actionNull: Self = StObject.set(x, "show_notification_settings_action", null)
    
    inline def setShow_notification_settings_actionUndefined: Self = StObject.set(x, "show_notification_settings_action", js.undefined)
    
    inline def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
    
    inline def setTargetUrlNull: Self = StObject.set(x, "targetUrl", null)
    
    inline def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
    
    inline def setTimeToExpireMs(value: String): Self = StObject.set(x, "timeToExpireMs", value.asInstanceOf[js.Any])
    
    inline def setTimeToExpireMsNull: Self = StObject.set(x, "timeToExpireMs", null)
    
    inline def setTimeToExpireMsUndefined: Self = StObject.set(x, "timeToExpireMs", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
