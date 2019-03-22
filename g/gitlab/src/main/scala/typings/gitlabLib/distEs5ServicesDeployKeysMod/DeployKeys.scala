package typings
package gitlabLib.distEs5ServicesDeployKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployKeys
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def add(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def enable(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any
  ): js.Promise[_] = js.native
}

