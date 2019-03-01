package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlBrTlTr extends js.Object {
  var bl: fabricLib.fabricDashImplMod.Point
  var br: fabricLib.fabricDashImplMod.Point
  var tl: fabricLib.fabricDashImplMod.Point
  var tr: fabricLib.fabricDashImplMod.Point
}

object Anon_BlBrTlTr {
  @scala.inline
  def apply(
    bl: fabricLib.fabricDashImplMod.Point,
    br: fabricLib.fabricDashImplMod.Point,
    tl: fabricLib.fabricDashImplMod.Point,
    tr: fabricLib.fabricDashImplMod.Point
  ): Anon_BlBrTlTr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bl")(bl)
    __obj.updateDynamic("br")(br)
    __obj.updateDynamic("tl")(tl)
    __obj.updateDynamic("tr")(tr)
    __obj.asInstanceOf[Anon_BlBrTlTr]
  }
}

