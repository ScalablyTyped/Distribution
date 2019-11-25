package typings.googleDashGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcApitypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.googleDashGax.buildSrcCallMod.CancellablePromise
  import typings.googleDashGax.buildSrcGaxMod.CallOptions
  import typings.googleDashGax.buildSrcGoogleErrorMod.GoogleError
  import typings.googleDashGax.buildSrcLongRunningCallsLongrunningMod.Operation
  import typings.node.streamMod.Duplex

  type APICallback = js.Function4[
    /* err */ GoogleError | Null, 
    /* response */ js.UndefOr[ResponseType], 
    /* next */ js.UndefOr[NextPageRequestType], 
    /* rawResponse */ js.UndefOr[RawResponseType], 
    Unit
  ]
  type BiDiStreamingCall = js.Function2[/* metadata */ js.Object, /* options */ js.Object, Duplex with GRPCCallResult]
  type CancellableStream = Duplex with GRPCCallResult
  type ClientStreamingCall = js.Function3[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ js.UndefOr[APICallback], 
    Duplex with GRPCCallResult
  ]
  type GRPCCall = UnaryCall | ServerStreamingCall | ClientStreamingCall | BiDiStreamingCall
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
  type NextPageRequestType = StringDictionary[String] | Null
  type RawResponseType = Operation | js.Object
  type ResponseType = js.Object | Null
  type ResultTuple = js.Tuple3[ResponseType, js.UndefOr[NextPageRequestType], js.UndefOr[RawResponseType]]
  type ServerStreamingCall = js.Function3[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    Duplex with GRPCCallResult
  ]
  type SimpleCallbackFunction = js.Function2[/* argument */ RequestType, /* callback */ APICallback, GRPCCallResult]
  type UnaryCall = js.Function4[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ APICallback, 
    GRPCCallResult
  ]
}
