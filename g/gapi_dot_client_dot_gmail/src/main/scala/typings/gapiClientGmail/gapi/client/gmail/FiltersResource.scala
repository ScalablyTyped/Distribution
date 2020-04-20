package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import typings.gapiClientGmail.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: AnonAlt): Request_[Filter]
  /** Deletes a filter. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a filter. */
  def get(request: AnonFields): Request_[Filter]
  /** Lists the message filters of a Gmail user. */
  def list(request: AnonAlt): Request_[ListFiltersResponse]
}

object FiltersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Filter],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Filter],
    list: AnonAlt => Request_[ListFiltersResponse]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FiltersResource]
  }
}

