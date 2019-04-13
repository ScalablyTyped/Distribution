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
  def apply(
    Empty: JsonDataHeader,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | JsonDataHeader] = null
  ): JsonData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(Empty)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JsonData]
  }
}

