package typings
package gitlabLib.distServicesFeatureFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlags
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def set(name: java.lang.String): js.Promise[js.Object] = js.native
  def set(name: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
}

