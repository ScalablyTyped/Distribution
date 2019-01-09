package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(request: gapiDotClientDotWebmastersLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(request: gapiDotClientDotWebmastersLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves information about specific site. */
  def get(request: gapiDotClientDotWebmastersLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[WmxSite]
  /** Lists the user's Search Console sites. */
  def list(request: gapiDotClientDotWebmastersLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SitesListResponse]
}

