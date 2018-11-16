package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: gapiDotClientDotDiscoveryLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[RestDescription]
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: gapiDotClientDotDiscoveryLib.Anon_NamePreferred): gapiDotClientLib.gapiNs.clientNs.Request[DirectoryList]
}

