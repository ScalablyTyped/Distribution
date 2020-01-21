package typings.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDataHeader extends js.Object {
  var language: String
  var `plural-forms`: String
}

object JsonDataHeader {
  @scala.inline
  def apply(language: String, `plural-forms`: String): JsonDataHeader = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("plural-forms")(`plural-forms`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDataHeader]
  }
}

