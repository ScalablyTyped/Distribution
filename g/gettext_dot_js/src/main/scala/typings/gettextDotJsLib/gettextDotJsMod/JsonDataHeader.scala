package typings
package gettextDotJsLib.gettextDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDataHeader extends js.Object {
  var locale: java.lang.String
  var `plural-forms`: java.lang.String
}

object JsonDataHeader {
  @scala.inline
  def apply(locale: java.lang.String, `plural-forms`: java.lang.String): JsonDataHeader = {
    val __obj = js.Dynamic.literal(`plural-forms` = `plural-forms`)
    __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[JsonDataHeader]
  }
}

