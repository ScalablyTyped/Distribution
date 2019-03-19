package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var e: js.UndefOr[stdLib.Event] = js.undefined
  var `object`: js.UndefOr[fabricLib.fabricDashImplMod.Object] = js.undefined
}

object Anon_E {
  @scala.inline
  def apply(e: stdLib.Event = null, `object`: fabricLib.fabricDashImplMod.Object = null): Anon_E = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_E]
  }
}

