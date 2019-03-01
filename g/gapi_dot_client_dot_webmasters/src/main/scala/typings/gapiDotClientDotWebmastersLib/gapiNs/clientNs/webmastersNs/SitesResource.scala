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

object SitesResource {
  @scala.inline
  def apply(
    add: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    delete: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[WmxSite]
    ],
    list: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[SitesListResponse]
    ]
  ): SitesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[SitesResource]
  }
}

