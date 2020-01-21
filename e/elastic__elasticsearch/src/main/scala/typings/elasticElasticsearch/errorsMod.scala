package typings.elasticElasticsearch

import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class ConfigurationError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
  }
  
  @js.native
  class ConnectionError protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
    var meta: ApiResponse[_, _] = js.native
  }
  
  @js.native
  class DeserializationError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class NoLivingConnectionsError protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
    var meta: ApiResponse[_, _] = js.native
  }
  
  @js.native
  class ResponseError protected () extends ElasticsearchClientError {
    def this(meta: ApiResponse[_, _]) = this()
    var body: js.Any = js.native
    var headers: js.Any = js.native
    var meta: ApiResponse[_, _] = js.native
    var statusCode: Double = js.native
  }
  
  @js.native
  class SerializationError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
  }
  
  @js.native
  class TimeoutError protected () extends ElasticsearchClientError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
    var meta: ApiResponse[_, _] = js.native
  }
  
}

