package typings.elasticElasticsearch

import typings.elasticElasticsearch.libClientMod.ClientOptions
import typings.elasticElasticsearch.libClientMod.default
import typings.elasticTransport.anon.ALIVE
import typings.elasticTransport.anon.DEFAULT
import typings.elasticTransport.anon.None
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import typings.elasticTransport.libSerializerMod.SerializerOptions
import typings.elasticTransport.libTransportMod.TransportOptions
import typings.elasticTransport.libTypesMod.DiagnosticResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@elastic/elasticsearch", "BaseConnection")
  @js.native
  open class BaseConnection protected ()
    extends typings.elasticTransport.mod.BaseConnection {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object BaseConnection {
    
    @JSImport("@elastic/elasticsearch", "BaseConnection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch", "BaseConnection.statuses")
    @js.native
    def statuses: ALIVE = js.native
    inline def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/elasticsearch", "BaseConnectionPool")
  @js.native
  open class BaseConnectionPool protected ()
    extends typings.elasticTransport.mod.BaseConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "Client")
  @js.native
  open class Client protected () extends default {
    def this(opts: ClientOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "CloudConnectionPool")
  @js.native
  open class CloudConnectionPool protected ()
    extends typings.elasticTransport.mod.CloudConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "ClusterConnectionPool")
  @js.native
  open class ClusterConnectionPool protected ()
    extends typings.elasticTransport.mod.ClusterConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  /* static members */
  object ClusterConnectionPool {
    
    @JSImport("@elastic/elasticsearch", "ClusterConnectionPool")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch", "ClusterConnectionPool.resurrectStrategies")
    @js.native
    def resurrectStrategies: None = js.native
    inline def resurrectStrategies_=(x: None): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resurrectStrategies")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/elasticsearch", "Diagnostic")
  @js.native
  open class Diagnostic ()
    extends typings.elasticTransport.mod.Diagnostic
  
  @JSImport("@elastic/elasticsearch", "HttpConnection")
  @js.native
  open class HttpConnection protected ()
    extends typings.elasticTransport.mod.HttpConnection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "Serializer")
  @js.native
  open class Serializer ()
    extends typings.elasticTransport.mod.Serializer {
    def this(opts: SerializerOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "SniffingTransport")
  @js.native
  open class SniffingTransport ()
    extends typings.elasticElasticsearch.libSniffingTransportMod.default
  
  @JSImport("@elastic/elasticsearch", "Transport")
  @js.native
  open class Transport protected ()
    extends typings.elasticTransport.mod.Transport {
    def this(opts: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("@elastic/elasticsearch", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch", "Transport.sniffReasons")
    @js.native
    def sniffReasons: DEFAULT = js.native
    inline def sniffReasons_=(x: DEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sniffReasons")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/elasticsearch", "UndiciConnection")
  @js.native
  open class UndiciConnection protected ()
    extends typings.elasticTransport.mod.UndiciConnection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "WeightedConnectionPool")
  @js.native
  open class WeightedConnectionPool protected ()
    extends typings.elasticTransport.mod.WeightedConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  object errors {
    
    @JSImport("@elastic/elasticsearch", "errors.ConfigurationError")
    @js.native
    open class ConfigurationError protected ()
      extends typings.elasticTransport.mod.errors.ConfigurationError {
      def this(message: String) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ConnectionError")
    @js.native
    open class ConnectionError protected ()
      extends typings.elasticTransport.mod.errors.ConnectionError {
      def this(message: String) = this()
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.DeserializationError")
    @js.native
    open class DeserializationError protected ()
      extends typings.elasticTransport.mod.errors.DeserializationError {
      def this(message: String, data: String) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ElasticsearchClientError")
    @js.native
    open class ElasticsearchClientError protected ()
      extends typings.elasticTransport.mod.errors.ElasticsearchClientError {
      def this(message: String) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.NoLivingConnectionsError")
    @js.native
    open class NoLivingConnectionsError protected ()
      extends typings.elasticTransport.mod.errors.NoLivingConnectionsError {
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ProductNotSupportedError")
    @js.native
    open class ProductNotSupportedError protected ()
      extends typings.elasticTransport.mod.errors.ProductNotSupportedError {
      def this(product: String) = this()
      def this(product: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.RequestAbortedError")
    @js.native
    open class RequestAbortedError protected ()
      extends typings.elasticTransport.mod.errors.RequestAbortedError {
      def this(message: String) = this()
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ResponseError")
    @js.native
    open class ResponseError protected ()
      extends typings.elasticTransport.mod.errors.ResponseError {
      def this(meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.SerializationError")
    @js.native
    open class SerializationError protected ()
      extends typings.elasticTransport.mod.errors.SerializationError {
      def this(message: String, data: Record[String, Any]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.TimeoutError")
    @js.native
    open class TimeoutError protected ()
      extends typings.elasticTransport.mod.errors.TimeoutError {
      def this(message: String) = this()
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
  }
  
  @JSImport("@elastic/elasticsearch", "events")
  @js.native
  object events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.elasticTransport.libDiagnosticMod.events & String] = js.native
    
    /* "deserialization" */ val DESERIALIZATION: typings.elasticTransport.libDiagnosticMod.events.DESERIALIZATION & String = js.native
    
    /* "request" */ val REQUEST: typings.elasticTransport.libDiagnosticMod.events.REQUEST & String = js.native
    
    /* "response" */ val RESPONSE: typings.elasticTransport.libDiagnosticMod.events.RESPONSE & String = js.native
    
    /* "resurrect" */ val RESURRECT: typings.elasticTransport.libDiagnosticMod.events.RESURRECT & String = js.native
    
    /* "serialization" */ val SERIALIZATION: typings.elasticTransport.libDiagnosticMod.events.SERIALIZATION & String = js.native
    
    /* "sniff" */ val SNIFF: typings.elasticTransport.libDiagnosticMod.events.SNIFF & String = js.native
  }
}
