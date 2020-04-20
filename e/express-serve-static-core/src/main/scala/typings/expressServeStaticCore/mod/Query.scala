package typings.expressServeStaticCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query
  extends /* key */ StringDictionary[String | Query | (js.Array[String | Query])]

object Query {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[String | Query | (js.Array[String | Query])] = null): Query = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Query]
  }
}

