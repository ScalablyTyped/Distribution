package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGrouping extends js.Object {
  var groupBy: java.lang.String
}

object GridGrouping {
  @scala.inline
  def apply(groupBy: java.lang.String): GridGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupBy")(groupBy)
    __obj.asInstanceOf[GridGrouping]
  }
}

