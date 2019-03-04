package typings
package easeljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventObj extends js.Object {
  def handleEvent(eventObj: js.Object): scala.Boolean
}

object Anon_EventObj {
  @scala.inline
  def apply(handleEvent: js.Function1[js.Object, scala.Boolean]): Anon_EventObj = {
    val __obj = js.Dynamic.literal(handleEvent = handleEvent)
  
    __obj.asInstanceOf[Anon_EventObj]
  }
}

