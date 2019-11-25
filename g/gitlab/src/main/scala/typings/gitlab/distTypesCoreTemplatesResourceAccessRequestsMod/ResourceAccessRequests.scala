package typings.gitlab.distTypesCoreTemplatesResourceAccessRequestsMod

import typings.gitlab.Anon_AccessLevel
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceAccessRequests", "ResourceAccessRequests")
@js.native
class ResourceAccessRequests protected () extends BaseService {
  def this(resourceType: String, options: BaseServiceOptions) = this()
  def all(resourceId: String): js.Promise[GetResponse] = js.native
  def all(resourceId: Double): js.Promise[GetResponse] = js.native
  def approve(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
  def approve(resourceId: String, userId: Double, hasAccessLevel: Anon_AccessLevel with Sudo): js.Promise[js.Object] = js.native
  def approve(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
  def approve(resourceId: Double, userId: Double, hasAccessLevel: Anon_AccessLevel with Sudo): js.Promise[js.Object] = js.native
  def deny(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
  def deny(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
  def request(resourceId: String): js.Promise[js.Object] = js.native
  def request(resourceId: Double): js.Promise[js.Object] = js.native
}

