package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebmasters.anon.Alt
import typings.gapiClientWebmasters.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(request: Alt): Request[Unit]
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(request: Alt): Request[Unit]
  /** Retrieves information about specific site. */
  def get(request: Alt): Request[WmxSite]
  /** Lists the user's Search Console sites. */
  def list(request: Key): Request[SitesListResponse]
}

object SitesResource {
  @scala.inline
  def apply(
    add: Alt => Request[Unit],
    delete: Alt => Request[Unit],
    get: Alt => Request[WmxSite],
    list: Key => Request[SitesListResponse]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SitesResource]
  }
}

