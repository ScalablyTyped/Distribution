package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltCustomDimensionId
import typings.gapiClientAnalytics.AnonAccountIdAltCustomDimensionIdFields
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresults
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: AnonAccountIdAltCustomDimensionId): Request_[CustomDimension]
  /** Create a new custom dimension. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[CustomDimension]
  /** Lists custom dimensions to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresults): Request_[CustomDimensions]
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltCustomDimensionIdFields): Request_[CustomDimension]
  /** Updates an existing custom dimension. */
  def update(request: AnonAccountIdAltCustomDimensionIdFields): Request_[CustomDimension]
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: AnonAccountIdAltCustomDimensionId => Request_[CustomDimension],
    insert: AnonAccountIdAltFieldsKeyOauthtoken => Request_[CustomDimension],
    list: AnonAccountIdAltFieldsKeyMaxresults => Request_[CustomDimensions],
    patch: AnonAccountIdAltCustomDimensionIdFields => Request_[CustomDimension],
    update: AnonAccountIdAltCustomDimensionIdFields => Request_[CustomDimension]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomDimensionsResource]
  }
}

