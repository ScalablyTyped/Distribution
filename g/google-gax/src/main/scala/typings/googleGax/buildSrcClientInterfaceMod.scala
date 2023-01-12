package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.buildSrcDescriptorMod.BundleDescriptor
import typings.googleGax.buildSrcDescriptorMod.LongrunningDescriptor
import typings.googleGax.buildSrcDescriptorMod.PageDescriptor
import typings.googleGax.buildSrcDescriptorMod.StreamDescriptor
import typings.googleGax.buildSrcGaxMod.ClientConfig
import typings.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_
import typings.googleGax.googleGaxStrings.proto
import typings.googleGax.googleGaxStrings.rest
import typings.grpcGrpcJs.mod.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcClientInterfaceMod {
  
  type Callback[ResponseObject, NextRequestObject, RawResponseObject] = js.Function4[
    /* err */ js.UndefOr[js.Error | Null], 
    /* value */ js.UndefOr[ResponseObject | Null], 
    /* nextRequest */ js.UndefOr[NextRequestObject], 
    /* rawResponse */ js.UndefOr[RawResponseObject], 
    Unit
  ]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined 
  - typings.googleGax.buildSrcGrpcMod.ClientStubOptions because Inheritance from two classes. Inlined protocol, servicePath, port, sslCreds, cert, key */ trait ClientOptions
    extends StObject
       with GrpcClientOptions {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var clientConfig: js.UndefOr[ClientConfig] = js.undefined
    
    var fallback: js.UndefOr[Boolean | rest | proto] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var libName: js.UndefOr[String] = js.undefined
    
    var libVersion: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
    
    var sslCreds: js.UndefOr[ChannelCredentials] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setClientConfig(value: ClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setFallback(value: Boolean | rest | proto): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLibName(value: String): Self = StObject.set(x, "libName", value.asInstanceOf[js.Any])
      
      inline def setLibNameUndefined: Self = StObject.set(x, "libName", js.undefined)
      
      inline def setLibVersion(value: String): Self = StObject.set(x, "libVersion", value.asInstanceOf[js.Any])
      
      inline def setLibVersionUndefined: Self = StObject.set(x, "libVersion", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      inline def setSslCreds(value: ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      inline def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  trait Descriptors extends StObject {
    
    var batching: js.UndefOr[StringDictionary[BundleDescriptor]] = js.undefined
    
    var longrunning: StringDictionary[LongrunningDescriptor]
    
    var page: StringDictionary[PageDescriptor]
    
    var stream: StringDictionary[StreamDescriptor]
  }
  object Descriptors {
    
    inline def apply(
      longrunning: StringDictionary[LongrunningDescriptor],
      page: StringDictionary[PageDescriptor],
      stream: StringDictionary[StreamDescriptor]
    ): Descriptors = {
      val __obj = js.Dynamic.literal(longrunning = longrunning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Descriptors] (val x: Self) extends AnyVal {
      
      inline def setBatching(value: StringDictionary[BundleDescriptor]): Self = StObject.set(x, "batching", value.asInstanceOf[js.Any])
      
      inline def setBatchingUndefined: Self = StObject.set(x, "batching", js.undefined)
      
      inline def setLongrunning(value: StringDictionary[LongrunningDescriptor]): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
      
      inline def setPage(value: StringDictionary[PageDescriptor]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setStream(value: StringDictionary[StreamDescriptor]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LROperation[ResultType, MetadataType] extends Operation_
  
  type PaginationCallback[RequestObject, ResponseObject, ResponseType] = js.Function4[
    /* err */ js.Error | Null, 
    /* values */ js.UndefOr[js.Array[ResponseType]], 
    /* nextPageRequest */ js.UndefOr[RequestObject], 
    /* rawResponse */ js.UndefOr[ResponseObject], 
    Unit
  ]
  
  trait PaginationResponse[RequestObject, ResponseObject, ResponseType] extends StObject {
    
    var nextPageRequest: js.UndefOr[RequestObject] = js.undefined
    
    var rawResponse: js.UndefOr[ResponseObject] = js.undefined
    
    var values: js.UndefOr[js.Array[ResponseType]] = js.undefined
  }
  object PaginationResponse {
    
    inline def apply[RequestObject, ResponseObject, ResponseType](): PaginationResponse[RequestObject, ResponseObject, ResponseType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationResponse[RequestObject, ResponseObject, ResponseType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationResponse[?, ?, ?], RequestObject, ResponseObject, ResponseType] (val x: Self & (PaginationResponse[RequestObject, ResponseObject, ResponseType])) extends AnyVal {
      
      inline def setNextPageRequest(value: RequestObject): Self = StObject.set(x, "nextPageRequest", value.asInstanceOf[js.Any])
      
      inline def setNextPageRequestUndefined: Self = StObject.set(x, "nextPageRequest", js.undefined)
      
      inline def setRawResponse(value: ResponseObject): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
      
      inline def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
      
      inline def setValues(value: js.Array[ResponseType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: ResponseType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
