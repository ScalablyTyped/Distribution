package typings.ethereumjsDashCommon.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chainsType
  extends /* key */ StringDictionary[js.Any] {
  var names: StringDictionary[String]
}

object chainsType {
  @scala.inline
  def apply(names: StringDictionary[String], StringDictionary: /* key */ StringDictionary[js.Any] = null): chainsType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[chainsType]
  }
}

