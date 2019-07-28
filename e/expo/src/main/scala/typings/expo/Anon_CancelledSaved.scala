package typings.expo

import typings.expo.expoStrings.cancelled
import typings.expo.expoStrings.saved
import typings.expo.expoStrings.sent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledSaved extends js.Object {
  var status: sent | saved | cancelled
}

object Anon_CancelledSaved {
  @scala.inline
  def apply(status: sent | saved | cancelled): Anon_CancelledSaved = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelledSaved]
  }
}

