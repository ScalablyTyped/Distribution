package typings.firebaseDashAdmin.adminNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object messagingNs {
  /**
    * Interface representing an FCM legacy API data message payload. Data
    * messages let developers send up to 4KB of custom key-value pairs. The
    * keys and values must both be strings. Keys can be any custom string,
    * except for the following reserved strings:
    *
    *   * `"from"`
    *   * Anything starting with `"google."`.
    *
    * See [Build send requests](/docs/cloud-messaging/send-message)
    * for code samples and detailed documentation.
    */
  type DataMessagePayload = StringDictionary[String]
}
