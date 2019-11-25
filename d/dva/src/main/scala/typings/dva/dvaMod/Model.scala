package typings.dva.dvaMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var effects: js.UndefOr[EffectsMapObject] = js.undefined
  var namespace: String
  var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | ReducersMapObjectWithEnhancer] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var subscriptions: js.UndefOr[SubscriptionsMapObject] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    namespace: String,
    effects: EffectsMapObject = null,
    reducers: (ReducersMapObject[_, Action[_]]) | ReducersMapObjectWithEnhancer = null,
    state: js.Any = null,
    subscriptions: SubscriptionsMapObject = null
  ): Model = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (reducers != null) __obj.updateDynamic("reducers")(reducers.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

