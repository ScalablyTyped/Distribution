package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: gapiDotClientDotResellerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ResellernotifyGetwatchdetailsResponse]
  /** Registers a Reseller for receiving notifications. */
  def register(request: gapiDotClientDotResellerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ResellernotifyResource]
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: gapiDotClientDotResellerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ResellernotifyResource]
}

