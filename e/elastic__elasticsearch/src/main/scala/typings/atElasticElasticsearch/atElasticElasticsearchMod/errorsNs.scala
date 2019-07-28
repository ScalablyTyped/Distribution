package typings.atElasticElasticsearch.atElasticElasticsearchMod

import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.ConfigurationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ConnectionError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.ConnectionError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.DeserializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends typings.atElasticElasticsearch.libErrorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.NoLivingConnectionsError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class ResponseError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.ResponseError {
    def this(meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.SerializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class TimeoutError protected ()
    extends typings.atElasticElasticsearch.libErrorsMod.TimeoutError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
}

