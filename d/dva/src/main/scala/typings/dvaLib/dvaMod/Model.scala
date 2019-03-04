package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var effects: js.UndefOr[EffectsMapObject] = js.undefined
  var namespace: java.lang.String
  var reducers: js.UndefOr[
    (reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]) | ReducersMapObjectWithEnhancer
  ] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var subscriptions: js.UndefOr[SubscriptionsMapObject] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    namespace: java.lang.String,
    effects: EffectsMapObject = null,
    reducers: (reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]) | ReducersMapObjectWithEnhancer = null,
    state: js.Any = null,
    subscriptions: SubscriptionsMapObject = null
  ): Model = {
    val __obj = js.Dynamic.literal(namespace = namespace)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (reducers != null) __obj.updateDynamic("reducers")(reducers.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions)
    __obj.asInstanceOf[Model]
  }
}

