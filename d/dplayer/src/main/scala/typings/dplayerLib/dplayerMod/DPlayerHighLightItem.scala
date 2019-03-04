package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerHighLightItem extends js.Object {
  var text: java.lang.String
  var time: scala.Double
}

object DPlayerHighLightItem {
  @scala.inline
  def apply(text: java.lang.String, time: scala.Double): DPlayerHighLightItem = {
    val __obj = js.Dynamic.literal(text = text, time = time)
  
    __obj.asInstanceOf[DPlayerHighLightItem]
  }
}

