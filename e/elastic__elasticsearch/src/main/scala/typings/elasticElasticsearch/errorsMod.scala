package typings.elasticElasticsearch

import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.Context
import typings.elasticElasticsearch.transportMod._ApiError
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class ConfigurationError protected ()
    extends ElasticsearchClientError
       with _ApiError {
    def this(message: String) = this()
  }
  
  @js.native
  class ConnectionError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
  
  @js.native
  class DeserializationError protected ()
    extends ElasticsearchClientError
       with _ApiError {
    def this(message: String, data: String) = this()
    
    var data: String = js.native
  }
  
  @js.native
  class ElasticsearchClientError () extends Error
  
  @js.native
  class NoLivingConnectionsError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
  
  @js.native
  class RequestAbortedError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
  
  @js.native
  class ResponseError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(meta: ApiResponse[Record[String, _], Context]) = this()
    
    var body: TResponse = js.native
    
    var headers: Record[String, _] = js.native
    
    var meta: ApiResponse[TResponse, TContext] = js.native
    
    var statusCode: Double = js.native
  }
  
  @js.native
  class SerializationError protected ()
    extends ElasticsearchClientError
       with _ApiError {
    def this(message: String, data: js.Any) = this()
    
    var data: js.Any = js.native
  }
  
  @js.native
  class TimeoutError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
}
