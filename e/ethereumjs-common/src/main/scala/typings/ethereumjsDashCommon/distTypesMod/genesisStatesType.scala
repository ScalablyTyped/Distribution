package typings.ethereumjsDashCommon.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait genesisStatesType
  extends /* key */ StringDictionary[js.Object] {
  var names: StringDictionary[String]
}

object genesisStatesType {
  @scala.inline
  def apply(names: StringDictionary[String], StringDictionary: /* key */ StringDictionary[js.Object] = null): genesisStatesType = {
    val __obj = js.Dynamic.literal(names = names)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[genesisStatesType]
  }
}

