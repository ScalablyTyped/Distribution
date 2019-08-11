package typings.gitlab.distServicesKeysMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.KeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys extends BaseService {
  def show(keyId: KeyId): js.Promise[GetResponse] = js.native
  def show(keyId: KeyId, options: Sudo): js.Promise[GetResponse] = js.native
}

