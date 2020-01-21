package typings.envToObject.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericMapping
  extends /* opt */ StringDictionary[js.Any]
     with Mapping {
  var keypath: String
  var `type`: js.UndefOr[String] = js.undefined
}

object GenericMapping {
  @scala.inline
  def apply(
    keypath: String,
    StringDictionary: /* opt */ StringDictionary[js.Any] = null,
    `type`: String = null
  ): GenericMapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericMapping]
  }
}

