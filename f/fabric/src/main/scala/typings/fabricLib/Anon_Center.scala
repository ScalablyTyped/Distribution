package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var center: js.Any
  var farthest: js.Any
  var nearest: js.Any
}

object Anon_Center {
  @scala.inline
  def apply(center: js.Any, farthest: js.Any, nearest: js.Any): Anon_Center = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("farthest")(farthest)
    __obj.updateDynamic("nearest")(nearest)
    __obj.asInstanceOf[Anon_Center]
  }
}

