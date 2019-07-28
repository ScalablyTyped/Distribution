package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import typings.atFirebaseAuthDashTypes.Anon_Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeInfo extends js.Object {
  var data: Anon_Email
  var operation: String
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: Anon_Email, operation: String): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data, operation = operation)
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

