package typings.gitlab.distServicesLintMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lint extends BaseService {
  def lint(content: String): js.Promise[js.Object] = js.native
  def lint(content: String, options: Sudo): js.Promise[js.Object] = js.native
}

