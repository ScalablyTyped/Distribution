package typings.elasticElasticsearch

import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.Context
import typings.elasticElasticsearch.transportMod._ApiError
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@elastic/elasticsearch/lib/errors", "ConfigurationError")
  @js.native
  class ConfigurationError protected ()
    extends ElasticsearchClientError
       with _ApiError {
    def this(message: String) = this()
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "ConnectionError")
  @js.native
  class ConnectionError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "DeserializationError")
  @js.native
  class DeserializationError protected ()
    extends ElasticsearchClientError
       with _ApiError {
    def this(message: String, data: String) = this()
    
    var data: String = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "ElasticsearchClientError")
  @js.native
  class ElasticsearchClientError () extends Error
  
  @JSImport("@elastic/elasticsearch/lib/errors", "NoLivingConnectionsError")
  @js.native
  class NoLivingConnectionsError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "RequestAbortedError")
  @js.native
  class RequestAbortedError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "ResponseError")
  @js.native
  class ResponseError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(meta: ApiResponse[Record[String, _], Context]) = this()
    
    var body: TResponse = js.native
    
    var headers: Record[String, _] = js.native
    
    var meta: ApiResponse[TResponse, TContext] = js.native
    
    var statusCode: Double = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "SerializationError")
  @js.native
  class SerializationError protected ()
    extends ElasticsearchClientError
       with _ApiError {
    def this(message: String, data: js.Any) = this()
    
    var data: js.Any = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/errors", "TimeoutError")
  @js.native
  class TimeoutError[TResponse, TContext] protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    
    var meta: ApiResponse[TResponse, TContext] = js.native
  }
}
