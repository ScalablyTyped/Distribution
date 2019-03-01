package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDimensionId): gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
  /** Create a new custom dimension. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
  /** Lists custom dimensions to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[CustomDimensions]
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDimensionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
  /** Updates an existing custom dimension. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDimensionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDimensionId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomDimensions]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDimensionIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomDimensionIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomDimension]
    ]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CustomDimensionsResource]
  }
}

