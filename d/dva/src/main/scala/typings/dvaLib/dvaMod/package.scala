package typings
package dvaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dvaMod {
  type DvaOption = Hooks with dvaLib.Anon_History
  type Effect = js.Function2[
    /* action */ reduxLib.reduxMod.AnyAction, 
    /* effects */ EffectsCommandMap, 
    scala.Unit
  ]
  type EffectWithType = js.Tuple2[Effect, dvaLib.Anon_Type]
  type EffectsMapObject = org.scalablytyped.runtime.StringDictionary[Effect | EffectWithType]
  type ReducerEnhancer = js.Function1[
    /* reducer */ reduxLib.reduxMod.Reducer[js.Any, reduxLib.reduxMod.AnyAction], 
    scala.Unit
  ]
  type ReducersMapObjectWithEnhancer = js.Tuple2[
    reduxLib.reduxMod.ReducersMapObject[js.Any, reduxLib.reduxMod.Action[js.Any]], 
    ReducerEnhancer
  ]
  type Router = js.Function1[
    /* api */ js.UndefOr[RouterAPI], 
    reactLib.reactMod.Global.JSXNs.Element | js.Object
  ]
  type Subscription = js.Function2[/* api */ SubscriptionAPI, /* done */ js.Function, scala.Unit]
  type SubscriptionsMapObject = org.scalablytyped.runtime.StringDictionary[Subscription]
  type onActionFunc = js.Function1[/* api */ reduxLib.reduxMod.MiddlewareAPI[js.Any, js.Any], scala.Unit]
}
