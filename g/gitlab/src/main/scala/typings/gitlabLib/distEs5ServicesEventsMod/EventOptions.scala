package typings
package gitlabLib.distEs5ServicesEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var action: java.lang.String
  var targetType: java.lang.String
}

object EventOptions {
  @scala.inline
  def apply(action: java.lang.String, targetType: java.lang.String): EventOptions = {
    val __obj = js.Dynamic.literal(action = action, targetType = targetType)
  
    __obj.asInstanceOf[EventOptions]
  }
}

