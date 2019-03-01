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
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filters]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsFilterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[FiltersResource]
  }
}

