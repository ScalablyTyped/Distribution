package typings.expo.buildARMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidFailWithErrorEvent extends js.Object {
  var error: Error
}

object DidFailWithErrorEvent {
  @scala.inline
  def apply(error: Error): DidFailWithErrorEvent = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[DidFailWithErrorEvent]
  }
}

