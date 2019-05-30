package typings
package gitlabLib.distServicesNamespacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespaces
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def show(namespaceId: gitlabLib.NamespaceId, options: gitlabLib.Anon_Search with gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

