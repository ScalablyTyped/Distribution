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

object Hooks {
  @scala.inline
  def apply(
    extraEnhancers: js.Array[reduxLib.reduxMod.StoreEnhancer[_, js.Object]] = null,
    extraReducers: reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]] = null,
    onAction: onActionFunc | js.Array[onActionFunc] = null,
    onEffect: js.Function0[scala.Unit] = null,
    onError: js.Function2[/* e */ nodeLib.Error, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = null,
    onHmr: js.Function0[scala.Unit] = null,
    onReducer: ReducerEnhancer = null,
    onStateChange: js.Function0[scala.Unit] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (extraEnhancers != null) __obj.updateDynamic("extraEnhancers")(extraEnhancers)
    if (extraReducers != null) __obj.updateDynamic("extraReducers")(extraReducers)
    if (onAction != null) __obj.updateDynamic("onAction")(onAction.asInstanceOf[js.Any])
    if (onEffect != null) __obj.updateDynamic("onEffect")(onEffect)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onHmr != null) __obj.updateDynamic("onHmr")(onHmr)
    if (onReducer != null) __obj.updateDynamic("onReducer")(onReducer)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    __obj.asInstanceOf[Hooks]
  }
}

