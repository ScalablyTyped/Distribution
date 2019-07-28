package typings.fluentDashReact.fluentDashReactMod

import typings.fluent.fluentMod.FluentBundle
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProviderProps extends js.Object {
  var bundles: IterableIterator[FluentBundle]
  var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
}

object LocalizationProviderProps {
  @scala.inline
  def apply(bundles: IterableIterator[FluentBundle], parseMarkup: MarkupParser = null): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal(bundles = bundles)
    if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(parseMarkup)
    __obj.asInstanceOf[LocalizationProviderProps]
  }
}

