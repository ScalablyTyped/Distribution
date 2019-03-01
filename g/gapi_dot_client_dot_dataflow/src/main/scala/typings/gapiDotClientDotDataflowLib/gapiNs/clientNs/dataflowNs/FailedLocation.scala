package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedLocation extends js.Object {
  /** The name of the failed location. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object FailedLocation {
  @scala.inline
  def apply(name: java.lang.String = null): FailedLocation = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FailedLocation]
  }
}

