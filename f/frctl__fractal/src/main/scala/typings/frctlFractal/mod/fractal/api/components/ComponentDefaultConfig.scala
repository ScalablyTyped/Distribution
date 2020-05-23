package typings.frctlFractal.mod.fractal.api.components

import typings.frctlFractal.anon.Handle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDefaultConfig extends js.Object {
  var collated: js.UndefOr[Boolean] = js.undefined
  var collator: js.UndefOr[Collator] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var display: js.UndefOr[js.Any] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preview: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ComponentDefaultConfig {
  @scala.inline
  def apply(
    collated: js.UndefOr[Boolean] = js.undefined,
    collator: (/* markup */ String, /* item */ Handle) => String = null,
    context: js.Any = null,
    display: js.Any = null,
    prefix: String = null,
    preview: String = null,
    status: String = null
  ): ComponentDefaultConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collated)) __obj.updateDynamic("collated")(collated.get.asInstanceOf[js.Any])
    if (collator != null) __obj.updateDynamic("collator")(js.Any.fromFunction2(collator))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDefaultConfig]
  }
}

