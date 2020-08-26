package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepoInfo extends js.Object {
  var path: typings.firebaseDatabase.pathMod.Path = js.native
  var repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo = js.native
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
  @scala.inline
  implicit class RepoInfoOps[Self <: RepoInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: typings.firebaseDatabase.pathMod.Path): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepoInfo(value: typings.firebaseDatabase.repoInfoMod.RepoInfo): Self = this.set("repoInfo", value.asInstanceOf[js.Any])
  }
  
}

