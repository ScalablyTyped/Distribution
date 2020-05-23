package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.FilterId
import typings.gapiClientAnalytics.anon.Maxresults
import typings.gapiClientAnalytics.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: FilterId): Request[Filter]
  /** Returns a filters to which the user has access. */
  def get(request: FilterId): Request[Filter]
  /** Create a new filter. */
  def insert(request: Oauthtoken): Request[Filter]
  /** Lists all filters for an account */
  def list(request: Maxresults): Request[Filters]
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: FilterId): Request[Filter]
  /** Updates an existing filter. */
  def update(request: FilterId): Request[Filter]
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: FilterId => Request[Filter],
    get: FilterId => Request[Filter],
    insert: Oauthtoken => Request[Filter],
    list: Maxresults => Request[Filters],
    patch: FilterId => Request[Filter],
    update: FilterId => Request[Filter]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FiltersResource]
  }
}

