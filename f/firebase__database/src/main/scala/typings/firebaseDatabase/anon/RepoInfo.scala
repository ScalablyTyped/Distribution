package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoInfo extends js.Object {
  var path: typings.firebaseDatabase.pathMod.Path
  var repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo
}

object RepoInfo {
  @scala.inline
  def apply(
    path: typings.firebaseDatabase.pathMod.Path,
    repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo
  ): RepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoInfo]
  }
}

