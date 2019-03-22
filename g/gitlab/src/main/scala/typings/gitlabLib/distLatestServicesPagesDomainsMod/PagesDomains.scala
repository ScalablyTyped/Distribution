package typings
package gitlabLib.distLatestServicesPagesDomainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesDomains
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(): js.Promise[_] = js.native
  def all(hasProjectId: PagesDomainsOptions): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    domain: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    domain: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    domain: java.lang.String
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    domain: java.lang.String
  ): js.Promise[_] = js.native
}

