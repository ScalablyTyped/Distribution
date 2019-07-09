package typings
package gitlabLib.distServicesSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    scope: java.lang.String,
    search: java.lang.String,
    hasProjectIdGroupIdOptions: gitlabLib.Anon_GroupIdProjectId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

