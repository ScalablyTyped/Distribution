package typings
package gitlabLib.distTemplatesResourceAccessRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAccessRequests
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def approve(
    resourceId: gitlabLib.ResourceId,
    userId: gitlabLib.UserId,
    hasAccessLevel: gitlabLib.Anon_AccessLevel with gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def deny(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId): js.Promise[js.Object] = js.native
  def request(resourceId: gitlabLib.ResourceId): js.Promise[js.Object] = js.native
}

