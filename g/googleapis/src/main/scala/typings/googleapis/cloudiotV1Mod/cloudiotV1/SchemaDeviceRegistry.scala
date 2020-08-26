package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container for a group of devices.
  */
@js.native
trait SchemaDeviceRegistry extends js.Object {
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
  var credentials: js.UndefOr[js.Array[SchemaRegistryCredential]] = js.native
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
  var eventNotificationConfigs: js.UndefOr[js.Array[SchemaEventNotificationConfig]] = js.native
  /**
    * The DeviceService (HTTP) configuration for this device registry.
    */
  var httpConfig: js.UndefOr[SchemaHttpConfig] = js.native
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
  var mqttConfig: js.UndefOr[SchemaMqttConfig] = js.native
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
  var stateNotificationConfig: js.UndefOr[SchemaStateNotificationConfig] = js.native
}

object SchemaDeviceRegistry {
  @scala.inline
  def apply(): SchemaDeviceRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceRegistry]
  }
  @scala.inline
  implicit class SchemaDeviceRegistryOps[Self <: SchemaDeviceRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCredentialsVarargs(value: SchemaRegistryCredential*): Self = this.set("credentials", js.Array(value :_*))
    @scala.inline
    def setCredentials(value: js.Array[SchemaRegistryCredential]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setEventNotificationConfigsVarargs(value: SchemaEventNotificationConfig*): Self = this.set("eventNotificationConfigs", js.Array(value :_*))
    @scala.inline
    def setEventNotificationConfigs(value: js.Array[SchemaEventNotificationConfig]): Self = this.set("eventNotificationConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventNotificationConfigs: Self = this.set("eventNotificationConfigs", js.undefined)
    @scala.inline
    def setHttpConfig(value: SchemaHttpConfig): Self = this.set("httpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpConfig: Self = this.set("httpConfig", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setMqttConfig(value: SchemaMqttConfig): Self = this.set("mqttConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMqttConfig: Self = this.set("mqttConfig", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStateNotificationConfig(value: SchemaStateNotificationConfig): Self = this.set("stateNotificationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateNotificationConfig: Self = this.set("stateNotificationConfig", js.undefined)
  }
  
}

