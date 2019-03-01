package typings
package envDashToDashObjectLib.envDashToDashObjectMod.envNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericMapping
  extends Mapping
     with /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var keypath: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GenericMapping {
  @scala.inline
  def apply(
    keypath: java.lang.String,
    StringDictionary: /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `type`: java.lang.String = null
  ): GenericMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keypath")(keypath)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GenericMapping]
  }
}

