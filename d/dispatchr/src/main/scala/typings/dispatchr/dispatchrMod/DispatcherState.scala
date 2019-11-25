package typings.dispatchr.dispatchrMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherState extends js.Object {
  var stores: StringDictionary[js.Any]
}

object DispatcherState {
  @scala.inline
  def apply(stores: StringDictionary[js.Any]): DispatcherState = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DispatcherState]
  }
}

