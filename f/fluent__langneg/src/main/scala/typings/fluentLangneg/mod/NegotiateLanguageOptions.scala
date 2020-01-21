package typings.fluentLangneg.mod

import typings.fluentLangneg.fluentLangnegStrings.filtering
import typings.fluentLangneg.fluentLangnegStrings.lookup
import typings.fluentLangneg.fluentLangnegStrings.matching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegotiateLanguageOptions extends js.Object {
  var defaultLocale: js.UndefOr[String] = js.undefined
  var likelySubtags: js.UndefOr[StringMap] = js.undefined
  var strategy: js.UndefOr[filtering | matching | lookup] = js.undefined
}

object NegotiateLanguageOptions {
  @scala.inline
  def apply(
    defaultLocale: String = null,
    likelySubtags: StringMap = null,
    strategy: filtering | matching | lookup = null
  ): NegotiateLanguageOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (likelySubtags != null) __obj.updateDynamic("likelySubtags")(likelySubtags.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegotiateLanguageOptions]
  }
}

