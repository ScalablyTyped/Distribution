package typings.atFirebaseAnalytics

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reason extends js.Object {
  var reason: Error
}

object Anon_Reason {
  @scala.inline
  def apply(reason: Error): Anon_Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Reason]
  }
}

