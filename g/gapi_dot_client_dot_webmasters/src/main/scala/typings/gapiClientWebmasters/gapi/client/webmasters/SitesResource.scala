package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientWebmasters.AnonAlt
import typings.gapiClientWebmasters.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(request: AnonAlt): Request_[Unit]
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Retrieves information about specific site. */
  def get(request: AnonAlt): Request_[WmxSite]
  /** Lists the user's Search Console sites. */
  def list(request: AnonKey): Request_[SitesListResponse]
}

object SitesResource {
  @scala.inline
  def apply(
    add: AnonAlt => Request_[Unit],
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[WmxSite],
    list: AnonKey => Request_[SitesListResponse]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SitesResource]
  }
}

