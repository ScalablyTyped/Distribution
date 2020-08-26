package typings.ghPages.mod

import typings.ghPages.ghPagesBooleans.`false`
import typings.ghPages.ghPagesBooleans.`true`
import typings.ghPages.ghPagesNumbers.`1`
import typings.ghPages.ghPagesStrings.AsteriskAsteriskSlashAsterisk
import typings.ghPages.ghPagesStrings.Dot
import typings.ghPages.ghPagesStrings.Updates
import typings.ghPages.ghPagesStrings.`gh-pages`
import typings.ghPages.ghPagesStrings.git
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaults_ extends js.Object {
  var add: `false` = js.native
  var branch: `gh-pages` = js.native
  var depth: `1` = js.native
  var dest: Dot = js.native
  var dotfiles: `false` = js.native
  var git: typings.ghPages.ghPagesStrings.git = js.native
  var history: `true` = js.native
  var message: Updates = js.native
  var push: `true` = js.native
  var remote: String = js.native
  var remove: Dot = js.native
  var silent: `false` = js.native
  var src: AsteriskAsteriskSlashAsterisk = js.native
}

object Defaults_ {
  @scala.inline
  def apply(
    add: `false`,
    branch: `gh-pages`,
    depth: `1`,
    dest: Dot,
    dotfiles: `false`,
    git: git,
    history: `true`,
    message: Updates,
    push: `true`,
    remote: String,
    remove: Dot,
    silent: `false`,
    src: AsteriskAsteriskSlashAsterisk
  ): Defaults_ = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], dotfiles = dotfiles.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults_]
  }
  @scala.inline
  implicit class Defaults_Ops[Self <: Defaults_] (val x: Self) extends AnyVal {
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
    def setAdd(value: `false`): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranch(value: `gh-pages`): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: `1`): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDest(value: Dot): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotfiles(value: `false`): Self = this.set("dotfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setGit(value: git): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: `true`): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Updates): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPush(value: `true`): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: Dot): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: `false`): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: AsteriskAsteriskSlashAsterisk): Self = this.set("src", value.asInstanceOf[js.Any])
  }
  
}

