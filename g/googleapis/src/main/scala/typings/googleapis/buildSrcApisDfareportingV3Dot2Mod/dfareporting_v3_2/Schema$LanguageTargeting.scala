package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Language Targeting.
  */
@js.native
trait Schema$LanguageTargeting extends js.Object {
  /**
    * Languages that this ad targets. For each language only languageId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var languages: js.UndefOr[js.Array[Schema$Language]] = js.native
}

object Schema$LanguageTargeting {
  @scala.inline
  def apply(languages: js.Array[Schema$Language] = null): Schema$LanguageTargeting = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LanguageTargeting]
  }
}

