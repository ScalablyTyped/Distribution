package typings.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnSetState extends js.Object {
  var onSetState: Boolean
  var prevContext: Boolean
}

object AnonOnSetState {
  @scala.inline
  def apply(onSetState: Boolean, prevContext: Boolean): AnonOnSetState = {
    val __obj = js.Dynamic.literal(onSetState = onSetState.asInstanceOf[js.Any], prevContext = prevContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnSetState]
  }
}

