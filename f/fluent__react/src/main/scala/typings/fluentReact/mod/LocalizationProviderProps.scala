package typings.fluentReact.mod

import typings.fluentBundle.mod.FluentBundle
import typings.std.Iterable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProviderProps extends js.Object {
  var bundles: Iterable[FluentBundle]
  var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
}

object LocalizationProviderProps {
  @scala.inline
  def apply(bundles: Iterable[FluentBundle], parseMarkup: /* str */ String => js.Array[Node] = null): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1(parseMarkup))
    __obj.asInstanceOf[LocalizationProviderProps]
  }
}

