package typings
package atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Long extends js.Object {
  def toNumber(): scala.Double
}

object Long {
  @scala.inline
  def apply(toNumber: () => scala.Double): Long = {
    val __obj = js.Dynamic.literal(toNumber = js.Any.fromFunction0(toNumber))
  
    __obj.asInstanceOf[Long]
  }
}

