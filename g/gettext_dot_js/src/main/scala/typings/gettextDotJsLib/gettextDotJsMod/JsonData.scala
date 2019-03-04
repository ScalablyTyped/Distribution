package typings
package gettextDotJsLib.gettextDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonData extends JsonDataMessages {
  var Empty: JsonDataHeader
}

object JsonData {
  @scala.inline
  def apply(Empty: JsonDataHeader): JsonData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(Empty)
    __obj.asInstanceOf[JsonData]
  }
}

