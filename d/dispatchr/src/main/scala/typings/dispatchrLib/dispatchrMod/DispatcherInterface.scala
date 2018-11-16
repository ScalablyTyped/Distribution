package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DispatcherInterface extends js.Object {
  var getStore: (js.Function1[/* name */ java.lang.String, Store[js.Object]]) | (js.Function1[/* name */ StoreClass, StoreClass])
  var waitFor: js.Function2[
    /* stores */ js.Array[java.lang.String | StoreClass], 
    /* callback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  def getContext(): DispatcherContext
}

