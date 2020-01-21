package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  /** Language ID of this language. This is the ID used for targeting and generating reports. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#language". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Format of language code is an ISO 639 two-letter language code optionally followed by an underscore followed by an ISO 3166 code. Examples are "en" for
    * English or "zh_CN" for Simplified Chinese.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  /** Name of this language. */
  var name: js.UndefOr[String] = js.undefined
}

object Language {
  @scala.inline
  def apply(id: String = null, kind: String = null, languageCode: String = null, name: String = null): Language = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

