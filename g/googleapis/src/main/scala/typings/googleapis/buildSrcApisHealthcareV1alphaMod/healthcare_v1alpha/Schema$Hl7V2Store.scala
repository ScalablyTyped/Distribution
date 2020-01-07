package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an HL7v2 store.
  */
@js.native
trait Schema$Hl7V2Store extends js.Object {
  /**
    * Output only. Resource name of the HL7v2 store, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notification destination all messages (both Ingest &amp; Create) are
    * published on. Only the message name is sent as part of the notification.
    * If this is unset, no notifications will be sent. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[Schema$NotificationConfig] = js.native
  /**
    * The configuration for the parser. It determines how the server parses the
    * messages.
    */
  var parserConfig: js.UndefOr[Schema$ParserConfig] = js.native
}

object Schema$Hl7V2Store {
  @scala.inline
  def apply(
    name: String = null,
    notificationConfig: Schema$NotificationConfig = null,
    parserConfig: Schema$ParserConfig = null
  ): Schema$Hl7V2Store = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationConfig != null) __obj.updateDynamic("notificationConfig")(notificationConfig.asInstanceOf[js.Any])
    if (parserConfig != null) __obj.updateDynamic("parserConfig")(parserConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Hl7V2Store]
  }
}

