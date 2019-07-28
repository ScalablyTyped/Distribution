package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomDimensionId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomDimensionIdFields
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresults
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: Anon_AccountIdAltCustomDimensionId): Request[CustomDimension]
  /** Create a new custom dimension. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[CustomDimension]
  /** Lists custom dimensions to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresults): Request[CustomDimensions]
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltCustomDimensionIdFields): Request[CustomDimension]
  /** Updates an existing custom dimension. */
  def update(request: Anon_AccountIdAltCustomDimensionIdFields): Request[CustomDimension]
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAltCustomDimensionId => Request[CustomDimension],
    insert: Anon_AccountIdAltFieldsKeyOauthtoken => Request[CustomDimension],
    list: Anon_AccountIdAltFieldsKeyMaxresults => Request[CustomDimensions],
    patch: Anon_AccountIdAltCustomDimensionIdFields => Request[CustomDimension],
    update: Anon_AccountIdAltCustomDimensionIdFields => Request[CustomDimension]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomDimensionsResource]
  }
}

