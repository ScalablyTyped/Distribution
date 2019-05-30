package typings
package gitlabLib.distServicesLintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lint
  extends gitlabLib.distInfrastructureMod.BaseService {
  def lint(content: java.lang.String): js.Promise[js.Object] = js.native
  def lint(content: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

