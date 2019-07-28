package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdMobAppEvent extends js.Object {
  var info: String
  var name: String
}

object AdMobAppEvent {
  @scala.inline
  def apply(info: String, name: String): AdMobAppEvent = {
    val __obj = js.Dynamic.literal(info = info, name = name)
  
    __obj.asInstanceOf[AdMobAppEvent]
  }
}

