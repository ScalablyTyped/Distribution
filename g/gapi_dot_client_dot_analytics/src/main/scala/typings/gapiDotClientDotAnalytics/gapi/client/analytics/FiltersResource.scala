package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFields
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsFilterId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: Anon_AccountIdAltFieldsFilterId): Request[Filter]
  /** Returns a filters to which the user has access. */
  def get(request: Anon_AccountIdAltFieldsFilterId): Request[Filter]
  /** Create a new filter. */
  def insert(request: Anon_AccountIdAltFields): Request[Filter]
  /** Lists all filters for an account */
  def list(request: Anon_AccountIdAltFieldsKey): Request[Filters]
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsFilterId): Request[Filter]
  /** Updates an existing filter. */
  def update(request: Anon_AccountIdAltFieldsFilterId): Request[Filter]
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsFilterId => Request[Filter],
    get: Anon_AccountIdAltFieldsFilterId => Request[Filter],
    insert: Anon_AccountIdAltFields => Request[Filter],
    list: Anon_AccountIdAltFieldsKey => Request[Filters],
    patch: Anon_AccountIdAltFieldsFilterId => Request[Filter],
    update: Anon_AccountIdAltFieldsFilterId => Request[Filter]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FiltersResource]
  }
}

