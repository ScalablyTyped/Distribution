package typings.firebaseDatabase

import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathRepoInfo extends js.Object {
  var path: Path
  var repoInfo: RepoInfo
}

object AnonPathRepoInfo {
  @scala.inline
  def apply(path: Path, repoInfo: RepoInfo): AnonPathRepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPathRepoInfo]
  }
}

