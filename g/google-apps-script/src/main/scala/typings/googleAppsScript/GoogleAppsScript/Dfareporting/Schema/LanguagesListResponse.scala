package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
}

object LanguagesListResponse {
  @scala.inline
  def apply(kind: String = null, languages: js.Array[Language] = null): LanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagesListResponse]
  }
}

