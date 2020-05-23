package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transportMod {
  /* Rewritten from type alias, can be one of: 
    - typings.elasticElasticsearch.errorsMod.ConfigurationError
    - typings.elasticElasticsearch.errorsMod.ConnectionError[typings.std.Record[java.lang.String, js.Any], js.Any]
    - typings.elasticElasticsearch.errorsMod.DeserializationError
    - typings.elasticElasticsearch.errorsMod.SerializationError
    - typings.elasticElasticsearch.errorsMod.NoLivingConnectionsError[typings.std.Record[java.lang.String, js.Any], js.Any]
    - typings.elasticElasticsearch.errorsMod.ResponseError[typings.std.Record[java.lang.String, js.Any], js.Any]
    - typings.elasticElasticsearch.errorsMod.TimeoutError[typings.std.Record[java.lang.String, js.Any], js.Any]
    - typings.elasticElasticsearch.errorsMod.RequestAbortedError[typings.std.Record[java.lang.String, js.Any], js.Any]
  */
  type ApiError = typings.elasticElasticsearch.transportMod._ApiError | (typings.elasticElasticsearch.errorsMod.ConnectionError[typings.std.Record[java.lang.String, js.Any], js.Any]) | (typings.elasticElasticsearch.errorsMod.NoLivingConnectionsError[typings.std.Record[java.lang.String, js.Any], js.Any]) | (typings.elasticElasticsearch.errorsMod.ResponseError[typings.std.Record[java.lang.String, js.Any], js.Any]) | (typings.elasticElasticsearch.errorsMod.TimeoutError[typings.std.Record[java.lang.String, js.Any], js.Any]) | (typings.elasticElasticsearch.errorsMod.RequestAbortedError[typings.std.Record[java.lang.String, js.Any], js.Any])
  type ApiResponse[TResponse, TContext] = typings.elasticElasticsearch.transportMod.RequestEvent[TResponse, TContext]
  type RequestBody[T] = T | java.lang.String | typings.node.Buffer | typings.node.streamMod.Readable
  type RequestNDBody[T] = T | java.lang.String | js.Array[java.lang.String] | typings.node.Buffer | typings.node.streamMod.Readable
  type generateRequestIdFn = js.Function2[
    /* params */ typings.elasticElasticsearch.transportMod.TransportRequestParams, 
    /* options */ typings.elasticElasticsearch.transportMod.TransportRequestOptions, 
    js.Any
  ]
  type nodeFilterFn = js.Function1[/* connection */ typings.elasticElasticsearch.connectionMod.default, scala.Boolean]
  type nodeSelectorFn = js.Function1[
    /* connections */ js.Array[typings.elasticElasticsearch.connectionMod.default], 
    typings.elasticElasticsearch.connectionMod.default
  ]
}
