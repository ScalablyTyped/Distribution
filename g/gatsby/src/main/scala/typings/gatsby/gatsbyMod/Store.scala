package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var dispatch: js.Function
  var getState: js.Function
  var replaceReducer: js.Function
  var subscribe: js.Function
}

object Store {
  @scala.inline
  def apply(dispatch: js.Function, getState: js.Function, replaceReducer: js.Function, subscribe: js.Function): Store = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any], replaceReducer = replaceReducer.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Store]
  }
}

