package typings
package gitlabLib.distTemplatesResourceTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTemplates
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.distServicesMod.ResourceId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
}

