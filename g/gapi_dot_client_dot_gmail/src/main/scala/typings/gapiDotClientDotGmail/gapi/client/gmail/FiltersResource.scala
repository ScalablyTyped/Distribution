package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import typings.gapiDotClientDotGmail.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: Anon_Alt): Request[Filter]
  /** Deletes a filter. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a filter. */
  def get(request: Anon_AltFields): Request[Filter]
  /** Lists the message filters of a Gmail user. */
  def list(request: Anon_Alt): Request[ListFiltersResponse]
}

object FiltersResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Filter],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Filter],
    list: Anon_Alt => Request[ListFiltersResponse]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FiltersResource]
  }
}

