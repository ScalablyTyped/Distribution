package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitCoordsPayload extends js.Object {
  var clientOffset: XYCoord | scala.Null
  var sourceClientOffset: XYCoord | scala.Null
}

object InitCoordsPayload {
  @scala.inline
  def apply(clientOffset: XYCoord = null, sourceClientOffset: XYCoord = null): InitCoordsPayload = {
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset)
    if (sourceClientOffset != null) __obj.updateDynamic("sourceClientOffset")(sourceClientOffset)
    __obj.asInstanceOf[InitCoordsPayload]
  }
}

