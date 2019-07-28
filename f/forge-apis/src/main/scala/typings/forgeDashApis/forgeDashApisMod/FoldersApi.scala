package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "FoldersApi")
@js.native
class FoldersApi () extends js.Object {
  def getFolderContents(projectId: String, folderId: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

