package typings.gitlab.distServicesApplicationSettingsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettings extends BaseService {
  def all(): js.Promise[GetResponse] = js.native
  def all(options: Sudo): js.Promise[GetResponse] = js.native
  def edit(): js.Promise[js.Object] = js.native
  def edit(options: BaseRequestOptions): js.Promise[js.Object] = js.native
}

