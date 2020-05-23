package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type callbackFn[Response, Context] = js.Function2[
    /* err */ typings.elasticElasticsearch.transportMod.ApiError, 
    /* result */ typings.elasticElasticsearch.transportMod.ApiResponse[Response, Context], 
    scala.Unit
  ]
  type extendsCallback = js.Function1[
    /* options */ typings.elasticElasticsearch.mod.ClientExtendsCallbackOptions, 
    js.Any
  ]
}
