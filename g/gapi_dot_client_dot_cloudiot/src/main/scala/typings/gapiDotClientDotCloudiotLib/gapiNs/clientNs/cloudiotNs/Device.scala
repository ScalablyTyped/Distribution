package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * If a device is blocked, connections or requests from this device will fail.
    * Can be used to temporarily prevent the device from connecting if, for
    * example, the sensor is generating bad data and needs maintenance.
    */
  var blocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The most recent device configuration, which is eventually sent from
    * Cloud IoT Core to the device. If not present on creation, the
    * configuration will be initialized with an empty payload and version value
    * of `1`. To update this field after creation, use the
    * `DeviceManager.ModifyCloudToDeviceConfig` method.
    */
  var config: js.UndefOr[DeviceConfig] = js.undefined
  /**
    * The credentials used to authenticate this device. To allow credential
    * rotation without interruption, multiple device credentials can be bound to
    * this device. No more than 3 credentials can be bound to a single device at
    * a time. When new credentials are added to a device, they are verified
    * against the registry credentials. For details, see the description of the
    * `DeviceRegistry.credentials` field.
    */
  var credentials: js.UndefOr[js.Array[DeviceCredential]] = js.undefined
  /**
    * The user-defined device identifier. The device ID must be unique
    * within a device registry.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The last time a cloud-to-device config version acknowledgment
    * was received from the device. This field is only for configurations
    * sent through MQTT.
    */
  var lastConfigAckTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The last time a cloud-to-device config version was sent to
    * the device.
    */
  var lastConfigSendTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The error message of the most recent error, such as a failure
    * to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this
    * field. If no errors have occurred, this field has an empty message
    * and the status code 0 == OK. Otherwise, this field is expected to have a
    * status code other than OK.
    */
  var lastErrorStatus: js.UndefOr[Status] = js.undefined
  /**
    * [Output only] The time the most recent error occurred, such as a failure to
    * publish to Cloud Pub/Sub. This field is the timestamp of
    * 'last_error_status'.
    */
  var lastErrorTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The last time a telemetry event was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes.
    */
  var lastEventTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The last time a heartbeat was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes. This field is only for devices connecting through MQTT.
    */
  var lastHeartbeatTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The last time a state event was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes.
    */
  var lastStateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The metadata key-value pairs assigned to the device. This metadata is not
    * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
    * information for the device.
    *
    * Keys must conform to the regular expression [a-zA-Z0-9-_]+ and be less than
    * 128 bytes in length.
    *
    * Values are free-form strings. Each value must be less than or equal to 32
    * KB in size.
    *
    * The total size of all keys and values must be less than 256 KB, and the
    * maximum number of key-value pairs is 500.
    */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The resource path name. For example,
    * `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
    * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`.
    * When `name` is populated as a response from the service, it always ends
    * in the device numeric ID.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] A server-defined unique numeric ID for the device. This is a
    * more compact way to identify devices, and it is globally unique.
    */
  var numId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The state most recently received from the device. If no state
    * has been reported, this field is not present.
    */
  var state: js.UndefOr[DeviceState] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    blocked: js.UndefOr[scala.Boolean] = js.undefined,
    config: DeviceConfig = null,
    credentials: js.Array[DeviceCredential] = null,
    id: java.lang.String = null,
    lastConfigAckTime: java.lang.String = null,
    lastConfigSendTime: java.lang.String = null,
    lastErrorStatus: Status = null,
    lastErrorTime: java.lang.String = null,
    lastEventTime: java.lang.String = null,
    lastHeartbeatTime: java.lang.String = null,
    lastStateTime: java.lang.String = null,
    metadata: stdLib.Record[java.lang.String, java.lang.String] = null,
    name: java.lang.String = null,
    numId: java.lang.String = null,
    state: DeviceState = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked)
    if (config != null) __obj.updateDynamic("config")(config)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastConfigAckTime != null) __obj.updateDynamic("lastConfigAckTime")(lastConfigAckTime)
    if (lastConfigSendTime != null) __obj.updateDynamic("lastConfigSendTime")(lastConfigSendTime)
    if (lastErrorStatus != null) __obj.updateDynamic("lastErrorStatus")(lastErrorStatus)
    if (lastErrorTime != null) __obj.updateDynamic("lastErrorTime")(lastErrorTime)
    if (lastEventTime != null) __obj.updateDynamic("lastEventTime")(lastEventTime)
    if (lastHeartbeatTime != null) __obj.updateDynamic("lastHeartbeatTime")(lastHeartbeatTime)
    if (lastStateTime != null) __obj.updateDynamic("lastStateTime")(lastStateTime)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numId != null) __obj.updateDynamic("numId")(numId)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Device]
  }
}

