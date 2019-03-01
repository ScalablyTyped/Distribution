package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Int | scala.Double = null, unit: java.lang.String = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_Count]
  }
}

