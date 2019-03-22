package typings
package gitlabLib.distLatestServicesEpicIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicIssues
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId
  ): js.Promise[_] = js.native
  def assign(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId,
    issueId: IssueId
  ): js.Promise[_] = js.native
  def edit(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId,
    issueId: IssueId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId,
    issueId: IssueId
  ): js.Promise[_] = js.native
}

