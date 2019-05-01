package typings
package gatsbyLib.gatsbyMod

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
    val __obj = js.Dynamic.literal(dispatch = dispatch, getState = getState, replaceReducer = replaceReducer, subscribe = subscribe)
  
    __obj.asInstanceOf[Store]
  }
}

