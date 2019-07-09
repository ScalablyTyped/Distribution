package typings
package gitlabLib.distTemplatesResourceAccessRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAccessRequests
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def approve(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    hasAccessLevel: gitlabLib.Anon_AccessLevel with gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def deny(resourceId: gitlabLib.distServicesMod.ResourceId, userId: gitlabLib.distServicesMod.UserId): js.Promise[js.Object] = js.native
  def request(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[js.Object] = js.native
}

