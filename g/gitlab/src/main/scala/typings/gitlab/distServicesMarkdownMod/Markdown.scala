package typings.gitlab.distServicesMarkdownMod

import typings.gitlab.Anon_Gfm
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Markdown extends BaseService {
  def render(text: String, options: Anon_Gfm with Sudo): js.Promise[js.Object] = js.native
}

