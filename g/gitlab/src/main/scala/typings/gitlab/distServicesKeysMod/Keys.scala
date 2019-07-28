package typings.gitlab.distServicesKeysMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.KeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys extends BaseService {
  def show(keyId: KeyId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(keyId: KeyId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

