package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeviceRegistry extends js.Object {
  /**
               * The credentials used to verify the device credentials. No more than 10
               * credentials can be bound to a single registry at a time. The verification
               * process occurs at the time of device creation or update. If this field is
               * empty, no verification is performed. Otherwise, the credentials of a newly
               * created device or added credentials of an updated device should be signed
               * with one of these registry credentials.
               *
               * Note, however, that existing devices will never be affected by
               * modifications to this list of credentials: after a device has been
               * successfully created in a registry, it should be able to connect even if
               * its registry credentials are revoked, deleted, or modified.
               */
  var credentials: js.UndefOr[js.Array[RegistryCredential]] = js.undefined
  /**
               * The configuration for notification of telemetry events received from the
               * device. All telemetry events that were successfully published by the
               * device and acknowledged by Cloud IoT Core are guaranteed to be
               * delivered to Cloud Pub/Sub. Only the first configuration is used.
               */
  var eventNotificationConfigs: js.UndefOr[js.Array[EventNotificationConfig]] = js.undefined
  /** The DeviceService (HTTP) configuration for this device registry. */
  var httpConfig: js.UndefOr[HttpConfig] = js.undefined
  /** The identifier of this device registry. For example, `myRegistry`. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The MQTT configuration for this device registry. */
  var mqttConfig: js.UndefOr[MqttConfig] = js.undefined
  /**
               * The resource path name. For example,
               * `projects/example-project/locations/us-central1/registries/my-registry`.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The configuration for notification of new states received from the device.
               * State updates are guaranteed to be stored in the state history, but
               * notifications to Cloud Pub/Sub are not guaranteed. For example, if
               * permissions are misconfigured or the specified topic doesn't exist, no
               * notification will be published but the state will still be stored in Cloud
               * IoT Core.
               */
  var stateNotificationConfig: js.UndefOr[StateNotificationConfig] = js.undefined
}

