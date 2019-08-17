package typings.dva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dvaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.dva.Anon_History
  import typings.dva.Anon_Type
  import typings.react.reactMod.Global.JSXNs.Element
  import typings.redux.reduxMod.Action
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.MiddlewareAPI
  import typings.redux.reduxMod.Reducer
  import typings.redux.reduxMod.ReducersMapObject

  type DvaOption = Hooks with Anon_History
  type Effect = js.Function2[/* action */ AnyAction, /* effects */ EffectsCommandMap, Unit]
  type EffectWithType = js.Tuple2[Effect, Anon_Type]
  type EffectsMapObject = StringDictionary[Effect | EffectWithType]
  type ReducerEnhancer = js.Function1[/* reducer */ Reducer[js.Any, AnyAction], Unit]
  type ReducersMapObjectWithEnhancer = js.Tuple2[ReducersMapObject[js.Any, Action[js.Any]], ReducerEnhancer]
  type Router = js.Function1[/* api */ js.UndefOr[RouterAPI], Element | js.Object]
  type Subscription = js.Function2[/* api */ SubscriptionAPI, /* done */ js.Function, Unit]
  type SubscriptionsMapObject = StringDictionary[Subscription]
  type onActionFunc = js.Function1[/* api */ MiddlewareAPI[js.Any, js.Any], Unit]
}
