package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonCustomDimensionId
import typings.gapiClientAnalytics.AnonIgnoreCustomDataSourceLinks
import typings.gapiClientAnalytics.AnonPrettyPrint
import typings.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: AnonCustomDimensionId): Request_[CustomDimension]
  /** Create a new custom dimension. */
  def insert(request: AnonQuotaUser): Request_[CustomDimension]
  /** Lists custom dimensions to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomDimensions]
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: AnonIgnoreCustomDataSourceLinks): Request_[CustomDimension]
  /** Updates an existing custom dimension. */
  def update(request: AnonIgnoreCustomDataSourceLinks): Request_[CustomDimension]
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: AnonCustomDimensionId => Request_[CustomDimension],
    insert: AnonQuotaUser => Request_[CustomDimension],
    list: AnonPrettyPrint => Request_[CustomDimensions],
    patch: AnonIgnoreCustomDataSourceLinks => Request_[CustomDimension],
    update: AnonIgnoreCustomDataSourceLinks => Request_[CustomDimension]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomDimensionsResource]
  }
}

