package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeInfo extends js.Object {
  var data: firebaseLib.Anon_Email
  var operation: java.lang.String
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: firebaseLib.Anon_Email, operation: java.lang.String): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data, operation = operation)
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

