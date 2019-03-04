package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdMobAppEvent extends js.Object {
  var info: java.lang.String
  var name: java.lang.String
}

object AdMobAppEvent {
  @scala.inline
  def apply(info: java.lang.String, name: java.lang.String): AdMobAppEvent = {
    val __obj = js.Dynamic.literal(info = info, name = name)
  
    __obj.asInstanceOf[AdMobAppEvent]
  }
}

