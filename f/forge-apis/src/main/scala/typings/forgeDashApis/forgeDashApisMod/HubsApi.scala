package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "HubsApi")
@js.native
class HubsApi () extends js.Object {
  def getHub(hubId: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getHubProjects(hubId: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getHubs(opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

