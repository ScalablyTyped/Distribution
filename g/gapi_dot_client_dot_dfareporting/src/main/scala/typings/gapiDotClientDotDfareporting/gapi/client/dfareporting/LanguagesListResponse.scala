package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#languagesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Language collection. */
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
}

object LanguagesListResponse {
  @scala.inline
  def apply(kind: String = null, languages: js.Array[Language] = null): LanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    __obj.asInstanceOf[LanguagesListResponse]
  }
}

