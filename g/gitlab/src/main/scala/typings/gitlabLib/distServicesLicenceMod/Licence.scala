package typings
package gitlabLib.distServicesLicenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Licence
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

