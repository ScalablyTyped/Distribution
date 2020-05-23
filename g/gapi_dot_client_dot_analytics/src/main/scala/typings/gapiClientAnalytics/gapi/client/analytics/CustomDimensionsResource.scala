package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.CustomDimensionId
import typings.gapiClientAnalytics.anon.IgnoreCustomDataSourceLinks
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: CustomDimensionId): Request[CustomDimension]
  /** Create a new custom dimension. */
  def insert(request: QuotaUser): Request[CustomDimension]
  /** Lists custom dimensions to which the user has access. */
  def list(request: PrettyPrint): Request[CustomDimensions]
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: IgnoreCustomDataSourceLinks): Request[CustomDimension]
  /** Updates an existing custom dimension. */
  def update(request: IgnoreCustomDataSourceLinks): Request[CustomDimension]
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: CustomDimensionId => Request[CustomDimension],
    insert: QuotaUser => Request[CustomDimension],
    list: PrettyPrint => Request[CustomDimensions],
    patch: IgnoreCustomDataSourceLinks => Request[CustomDimension],
    update: IgnoreCustomDataSourceLinks => Request[CustomDimension]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomDimensionsResource]
  }
}

