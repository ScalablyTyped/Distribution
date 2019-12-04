package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathRepoInfo extends js.Object {
  var path: Path
  var repoInfo: RepoInfo
}

object Anon_PathRepoInfo {
  @scala.inline
  def apply(path: Path, repoInfo: RepoInfo): Anon_PathRepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PathRepoInfo]
  }
}

