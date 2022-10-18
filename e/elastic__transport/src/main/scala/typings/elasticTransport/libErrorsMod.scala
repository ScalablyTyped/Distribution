package typings.elasticTransport

import typings.elasticTransport.libTypesMod.DiagnosticResult
import typings.node.httpMod.IncomingHttpHeaders
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorsMod {
  
  @JSImport("@elastic/transport/lib/errors", "ConfigurationError")
  @js.native
  open class ConfigurationError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
  }
  
  @JSImport("@elastic/transport/lib/errors", "ConnectionError")
  @js.native
  open class ConnectionError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
    def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    
    var meta: js.UndefOr[DiagnosticResult[Any, Any]] = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "DeserializationError")
  @js.native
  open class DeserializationError protected () extends ElasticsearchClientError {
    def this(message: String, data: String) = this()
    
    var data: String = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "ElasticsearchClientError")
  @js.native
  open class ElasticsearchClientError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "NoLivingConnectionsError")
  @js.native
  open class NoLivingConnectionsError protected () extends ElasticsearchClientError {
    def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    
    var meta: DiagnosticResult[Any, Any] = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "ProductNotSupportedError")
  @js.native
  open class ProductNotSupportedError protected () extends ElasticsearchClientError {
    def this(product: String) = this()
    def this(product: String, meta: DiagnosticResult[Any, Any]) = this()
    
    var meta: js.UndefOr[DiagnosticResult[Any, Any]] = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "RequestAbortedError")
  @js.native
  open class RequestAbortedError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
    def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    
    var meta: js.UndefOr[DiagnosticResult[Any, Any]] = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "ResponseError")
  @js.native
  open class ResponseError protected () extends ElasticsearchClientError {
    def this(meta: DiagnosticResult[Any, Any]) = this()
    
    def body: js.UndefOr[Any] = js.native
    
    def headers: js.UndefOr[IncomingHttpHeaders] = js.native
    
    var meta: DiagnosticResult[Any, Any] = js.native
    
    def statusCode: js.UndefOr[Double] = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "SerializationError")
  @js.native
  open class SerializationError protected () extends ElasticsearchClientError {
    def this(message: String, data: Record[String, Any]) = this()
    
    var data: Record[String, Any] = js.native
  }
  
  @JSImport("@elastic/transport/lib/errors", "TimeoutError")
  @js.native
  open class TimeoutError protected () extends ElasticsearchClientError {
    def this(message: String) = this()
    def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    
    var meta: js.UndefOr[DiagnosticResult[Any, Any]] = js.native
  }
}
