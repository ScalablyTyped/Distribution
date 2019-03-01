package typings
package flatpickrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateObj extends js.Object {
  @JSName("$i")
  var $i: scala.Double
  var dateObj: stdLib.Date
}

object Anon_DateObj {
  @scala.inline
  def apply($i: scala.Double, dateObj: stdLib.Date): Anon_DateObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$i")($i)
    __obj.updateDynamic("dateObj")(dateObj)
    __obj.asInstanceOf[Anon_DateObj]
  }
}

