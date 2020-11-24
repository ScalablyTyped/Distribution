package typings.dva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Effect = js.Function2[
    /* action */ typings.redux.mod.AnyAction, 
    /* effects */ typings.dva.mod.EffectsCommandMap, 
    scala.Unit
  ]
  
  type EffectWithType = js.Tuple2[typings.dva.mod.Effect, typings.dva.anon.Type]
  
  type EffectsMapObject = org.scalablytyped.runtime.StringDictionary[typings.dva.mod.Effect | typings.dva.mod.EffectWithType]
  
  type ReducerEnhancer = js.Function1[
    /* reducer */ typings.redux.mod.Reducer[js.Any, typings.redux.mod.AnyAction], 
    scala.Unit
  ]
  
  type ReducersMapObjectWithEnhancer = js.Tuple2[
    typings.redux.mod.ReducersMapObject[js.Any, typings.redux.mod.Action[js.Any]], 
    typings.dva.mod.ReducerEnhancer
  ]
  
  type Router = js.Function1[
    /* api */ js.UndefOr[typings.dva.mod.RouterAPI], 
    typings.react.mod.global.JSX.Element | js.Object
  ]
  
  type Subscription = js.Function2[/* api */ typings.dva.mod.SubscriptionAPI, /* done */ js.Function, scala.Unit]
  
  type SubscriptionsMapObject = org.scalablytyped.runtime.StringDictionary[typings.dva.mod.Subscription]
  
  type onActionFunc = js.Function1[/* api */ typings.redux.mod.MiddlewareAPI[js.Any, js.Any], scala.Unit]
}
