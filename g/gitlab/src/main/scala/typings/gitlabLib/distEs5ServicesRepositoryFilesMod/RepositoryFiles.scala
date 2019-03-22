package typings
package gitlabLib.distEs5ServicesRepositoryFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryFiles
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String,
    branch: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String,
    branch: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String,
    branch: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String,
    ref: java.lang.String
  ): js.Promise[_] = js.native
  def showRaw(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    filePath: java.lang.String,
    ref: java.lang.String
  ): js.Promise[_] = js.native
}

