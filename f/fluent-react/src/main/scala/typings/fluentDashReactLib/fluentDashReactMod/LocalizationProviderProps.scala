package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProviderProps extends js.Object {
  var bundles: stdLib.IterableIterator[fluentLib.fluentMod.FluentBundle]
  var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
}

object LocalizationProviderProps {
  @scala.inline
  def apply(
    bundles: stdLib.IterableIterator[fluentLib.fluentMod.FluentBundle],
    parseMarkup: MarkupParser = null
  ): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bundles")(bundles)
    if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(parseMarkup)
    __obj.asInstanceOf[LocalizationProviderProps]
  }
}

