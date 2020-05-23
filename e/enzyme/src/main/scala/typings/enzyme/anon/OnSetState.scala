package typings.enzyme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSetState extends js.Object {
  var onSetState: Boolean
  var prevContext: Boolean
}

object OnSetState {
  @scala.inline
  def apply(onSetState: Boolean, prevContext: Boolean): OnSetState = {
    val __obj = js.Dynamic.literal(onSetState = onSetState.asInstanceOf[js.Any], prevContext = prevContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSetState]
  }
}

