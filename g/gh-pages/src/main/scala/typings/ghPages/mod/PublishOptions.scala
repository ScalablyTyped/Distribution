package typings.ghPages.mod

import typings.ghPages.AnonEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  var add: js.UndefOr[Boolean] = js.undefined
  var branch: js.UndefOr[String] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var dotfiles: js.UndefOr[Boolean] = js.undefined
  var git: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var only: js.UndefOr[String] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
  var remote: js.UndefOr[String] = js.undefined
  var repo: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String | js.Array[String]] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[Null | AnonEmail] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    branch: String = null,
    dest: String = null,
    dotfiles: js.UndefOr[Boolean] = js.undefined,
    git: String = null,
    message: String = null,
    only: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    remote: String = null,
    repo: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    src: String | js.Array[String] = null,
    tag: String = null,
    user: AnonEmail = null
  ): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (!js.isUndefined(dotfiles)) __obj.updateDynamic("dotfiles")(dotfiles.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishOptions]
  }
}

