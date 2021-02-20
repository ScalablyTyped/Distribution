package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNotification extends StObject {
  
  var body: js.UndefOr[String] = js.native
  
  /**
    * The list of crm experiment ids.
    */
  var crmExperimentIds: js.UndefOr[js.Array[String]] = js.native
  
  var doc_id: js.UndefOr[String] = js.native
  
  var doc_type: js.UndefOr[String] = js.native
  
  var dont_show_notification: js.UndefOr[Boolean] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var is_document_mature: js.UndefOr[Boolean] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  var notificationGroup: js.UndefOr[String] = js.native
  
  var notification_type: js.UndefOr[String] = js.native
  
  var pcampaign_id: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var show_notification_settings_action: js.UndefOr[Boolean] = js.native
  
  var targetUrl: js.UndefOr[String] = js.native
  
  var timeToExpireMs: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationMutableBuilder[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCrmExperimentIds(value: js.Array[String]): Self = StObject.set(x, "crmExperimentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrmExperimentIdsUndefined: Self = StObject.set(x, "crmExperimentIds", js.undefined)
    
    @scala.inline
    def setCrmExperimentIdsVarargs(value: String*): Self = StObject.set(x, "crmExperimentIds", js.Array(value :_*))
    
    @scala.inline
    def setDoc_id(value: String): Self = StObject.set(x, "doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_idUndefined: Self = StObject.set(x, "doc_id", js.undefined)
    
    @scala.inline
    def setDoc_type(value: String): Self = StObject.set(x, "doc_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_typeUndefined: Self = StObject.set(x, "doc_type", js.undefined)
    
    @scala.inline
    def setDont_show_notification(value: Boolean): Self = StObject.set(x, "dont_show_notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDont_show_notificationUndefined: Self = StObject.set(x, "dont_show_notification", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setIs_document_mature(value: Boolean): Self = StObject.set(x, "is_document_mature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_document_matureUndefined: Self = StObject.set(x, "is_document_mature", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNotificationGroup(value: String): Self = StObject.set(x, "notificationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationGroupUndefined: Self = StObject.set(x, "notificationGroup", js.undefined)
    
    @scala.inline
    def setNotification_type(value: String): Self = StObject.set(x, "notification_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification_typeUndefined: Self = StObject.set(x, "notification_type", js.undefined)
    
    @scala.inline
    def setPcampaign_id(value: String): Self = StObject.set(x, "pcampaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcampaign_idUndefined: Self = StObject.set(x, "pcampaign_id", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setShow_notification_settings_action(value: Boolean): Self = StObject.set(x, "show_notification_settings_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_notification_settings_actionUndefined: Self = StObject.set(x, "show_notification_settings_action", js.undefined)
    
    @scala.inline
    def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
    
    @scala.inline
    def setTimeToExpireMs(value: String): Self = StObject.set(x, "timeToExpireMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToExpireMsUndefined: Self = StObject.set(x, "timeToExpireMs", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
