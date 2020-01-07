package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container for a group of devices.
  */
@js.native
trait Schema$DeviceRegistry extends js.Object {
  /**
    * The credentials used to verify the device credentials. No more than 10
    * credentials can be bound to a single registry at a time. The verification
    * process occurs at the time of device creation or update. If this field is
    * empty, no verification is performed. Otherwise, the credentials of a
    * newly created device or added credentials of an updated device should be
    * signed with one of these registry credentials.  Note, however, that
    * existing devices will never be affected by modifications to this list of
    * credentials: after a device has been successfully created in a registry,
    * it should be able to connect even if its registry credentials are
    * revoked, deleted, or modified.
    */
  var credentials: js.UndefOr[js.Array[Schema$RegistryCredential]] = js.native
  /**
    * The configuration for notification of telemetry events received from the
    * device. All telemetry events that were successfully published by the
    * device and acknowledged by Cloud IoT Core are guaranteed to be delivered
    * to Cloud Pub/Sub. If multiple configurations match a message, only the
    * first matching configuration is used. If you try to publish a device
    * telemetry event using MQTT without specifying a Cloud Pub/Sub topic for
    * the device&#39;s registry, the connection closes automatically. If you
    * try to do so using an HTTP connection, an error is returned. Up to 10
    * configurations may be provided.
    */
  var eventNotificationConfigs: js.UndefOr[js.Array[Schema$EventNotificationConfig]] = js.native
  /**
    * The DeviceService (HTTP) configuration for this device registry.
    */
  var httpConfig: js.UndefOr[Schema$HttpConfig] = js.native
  /**
    * The identifier of this device registry. For example, `myRegistry`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * **Beta Feature**  The default logging verbosity for activity from devices
    * in this registry. The verbosity level can be overridden by
    * Device.log_level.
    */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * The MQTT configuration for this device registry.
    */
  var mqttConfig: js.UndefOr[Schema$MqttConfig] = js.native
  /**
    * The resource path name. For example,
    * `projects/example-project/locations/us-central1/registries/my-registry`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The configuration for notification of new states received from the
    * device. State updates are guaranteed to be stored in the state history,
    * but notifications to Cloud Pub/Sub are not guaranteed. For example, if
    * permissions are misconfigured or the specified topic doesn&#39;t exist,
    * no notification will be published but the state will still be stored in
    * Cloud IoT Core.
    */
  var stateNotificationConfig: js.UndefOr[Schema$StateNotificationConfig] = js.native
}

object Schema$DeviceRegistry {
  @scala.inline
  def apply(
    credentials: js.Array[Schema$RegistryCredential] = null,
    eventNotificationConfigs: js.Array[Schema$EventNotificationConfig] = null,
    httpConfig: Schema$HttpConfig = null,
    id: String = null,
    logLevel: String = null,
    mqttConfig: Schema$MqttConfig = null,
    name: String = null,
    stateNotificationConfig: Schema$StateNotificationConfig = null
  ): Schema$DeviceRegistry = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (eventNotificationConfigs != null) __obj.updateDynamic("eventNotificationConfigs")(eventNotificationConfigs.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (mqttConfig != null) __obj.updateDynamic("mqttConfig")(mqttConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stateNotificationConfig != null) __obj.updateDynamic("stateNotificationConfig")(stateNotificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceRegistry]
  }
}

