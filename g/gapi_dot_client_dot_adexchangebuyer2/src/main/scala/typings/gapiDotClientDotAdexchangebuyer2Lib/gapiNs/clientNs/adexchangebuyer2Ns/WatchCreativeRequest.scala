package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchCreativeRequest extends js.Object {
  /**
    * The Pub/Sub topic to publish notifications to.
    * This topic must already exist and must give permission to
    * ad-exchange-buyside-reports@google.com to write to the topic.
    * This should be the full resource name in
    * "projects/{project_id}/topics/{topic_id}" format.
    */
  var topic: js.UndefOr[java.lang.String] = js.undefined
}

