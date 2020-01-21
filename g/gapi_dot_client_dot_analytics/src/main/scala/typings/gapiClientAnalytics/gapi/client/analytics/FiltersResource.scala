package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFields
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsFilterId
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: AnonAccountIdAltFieldsFilterId): Request_[Filter]
  /** Returns a filters to which the user has access. */
  def get(request: AnonAccountIdAltFieldsFilterId): Request_[Filter]
  /** Create a new filter. */
  def insert(request: AnonAccountIdAltFields): Request_[Filter]
  /** Lists all filters for an account */
  def list(request: AnonAccountIdAltFieldsKey): Request_[Filters]
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsFilterId): Request_[Filter]
  /** Updates an existing filter. */
  def update(request: AnonAccountIdAltFieldsFilterId): Request_[Filter]
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsFilterId => Request_[Filter],
    get: AnonAccountIdAltFieldsFilterId => Request_[Filter],
    insert: AnonAccountIdAltFields => Request_[Filter],
    list: AnonAccountIdAltFieldsKey => Request_[Filters],
    patch: AnonAccountIdAltFieldsFilterId => Request_[Filter],
    update: AnonAccountIdAltFieldsFilterId => Request_[Filter]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FiltersResource]
  }
}

