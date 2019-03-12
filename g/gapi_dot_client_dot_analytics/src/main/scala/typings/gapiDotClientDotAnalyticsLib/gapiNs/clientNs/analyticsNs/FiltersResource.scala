package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  /** Returns a filters to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  /** Create a new filter. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  /** Lists all filters for an account */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Filters]
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  /** Updates an existing filter. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId => gapiDotClientLib.gapiNs.clientNs.Request[Filter],
    get: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId => gapiDotClientLib.gapiNs.clientNs.Request[Filter],
    insert: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[Filter],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Filters],
    patch: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId => gapiDotClientLib.gapiNs.clientNs.Request[Filter],
    update: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId => gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FiltersResource]
  }
}

