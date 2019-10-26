package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "EnginesApi")
@js.native
class EnginesApi () extends js.Object {
  /**
    * Returns the details of all available AutoCAD core engines.
    */
  def getAllEngines(oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Returns the details of a specific AutoCAD core engine.
    */
  def getEngine(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

