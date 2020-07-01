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

trait Defaults_ extends js.Object {
  var add: `false`
  var branch: `gh-pages`
  var depth: `1`
  var dest: Dot
  var dotfiles: `false`
  var git: typings.ghPages.ghPagesStrings.git
  var history: `true`
  var message: Updates
  var push: `true`
  var remote: String
  var remove: Dot
  var silent: `false`
  var src: AsteriskAsteriskSlashAsterisk
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
}

