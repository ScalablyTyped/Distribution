package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: gapiDotClientDotDiscoveryLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[RestDescription]
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: gapiDotClientDotDiscoveryLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DirectoryList]
}

object ApisResource {
  @scala.inline
  def apply(
    getRest: js.Function1[
      gapiDotClientDotDiscoveryLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[RestDescription]
    ],
    list: js.Function1[
      gapiDotClientDotDiscoveryLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DirectoryList]
    ]
  ): ApisResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRest")(getRest)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ApisResource]
  }
}

