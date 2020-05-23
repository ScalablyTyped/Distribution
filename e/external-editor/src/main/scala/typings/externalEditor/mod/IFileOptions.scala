package typings.externalEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    dir: String = null,
    mode: js.UndefOr[Double] = js.undefined,
    postfix: String = null,
    prefix: String = null,
    template: String = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

