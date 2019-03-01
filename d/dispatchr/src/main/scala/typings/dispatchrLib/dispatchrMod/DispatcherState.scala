package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherState extends js.Object {
  var stores: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object DispatcherState {
  @scala.inline
  def apply(stores: org.scalablytyped.runtime.StringDictionary[js.Any]): DispatcherState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stores")(stores)
    __obj.asInstanceOf[DispatcherState]
  }
}

