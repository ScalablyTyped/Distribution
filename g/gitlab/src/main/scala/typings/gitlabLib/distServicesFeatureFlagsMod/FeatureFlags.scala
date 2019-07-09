package typings
package gitlabLib.distServicesFeatureFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlags
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def set(name: java.lang.String): js.Promise[js.Object] = js.native
  def set(name: java.lang.String, options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
}

