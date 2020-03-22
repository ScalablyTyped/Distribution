package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonFilterId
import typings.gapiClientAnalytics.AnonMaxresults
import typings.gapiClientAnalytics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: AnonFilterId): Request_[Filter]
  /** Returns a filters to which the user has access. */
  def get(request: AnonFilterId): Request_[Filter]
  /** Create a new filter. */
  def insert(request: AnonOauthtoken): Request_[Filter]
  /** Lists all filters for an account */
  def list(request: AnonMaxresults): Request_[Filters]
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: AnonFilterId): Request_[Filter]
  /** Updates an existing filter. */
  def update(request: AnonFilterId): Request_[Filter]
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: AnonFilterId => Request_[Filter],
    get: AnonFilterId => Request_[Filter],
    insert: AnonOauthtoken => Request_[Filter],
    list: AnonMaxresults => Request_[Filters],
    patch: AnonFilterId => Request_[Filter],
    update: AnonFilterId => Request_[Filter]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FiltersResource]
  }
}

