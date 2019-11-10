package typings.fridaDashGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyData extends InstanceData {
  /**
    * This proxy's target object.
    */
  var target: Object
}

object ProxyData {
  @scala.inline
  def apply(target: Object, StringDictionary: StringDictionary[js.Any] = null): ProxyData = {
    val __obj = js.Dynamic.literal(target = target)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ProxyData]
  }
}

