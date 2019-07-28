package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotWebmasters.Anon_Alt
import typings.gapiDotClientDotWebmasters.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(request: Anon_Alt): Request[Unit]
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Retrieves information about specific site. */
  def get(request: Anon_Alt): Request[WmxSite]
  /** Lists the user's Search Console sites. */
  def list(request: Anon_AltFieldsKey): Request[SitesListResponse]
}

object SitesResource {
  @scala.inline
  def apply(
    add: Anon_Alt => Request[Unit],
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[WmxSite],
    list: Anon_AltFieldsKey => Request[SitesListResponse]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SitesResource]
  }
}

