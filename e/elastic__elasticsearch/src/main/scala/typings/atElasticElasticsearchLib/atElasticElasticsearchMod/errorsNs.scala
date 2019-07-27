package typings
package atElasticElasticsearchLib.atElasticElasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.ConfigurationError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class ConnectionError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.ConnectionError {
    def this(message: java.lang.String, meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.DeserializationError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends atElasticElasticsearchLib.libErrorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.NoLivingConnectionsError {
    def this(message: java.lang.String, meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]) = this()
  }
  
  @js.native
  class ResponseError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.ResponseError {
    def this(meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.SerializationError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class TimeoutError protected ()
    extends atElasticElasticsearchLib.libErrorsMod.TimeoutError {
    def this(message: java.lang.String, meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]) = this()
  }
  
}

