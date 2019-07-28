package typings.gettextDotJs.gettextDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDataHeader extends js.Object {
  var locale: String
  var `plural-forms`: String
}

object JsonDataHeader {
  @scala.inline
  def apply(locale: String, `plural-forms`: String): JsonDataHeader = {
    val __obj = js.Dynamic.literal(locale = locale)
    __obj.updateDynamic("plural-forms")(`plural-forms`)
    __obj.asInstanceOf[JsonDataHeader]
  }
}

