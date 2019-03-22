package typings
package gitlabLib.distEs5ServicesGroupProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupProjects
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def add(
    groupId: GroupProjectId,
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def all(groupId: GroupProjectId, options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
}

