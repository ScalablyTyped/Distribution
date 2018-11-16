package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Hooks extends js.Object {
  var extraEnhancers: js.UndefOr[js.Array[reduxLib.reduxMod.StoreEnhancer[_, js.Object]]] = js.undefined
  var extraReducers: js.UndefOr[reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]] = js.undefined
  var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.undefined
  var onEffect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function2[/* e */ nodeLib.Error, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var onHmr: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onReducer: js.UndefOr[ReducerEnhancer] = js.undefined
  var onStateChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

