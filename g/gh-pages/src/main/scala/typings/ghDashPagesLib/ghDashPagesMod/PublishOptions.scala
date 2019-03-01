package typings
package ghDashPagesLib.ghDashPagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  var add: js.UndefOr[scala.Boolean] = js.undefined
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var dest: js.UndefOr[java.lang.String] = js.undefined
  var dotfiles: js.UndefOr[scala.Boolean] = js.undefined
  var git: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var only: js.UndefOr[java.lang.String] = js.undefined
  var push: js.UndefOr[scala.Boolean] = js.undefined
  var remote: js.UndefOr[java.lang.String] = js.undefined
  var repo: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var src: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[scala.Null | ghDashPagesLib.Anon_Email] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    branch: java.lang.String = null,
    dest: java.lang.String = null,
    dotfiles: js.UndefOr[scala.Boolean] = js.undefined,
    git: java.lang.String = null,
    message: java.lang.String = null,
    only: java.lang.String = null,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    remote: java.lang.String = null,
    repo: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String | js.Array[java.lang.String] = null,
    tag: java.lang.String = null,
    user: ghDashPagesLib.Anon_Email = null
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

