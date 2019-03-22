package typings
package gitlabLib.distLatestServicesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://docs.gitlab.com/ee/api/services.html
  */
@js.native
trait Services
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    serviceName: ServiceName,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    serviceName: ServiceName
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    serviceName: ServiceName
  ): js.Promise[_] = js.native
}

