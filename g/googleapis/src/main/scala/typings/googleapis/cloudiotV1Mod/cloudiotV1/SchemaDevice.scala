package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device resource.
  */
@js.native
trait SchemaDevice extends js.Object {
  /**
    * If a device is blocked, connections or requests from this device will
    * fail. Can be used to temporarily prevent the device from connecting if,
    * for example, the sensor is generating bad data and needs maintenance.
    */
  var blocked: js.UndefOr[Boolean] = js.native
  /**
    * The most recent device configuration, which is eventually sent from Cloud
    * IoT Core to the device. If not present on creation, the configuration
    * will be initialized with an empty payload and version value of `1`. To
    * update this field after creation, use the
    * `DeviceManager.ModifyCloudToDeviceConfig` method.
    */
  var config: js.UndefOr[SchemaDeviceConfig] = js.native
  /**
    * The credentials used to authenticate this device. To allow credential
    * rotation without interruption, multiple device credentials can be bound
    * to this device. No more than 3 credentials can be bound to a single
    * device at a time. When new credentials are added to a device, they are
    * verified against the registry credentials. For details, see the
    * description of the `DeviceRegistry.credentials` field.
    */
  var credentials: js.UndefOr[js.Array[SchemaDeviceCredential]] = js.native
  /**
    * Gateway-related configuration and state.
    */
  var gatewayConfig: js.UndefOr[SchemaGatewayConfig] = js.native
  /**
    * The user-defined device identifier. The device ID must be unique within a
    * device registry.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a cloud-to-device config version
    * acknowledgment was received from the device. This field is only for
    * configurations sent through MQTT.
    */
  var lastConfigAckTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a cloud-to-device config version was sent to
    * the device.
    */
  var lastConfigSendTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The error message of the most recent error, such as a
    * failure to publish to Cloud Pub/Sub. &#39;last_error_time&#39; is the
    * timestamp of this field. If no errors have occurred, this field has an
    * empty message and the status code 0 == OK. Otherwise, this field is
    * expected to have a status code other than OK.
    */
  var lastErrorStatus: js.UndefOr[SchemaStatus] = js.native
  /**
    * [Output only] The time the most recent error occurred, such as a failure
    * to publish to Cloud Pub/Sub. This field is the timestamp of
    * &#39;last_error_status&#39;.
    */
  var lastErrorTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a telemetry event was received. Timestamps
    * are periodically collected and written to storage; they may be stale by a
    * few minutes.
    */
  var lastEventTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time an MQTT `PINGREQ` was received. This field
    * applies only to devices connecting through MQTT. MQTT clients usually
    * only send `PINGREQ` messages if the connection is idle, and no other
    * messages have been sent. Timestamps are periodically collected and
    * written to storage; they may be stale by a few minutes.
    */
  var lastHeartbeatTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a state event was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes.
    */
  var lastStateTime: js.UndefOr[String] = js.native
  /**
    * **Beta Feature**  The logging verbosity for device activity. If
    * unspecified, DeviceRegistry.log_level will be used.
    */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * The metadata key-value pairs assigned to the device. This metadata is not
    * interpreted or indexed by Cloud IoT Core. It can be used to add
    * contextual information for the device.  Keys must conform to the regular
    * expression a-zA-Z+ and be less than 128 bytes in length.  Values are
    * free-form strings. Each value must be less than or equal to 32 KB in
    * size.  The total size of all keys and values must be less than 256 KB,
    * and the maximum number of key-value pairs is 500.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The resource path name. For example,
    * `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
    * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`.
    * When `name` is populated as a response from the service, it always ends
    * in the device numeric ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output only] A server-defined unique numeric ID for the device. This is
    * a more compact way to identify devices, and it is globally unique.
    */
  var numId: js.UndefOr[String] = js.native
  /**
    * [Output only] The state most recently received from the device. If no
    * state has been reported, this field is not present.
    */
  var state: js.UndefOr[SchemaDeviceState] = js.native
}

object SchemaDevice {
  @scala.inline
  def apply(
    blocked: js.UndefOr[Boolean] = js.undefined,
    config: SchemaDeviceConfig = null,
    credentials: js.Array[SchemaDeviceCredential] = null,
    gatewayConfig: SchemaGatewayConfig = null,
    id: String = null,
    lastConfigAckTime: String = null,
    lastConfigSendTime: String = null,
    lastErrorStatus: SchemaStatus = null,
    lastErrorTime: String = null,
    lastEventTime: String = null,
    lastHeartbeatTime: String = null,
    lastStateTime: String = null,
    logLevel: String = null,
    metadata: StringDictionary[String] = null,
    name: String = null,
    numId: String = null,
    state: SchemaDeviceState = null
  ): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (gatewayConfig != null) __obj.updateDynamic("gatewayConfig")(gatewayConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastConfigAckTime != null) __obj.updateDynamic("lastConfigAckTime")(lastConfigAckTime.asInstanceOf[js.Any])
    if (lastConfigSendTime != null) __obj.updateDynamic("lastConfigSendTime")(lastConfigSendTime.asInstanceOf[js.Any])
    if (lastErrorStatus != null) __obj.updateDynamic("lastErrorStatus")(lastErrorStatus.asInstanceOf[js.Any])
    if (lastErrorTime != null) __obj.updateDynamic("lastErrorTime")(lastErrorTime.asInstanceOf[js.Any])
    if (lastEventTime != null) __obj.updateDynamic("lastEventTime")(lastEventTime.asInstanceOf[js.Any])
    if (lastHeartbeatTime != null) __obj.updateDynamic("lastHeartbeatTime")(lastHeartbeatTime.asInstanceOf[js.Any])
    if (lastStateTime != null) __obj.updateDynamic("lastStateTime")(lastStateTime.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numId != null) __obj.updateDynamic("numId")(numId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDevice]
  }
}

