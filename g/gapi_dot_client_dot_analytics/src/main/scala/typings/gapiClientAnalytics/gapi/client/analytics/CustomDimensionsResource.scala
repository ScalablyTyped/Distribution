package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.CustomDimensionId
import typings.gapiClientAnalytics.anon.IgnoreCustomDataSourceLinks
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: CustomDimensionId): Request[CustomDimension] = js.native
  /** Create a new custom dimension. */
  def insert(request: QuotaUser): Request[CustomDimension] = js.native
  /** Lists custom dimensions to which the user has access. */
  def list(request: PrettyPrint): Request[CustomDimensions] = js.native
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: IgnoreCustomDataSourceLinks): Request[CustomDimension] = js.native
  /** Updates an existing custom dimension. */
  def update(request: IgnoreCustomDataSourceLinks): Request[CustomDimension] = js.native
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
  @scala.inline
  implicit class CustomDimensionsResourceOps[Self <: CustomDimensionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: CustomDimensionId => Request[CustomDimension]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[CustomDimension]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PrettyPrint => Request[CustomDimensions]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: IgnoreCustomDataSourceLinks => Request[CustomDimension]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: IgnoreCustomDataSourceLinks => Request[CustomDimension]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

