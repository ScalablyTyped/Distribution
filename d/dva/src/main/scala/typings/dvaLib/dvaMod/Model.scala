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

