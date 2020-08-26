package typings.ghPages.mod

import typings.ghPages.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishOptions extends js.Object {
  var add: js.UndefOr[Boolean] = js.native
  var branch: js.UndefOr[String] = js.native
  var dest: js.UndefOr[String] = js.native
  var dotfiles: js.UndefOr[Boolean] = js.native
  var git: js.UndefOr[String] = js.native
  /**
    * Push force new commit without parent history
    * @default true
    */
  var history: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[String] = js.native
  var only: js.UndefOr[String] = js.native
  var push: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
  /**
    * Removes files that match the given pattern (Ignored if used together with --add).
    * By default, gh-pages removes everything inside the target branch auto-generated directory before copying the new files from dir.
    * @default '.'
    */
  var remove: js.UndefOr[String] = js.native
  var repo: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var src: js.UndefOr[String | js.Array[String]] = js.native
  var tag: js.UndefOr[String] = js.native
  var user: js.UndefOr[Null | Email] = js.native
}

object PublishOptions {
  @scala.inline
  def apply(): PublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishOptions]
  }
  @scala.inline
  implicit class PublishOptionsOps[Self <: PublishOptions] (val x: Self) extends AnyVal {
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
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setDotfiles(value: Boolean): Self = this.set("dotfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotfiles: Self = this.set("dotfiles", js.undefined)
    @scala.inline
    def setGit(value: String): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnly(value: String): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setUser(value: Email): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
  
}

