package typings
package fluentDashLangnegLib.fluentDashLangnegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageNegotiationOptions extends js.Object {
  var defaultLocale: js.UndefOr[java.lang.String] = js.undefined
  var strategy: js.UndefOr[
    fluentDashLangnegLib.fluentDashLangnegLibStrings.filtering | fluentDashLangnegLib.fluentDashLangnegLibStrings.matching | fluentDashLangnegLib.fluentDashLangnegLibStrings.lookup
  ] = js.undefined
}

object LanguageNegotiationOptions {
  @scala.inline
  def apply(
    defaultLocale: java.lang.String = null,
    strategy: fluentDashLangnegLib.fluentDashLangnegLibStrings.filtering | fluentDashLangnegLib.fluentDashLangnegLibStrings.matching | fluentDashLangnegLib.fluentDashLangnegLibStrings.lookup = null
  ): LanguageNegotiationOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageNegotiationOptions]
  }
}

