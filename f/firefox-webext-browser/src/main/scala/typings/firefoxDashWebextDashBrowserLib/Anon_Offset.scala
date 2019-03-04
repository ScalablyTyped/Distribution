package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: scala.Double
  var `type`: scala.Double
}

object Anon_Offset {
  @scala.inline
  def apply(offset: scala.Double, `type`: scala.Double): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Offset]
  }
}

