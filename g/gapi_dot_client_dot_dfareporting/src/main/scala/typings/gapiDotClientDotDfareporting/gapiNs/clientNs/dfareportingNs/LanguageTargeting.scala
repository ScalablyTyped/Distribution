package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageTargeting extends js.Object {
  /**
    * Languages that this ad targets. For each language only languageId is required. The other fields are populated automatically when the ad is inserted or
    * updated.
    */
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
}

object LanguageTargeting {
  @scala.inline
  def apply(languages: js.Array[Language] = null): LanguageTargeting = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages)
    __obj.asInstanceOf[LanguageTargeting]
  }
}

