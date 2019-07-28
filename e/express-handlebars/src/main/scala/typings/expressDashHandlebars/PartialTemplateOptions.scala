package typings.expressDashHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialTemplateOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var precompiled: js.UndefOr[Boolean] = js.undefined
}

object PartialTemplateOptions {
  @scala.inline
  def apply(cache: js.UndefOr[Boolean] = js.undefined, precompiled: js.UndefOr[Boolean] = js.undefined): PartialTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(precompiled)) __obj.updateDynamic("precompiled")(precompiled)
    __obj.asInstanceOf[PartialTemplateOptions]
  }
}

