package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListTopicSubscriptionsResponse extends js.Object {
  /**
               * If not empty, indicates that there may be more subscriptions that match
               * the request; this value should be passed in a new
               * `ListTopicSubscriptionsRequest` to get more subscriptions.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The names of the subscriptions that match the request. */
  var subscriptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

