package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlBrTl extends js.Object {
  var bl: scala.Double
  var br: scala.Double
  var tl: scala.Double
  var tr: scala.Double
}

object Anon_BlBrTl {
  @scala.inline
  def apply(bl: scala.Double, br: scala.Double, tl: scala.Double, tr: scala.Double): Anon_BlBrTl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bl")(bl)
    __obj.updateDynamic("br")(br)
    __obj.updateDynamic("tl")(tl)
    __obj.updateDynamic("tr")(tr)
    __obj.asInstanceOf[Anon_BlBrTl]
  }
}

