package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helpersMod {
  /* Rewritten from type alias, can be one of: 
    - typings.elasticElasticsearch.helpersMod.IndexAction
    - typings.elasticElasticsearch.helpersMod.CreateAction
    - typings.elasticElasticsearch.helpersMod.UpdateAction
    - typings.elasticElasticsearch.helpersMod.DeleteAction
  */
  type Action = typings.elasticElasticsearch.helpersMod._Action | typings.elasticElasticsearch.helpersMod.UpdateAction
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type UpdateAction = js.Tuple2[
    typings.elasticElasticsearch.helpersMod.UpdateActionOperation, 
    typings.std.Record[java.lang.String, js.Any]
  ]
  type callbackFn[Response, Context] = js.Function2[
    /* err */ typings.elasticElasticsearch.transportMod.ApiError, 
    /* result */ typings.elasticElasticsearch.transportMod.ApiResponse[Response, Context], 
    scala.Unit
  ]
}
