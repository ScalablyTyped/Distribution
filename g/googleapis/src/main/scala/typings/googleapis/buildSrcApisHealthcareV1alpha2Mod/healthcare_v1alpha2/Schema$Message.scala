package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A complete HL7v2 message. See
  * http://www.hl7.org/implement/standards/index.cfm?ref=common for details on
  * the standard.
  */
@js.native
trait Schema$Message extends js.Object {
  /**
    * The datetime when the message was created. Set by the server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Raw message bytes.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * User-supplied key-value pairs used to organize HL7v2 stores.  Label keys
    * must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The message type and trigger event for this message. MSH-9.
    */
  var messageType: js.UndefOr[String] = js.native
  /**
    * Resource name of the Message, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The parsed version of the raw message data.
    */
  var parsedData: js.UndefOr[Schema$ParsedData] = js.native
  /**
    * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this
    * message.
    */
  var patientIds: js.UndefOr[js.Array[Schema$PatientId]] = js.native
  /**
    * The hospital that this message came from. MSH-4.
    */
  var sendFacility: js.UndefOr[String] = js.native
  /**
    * The datetime the sending application sent this message. MSH-7.
    */
  var sendTime: js.UndefOr[String] = js.native
}

object Schema$Message {
  @scala.inline
  def apply(
    createTime: String = null,
    data: String = null,
    labels: StringDictionary[String] = null,
    messageType: String = null,
    name: String = null,
    parsedData: Schema$ParsedData = null,
    patientIds: js.Array[Schema$PatientId] = null,
    sendFacility: String = null,
    sendTime: String = null
  ): Schema$Message = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parsedData != null) __obj.updateDynamic("parsedData")(parsedData.asInstanceOf[js.Any])
    if (patientIds != null) __obj.updateDynamic("patientIds")(patientIds.asInstanceOf[js.Any])
    if (sendFacility != null) __obj.updateDynamic("sendFacility")(sendFacility.asInstanceOf[js.Any])
    if (sendTime != null) __obj.updateDynamic("sendTime")(sendTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Message]
  }
}

