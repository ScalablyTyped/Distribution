package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.descriptorMod.BundleDescriptor
import typings.googleGax.descriptorMod.LongrunningDescriptor
import typings.googleGax.descriptorMod.PageDescriptor
import typings.googleGax.descriptorMod.StreamDescriptor
import typings.googleGax.gaxMod.ClientConfig
import typings.googleGax.grpcMod.GrpcClientOptions
import typings.googleGax.longrunningMod.Operation_
import typings.grpcGrpcJs.mod.ChannelCredentials
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientInterfaceMod {
  
  type Callback[ResponseObject, NextRequestObject, RawResponseObject] = js.Function4[
    /* err */ js.UndefOr[Error | Null], 
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
  - typings.googleGax.grpcMod.ClientStubOptions because Inheritance from two classes. Inlined protocol, servicePath, port, sslCreds */ trait ClientOptions
    extends StObject
       with GrpcClientOptions {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var clientConfig: js.UndefOr[ClientConfig] = js.undefined
    
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    var libName: js.UndefOr[String] = js.undefined
    
    var libVersion: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
    
    var sslCreds: js.UndefOr[ChannelCredentials] = js.undefined
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setClientConfig(value: ClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      @scala.inline
      def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLibName(value: String): Self = StObject.set(x, "libName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibNameUndefined: Self = StObject.set(x, "libName", js.undefined)
      
      @scala.inline
      def setLibVersion(value: String): Self = StObject.set(x, "libVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibVersionUndefined: Self = StObject.set(x, "libVersion", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      @scala.inline
      def setSslCreds(value: ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  trait Descriptors extends StObject {
    
    var batching: js.UndefOr[StringDictionary[BundleDescriptor]] = js.undefined
    
    var longrunning: StringDictionary[LongrunningDescriptor]
    
    var page: StringDictionary[PageDescriptor]
    
    var stream: StringDictionary[StreamDescriptor]
  }
  object Descriptors {
    
    @scala.inline
    def apply(
      longrunning: StringDictionary[LongrunningDescriptor],
      page: StringDictionary[PageDescriptor],
      stream: StringDictionary[StreamDescriptor]
    ): Descriptors = {
      val __obj = js.Dynamic.literal(longrunning = longrunning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptors]
    }
    
    @scala.inline
    implicit class DescriptorsMutableBuilder[Self <: Descriptors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatching(value: StringDictionary[BundleDescriptor]): Self = StObject.set(x, "batching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchingUndefined: Self = StObject.set(x, "batching", js.undefined)
      
      @scala.inline
      def setLongrunning(value: StringDictionary[LongrunningDescriptor]): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: StringDictionary[PageDescriptor]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: StringDictionary[StreamDescriptor]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LROperation[ResultType, MetadataType] extends Operation_
  
  type PaginationCallback[RequestObject, ResponseObject, ResponseType] = js.Function4[
    /* err */ Error | Null, 
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
    
    @scala.inline
    def apply[RequestObject, ResponseObject, ResponseType](): PaginationResponse[RequestObject, ResponseObject, ResponseType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationResponse[RequestObject, ResponseObject, ResponseType]]
    }
    
    @scala.inline
    implicit class PaginationResponseMutableBuilder[Self <: PaginationResponse[?, ?, ?], RequestObject, ResponseObject, ResponseType] (val x: Self & (PaginationResponse[RequestObject, ResponseObject, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setNextPageRequest(value: RequestObject): Self = StObject.set(x, "nextPageRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageRequestUndefined: Self = StObject.set(x, "nextPageRequest", js.undefined)
      
      @scala.inline
      def setRawResponse(value: ResponseObject): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[ResponseType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: ResponseType*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
