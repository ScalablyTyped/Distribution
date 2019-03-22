package typings
package gitlabLib.distLatestServicesProtectedTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectedTags
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def protect(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    tagName: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    tagName: java.lang.String
  ): js.Promise[_] = js.native
  def unprotect(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    tagName: java.lang.String
  ): js.Promise[_] = js.native
}

