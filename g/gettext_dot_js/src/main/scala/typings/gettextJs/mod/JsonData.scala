package typings.gettextJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonData extends JsonDataMessages {
  @JSName("")
  var _empty: JsonDataHeader
}

object JsonData {
  @scala.inline
  def apply(
    _empty: JsonDataHeader,
    StringDictionary: StringDictionary[String | js.Array[String] | JsonDataHeader] = null
  ): JsonData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JsonData]
  }
}

