package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "FoldersApi")
@js.native
class FoldersApi () extends js.Object {
  def getFolderContents(projectId: java.lang.String, folderId: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

