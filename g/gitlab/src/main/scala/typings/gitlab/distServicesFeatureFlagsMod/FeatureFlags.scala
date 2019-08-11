package typings.gitlab.distServicesFeatureFlagsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlags extends BaseService {
  def all(): js.Promise[GetResponse] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def set(name: String): js.Promise[js.Object] = js.native
  def set(name: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
}

