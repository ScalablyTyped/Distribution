package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main language translation response message.
  */
@js.native
trait Schema$TranslationsListResponse extends js.Object {
  /**
    * Translations contains list of translation results of given text
    */
  var translations: js.UndefOr[js.Array[Schema$TranslationsResource]] = js.native
}

object Schema$TranslationsListResponse {
  @scala.inline
  def apply(translations: js.Array[Schema$TranslationsResource] = null): Schema$TranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TranslationsListResponse]
  }
}

