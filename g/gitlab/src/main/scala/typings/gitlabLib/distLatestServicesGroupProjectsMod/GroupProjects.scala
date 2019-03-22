package typings
package gitlabLib.distLatestServicesGroupProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupProjects
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def add(
    groupId: GroupProjectId,
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def all(
    groupId: GroupProjectId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
}

