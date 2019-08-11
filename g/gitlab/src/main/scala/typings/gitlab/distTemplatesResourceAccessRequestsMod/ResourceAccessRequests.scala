package typings.gitlab.distTemplatesResourceAccessRequestsMod

import typings.gitlab.Anon_AccessLevel
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distServicesMod.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAccessRequests extends BaseService {
  def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
  def approve(resourceId: ResourceId, userId: UserId, hasAccessLevel: Anon_AccessLevel with Sudo): js.Promise[js.Object] = js.native
  def deny(resourceId: ResourceId, userId: UserId): js.Promise[js.Object] = js.native
  def request(resourceId: ResourceId): js.Promise[js.Object] = js.native
}

