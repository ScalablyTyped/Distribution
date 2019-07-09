package typings
package ethereumjsDashCommonLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait genesisStatesType
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Object] {
  var names: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object genesisStatesType {
  @scala.inline
  def apply(
    names: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Object] = null
  ): genesisStatesType = {
    val __obj = js.Dynamic.literal(names = names)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[genesisStatesType]
  }
}

