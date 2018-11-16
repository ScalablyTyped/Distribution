package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: gapiDotClientDotStorageLib.Anon_Notification): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** View a notification configuration. */
  def get(request: gapiDotClientDotStorageLib.Anon_Notification): gapiDotClientLib.gapiNs.clientNs.Request[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: gapiDotClientDotStorageLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: gapiDotClientDotStorageLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Notifications]
}

