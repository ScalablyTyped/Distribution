package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dst extends js.Object {
  def dst(): scala.Unit
  def src(): scala.Unit
}

object Anon_Dst {
  @scala.inline
  def apply(dst: js.Function0[scala.Unit], src: js.Function0[scala.Unit]): Anon_Dst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dst")(dst)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Anon_Dst]
  }
}

