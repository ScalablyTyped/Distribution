package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends typings.elasticElasticsearch.errorsMod.ConfigurationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ConnectionError[TResponse, TContext] protected ()
    extends typings.elasticElasticsearch.errorsMod.ConnectionError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends typings.elasticElasticsearch.errorsMod.DeserializationError {
    def this(message: String, data: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends typings.elasticElasticsearch.errorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError[TResponse, TContext] protected ()
    extends typings.elasticElasticsearch.errorsMod.NoLivingConnectionsError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class RequestAbortedError[TResponse, TContext] protected ()
    extends typings.elasticElasticsearch.errorsMod.RequestAbortedError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class ResponseError[TResponse, TContext] protected ()
    extends typings.elasticElasticsearch.errorsMod.ResponseError[TResponse, TContext] {
    def this(meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends typings.elasticElasticsearch.errorsMod.SerializationError {
    def this(message: String, data: js.Any) = this()
  }
  
  @js.native
  class TimeoutError[TResponse, TContext] protected ()
    extends typings.elasticElasticsearch.errorsMod.TimeoutError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
}

