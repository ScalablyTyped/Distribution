package typings
package gitlabLib.distEs5ServicesRepositoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repositories
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def compare(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    from: java.lang.String,
    to: java.lang.String
  ): js.Promise[_] = js.native
  def contributors(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def showArchive(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    hasSha: gitlabLib.Anon_Sha
  ): js.Promise[_] = js.native
  def showBlob(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    sha: java.lang.String
  ): js.Promise[_] = js.native
  def showBlobRaw(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    sha: java.lang.String
  ): js.Promise[_] = js.native
  def tree(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
}

