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
    js.Function2[/* e */ stdLib.Error, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
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
    onEffect: () => scala.Unit = null,
    onError: (/* e */ stdLib.Error, /* dispatch */ reduxLib.reduxMod.Dispatch[_]) => scala.Unit = null,
    onHmr: () => scala.Unit = null,
    onReducer: ReducerEnhancer = null,
    onStateChange: () => scala.Unit = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (extraEnhancers != null) __obj.updateDynamic("extraEnhancers")(extraEnhancers)
    if (extraReducers != null) __obj.updateDynamic("extraReducers")(extraReducers)
    if (onAction != null) __obj.updateDynamic("onAction")(onAction.asInstanceOf[js.Any])
    if (onEffect != null) __obj.updateDynamic("onEffect")(js.Any.fromFunction0(onEffect))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onHmr != null) __obj.updateDynamic("onHmr")(js.Any.fromFunction0(onHmr))
    if (onReducer != null) __obj.updateDynamic("onReducer")(onReducer)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction0(onStateChange))
    __obj.asInstanceOf[Hooks]
  }
}

