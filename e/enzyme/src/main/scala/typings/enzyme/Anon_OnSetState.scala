package typings.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnSetState extends js.Object {
  var onSetState: Boolean
  var prevContext: Boolean
}

object Anon_OnSetState {
  @scala.inline
  def apply(onSetState: Boolean, prevContext: Boolean): Anon_OnSetState = {
    val __obj = js.Dynamic.literal(onSetState = onSetState.asInstanceOf[js.Any], prevContext = prevContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OnSetState]
  }
}

