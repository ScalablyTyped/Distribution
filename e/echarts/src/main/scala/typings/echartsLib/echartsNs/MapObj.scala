package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapObj extends js.Object {
  /**
    * geoJson data for map
    */
  var geoJson: js.Object
  /**
    * special areas fro map
    */
  var specialAreas: js.Object
}

object MapObj {
  @scala.inline
  def apply(geoJson: js.Object, specialAreas: js.Object): MapObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geoJson")(geoJson)
    __obj.updateDynamic("specialAreas")(specialAreas)
    __obj.asInstanceOf[MapObj]
  }
}

