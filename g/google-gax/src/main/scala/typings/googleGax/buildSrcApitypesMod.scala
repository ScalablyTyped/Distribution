package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.anon.Deadline
import typings.googleGax.buildSrcCallMod.CancellablePromise
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGoogleErrorMod.GoogleError
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApitypesMod {
  
  type APICallback = js.Function4[
    /* err */ GoogleError | Null, 
    /* response */ js.UndefOr[ResponseType], 
    /* next */ js.UndefOr[NextPageRequestType], 
    /* rawResponse */ js.UndefOr[RawResponseType], 
    Unit
  ]
  
  type BiDiStreamingCall = js.Function2[/* metadata */ js.Object, /* options */ js.Object, Duplex & GRPCCallResult]
  
  @js.native
  trait CancellableStream
    extends Duplex
       with GRPCCallResult
  
  type ClientStreamingCall = js.Function3[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ js.UndefOr[APICallback], 
    Duplex & GRPCCallResult
  ]
  
  type GRPCCall = UnaryCall | ServerStreamingCall | ClientStreamingCall | BiDiStreamingCall
  
  @js.native
  trait GRPCCallOtherArgs extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.native
    
    def metadataBuilder(): js.Object = js.native
    def metadataBuilder(abTests: js.Object): js.Object = js.native
    def metadataBuilder(abTests: js.Object, headers: js.Object): js.Object = js.native
    def metadataBuilder(abTests: Unit, headers: js.Object): js.Object = js.native
    
    var options: js.UndefOr[Deadline] = js.native
  }
  
  trait GRPCCallResult extends StObject {
    
    def cancel(): Unit
  }
  object GRPCCallResult {
    
    inline def apply(cancel: () => Unit): GRPCCallResult = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[GRPCCallResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GRPCCallResult] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  type GaxCall = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[CallOptions], 
    /* callback */ js.UndefOr[APICallback], 
    GaxCallResult
  ]
  
  type GaxCallPromise = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[CallOptions], 
    /* callback */ js.UndefOr[APICallback], 
    CancellablePromise[ResultTuple]
  ]
  
  type GaxCallResult = CancellablePromise[ResultTuple] | CancellableStream
  
  type GaxCallStream = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[CallOptions], 
    /* callback */ js.UndefOr[APICallback], 
    CancellableStream
  ]
  
  type NextPageRequestType = (StringDictionary[String | Double | js.Object]) | Null
  
  type RawResponseType = Operation_ | js.Object | Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RequestType = {[index: string] : string | number | google-gax.google-gax/build/src/apitypes.RequestType | std.Array<string | number | google-gax.google-gax/build/src/apitypes.RequestType>}
  }}}
  to avoid circular code involving: 
  - google-gax.google-gax/build/src/apitypes.RequestType
  - google-gax.google-gax/build/src/apitypes.SimpleCallbackFunction
  */
  trait RequestType
    extends StObject
       with /* index */ StringDictionary[String | Double | RequestType | (js.Array[String | Double | RequestType])]
  object RequestType {
    
    inline def apply(): RequestType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestType]
    }
  }
  
  type ResponseType = js.Object | Null
  
  type ResultTuple = js.Tuple3[
    ResponseType | js.Array[ResponseType], 
    js.UndefOr[NextPageRequestType], 
    js.UndefOr[RawResponseType]
  ]
  
  type ServerStreamingCall = js.Function3[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    Duplex & GRPCCallResult
  ]
  
  type SimpleCallbackFunction = js.Function2[/* request */ RequestType, /* callback */ APICallback, GRPCCallResult]
  
  type UnaryCall = js.Function4[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ APICallback, 
    GRPCCallResult
  ]
}
