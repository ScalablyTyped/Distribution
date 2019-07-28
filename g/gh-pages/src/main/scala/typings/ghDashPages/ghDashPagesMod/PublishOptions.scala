package typings.ghDashPages.ghDashPagesMod

import typings.ghDashPages.Anon_Email
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
  var user: js.UndefOr[Null | Anon_Email] = js.undefined
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
    user: Anon_Email = null
  ): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (!js.isUndefined(dotfiles)) __obj.updateDynamic("dotfiles")(dotfiles)
    if (git != null) __obj.updateDynamic("git")(git)
    if (message != null) __obj.updateDynamic("message")(message)
    if (only != null) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    if (repo != null) __obj.updateDynamic("repo")(repo)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[PublishOptions]
  }
}

