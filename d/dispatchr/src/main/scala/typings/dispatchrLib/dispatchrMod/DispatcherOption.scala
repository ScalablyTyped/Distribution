package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherOption extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, scala.Unit]
  ] = js.undefined
  var stores: js.UndefOr[js.Array[StoreClass]] = js.undefined
}

