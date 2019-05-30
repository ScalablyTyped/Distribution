package typings
package gitlabLib.distTemplatesResourceTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTemplates
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def show(resourceId: gitlabLib.ResourceId): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

