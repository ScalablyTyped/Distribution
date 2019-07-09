package typings
package ethereumjsDashCommonLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chainsType
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var names: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object chainsType {
  @scala.inline
  def apply(
    names: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): chainsType = {
    val __obj = js.Dynamic.literal(names = names)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[chainsType]
  }
}

