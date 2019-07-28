package typings.gitlab.distServicesSearchMod

import typings.gitlab.Anon_GroupIdProjectId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends BaseService {
  def all(
    scope: String,
    search: String,
    hasProjectIdGroupIdOptions: Anon_GroupIdProjectId with BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

