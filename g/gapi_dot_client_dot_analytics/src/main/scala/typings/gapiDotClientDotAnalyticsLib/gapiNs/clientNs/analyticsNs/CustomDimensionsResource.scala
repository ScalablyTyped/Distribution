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

