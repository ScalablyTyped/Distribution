package typings
package gitlabLib.distEs5ServicesEpicIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicIssues
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
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
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId,
    issueId: IssueId
  ): js.Promise[_] = js.native
}

