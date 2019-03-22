package typings
package gitlabLib.distEs5ServicesProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projects
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(): js.Promise[_] = js.native
  def all(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def archive(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  /**
    * @see https://docs.gitlab.com/ee/api/projects.html#create-project-for-user
    */
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ): js.Promise[_] = js.native
  def events(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def fork(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def forks(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def languages(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def mirrorPull(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def removeFork(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def search(projectName: java.lang.String): js.Promise[_] = js.native
  def share(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    groupAccess: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupAccess */ js.Any,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def star(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def statuses(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    sha: java.lang.String,
    state: java.lang.String,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def transfer(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    namespace: java.lang.String
  ): js.Promise[_] = js.native
  def unarchive(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def unshare(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any
  ): js.Promise[_] = js.native
  def unstar(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def updatePushRule(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: ProjectOptions
  ): js.Promise[_] = js.native
  def upload(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String
  ): js.Promise[_] = js.native
  def upload(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String,
    hasFileName: gitlabLib.Anon_FileName
  ): js.Promise[_] = js.native
}

