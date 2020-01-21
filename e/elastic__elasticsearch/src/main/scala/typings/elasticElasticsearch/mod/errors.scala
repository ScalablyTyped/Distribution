package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.transportMod.ApiResponse
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
  class ConnectionError protected ()
    extends typings.elasticElasticsearch.errorsMod.ConnectionError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends typings.elasticElasticsearch.errorsMod.DeserializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends typings.elasticElasticsearch.errorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError protected ()
    extends typings.elasticElasticsearch.errorsMod.NoLivingConnectionsError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class ResponseError protected ()
    extends typings.elasticElasticsearch.errorsMod.ResponseError {
    def this(meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends typings.elasticElasticsearch.errorsMod.SerializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class TimeoutError protected ()
    extends typings.elasticElasticsearch.errorsMod.TimeoutError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
}

