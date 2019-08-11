package typings.gitlab.distServicesVersionMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends BaseService {
  def show(): js.Promise[GetResponse] = js.native
  def show(options: Sudo): js.Promise[GetResponse] = js.native
}

