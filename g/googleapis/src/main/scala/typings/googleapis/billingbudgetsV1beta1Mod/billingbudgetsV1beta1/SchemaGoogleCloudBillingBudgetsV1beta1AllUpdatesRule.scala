package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1beta1AllUpdatesRule extends StObject {
  
  /**
    * Optional. When set to true, disables default notifications sent when a threshold is exceeded. Default notifications are sent to those with Billing Account Administrator and Billing Account User IAM roles for the target account.
    */
  var disableDefaultIamRecipients: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to default recipients who have billing account IAM roles. The value is the full REST resource name of a monitoring notification channel with the form `projects/{project_id\}/notificationChannels/{channel_id\}`. A maximum of 5 channels are allowed. See https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more details.
    */
  var monitoringNotificationChannels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the form `projects/{project_id\}/topics/{topic_id\}`. Updates are sent at regular intervals to the topic. The topic needs to be created before the budget is created; see https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more details. Caller is expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#permissions_required_for_this_task for more details on Pub/Sub roles and permissions.
    */
  var pubsubTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Required when AllUpdatesRule.pubsub_topic is set. The schema version of the notification sent to AllUpdatesRule.pubsub_topic. Only "1.0" is accepted. It represents the JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format.
    */
  var schemaVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1beta1AllUpdatesRule {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1beta1AllUpdatesRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1beta1AllUpdatesRule]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1beta1AllUpdatesRule](x: Self) {
    
    inline def setDisableDefaultIamRecipients(value: Boolean): Self = StObject.set(x, "disableDefaultIamRecipients", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultIamRecipientsNull: Self = StObject.set(x, "disableDefaultIamRecipients", null)
    
    inline def setDisableDefaultIamRecipientsUndefined: Self = StObject.set(x, "disableDefaultIamRecipients", js.undefined)
    
    inline def setMonitoringNotificationChannels(value: js.Array[String]): Self = StObject.set(x, "monitoringNotificationChannels", value.asInstanceOf[js.Any])
    
    inline def setMonitoringNotificationChannelsNull: Self = StObject.set(x, "monitoringNotificationChannels", null)
    
    inline def setMonitoringNotificationChannelsUndefined: Self = StObject.set(x, "monitoringNotificationChannels", js.undefined)
    
    inline def setMonitoringNotificationChannelsVarargs(value: String*): Self = StObject.set(x, "monitoringNotificationChannels", js.Array(value*))
    
    inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNull: Self = StObject.set(x, "pubsubTopic", null)
    
    inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
    
    inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionNull: Self = StObject.set(x, "schemaVersion", null)
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
  }
}
