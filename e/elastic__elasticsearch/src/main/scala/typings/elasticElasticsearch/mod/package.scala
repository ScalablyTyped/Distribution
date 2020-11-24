package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type callbackFn[TResponse, TContext] = js.Function2[
    /* err */ typings.elasticElasticsearch.transportMod.ApiError, 
    /* result */ typings.elasticElasticsearch.transportMod.ApiResponse[TResponse, TContext], 
    scala.Unit
  ]
  
  type extendsCallback = js.Function1[
    /* options */ typings.elasticElasticsearch.mod.ClientExtendsCallbackOptions, 
    js.Any
  ]
}
