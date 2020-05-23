package typings.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apitypesMod {
  type APICallback = js.Function4[
    /* err */ typings.googleGax.googleErrorMod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[typings.googleGax.apitypesMod.ResponseType], 
    /* next */ js.UndefOr[typings.googleGax.apitypesMod.NextPageRequestType], 
    /* rawResponse */ js.UndefOr[typings.googleGax.apitypesMod.RawResponseType], 
    scala.Unit
  ]
  type BiDiStreamingCall = js.Function2[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    typings.node.streamMod.Duplex with typings.googleGax.apitypesMod.GRPCCallResult
  ]
  type CancellableStream = typings.node.streamMod.Duplex with typings.googleGax.apitypesMod.GRPCCallResult
  type ClientStreamingCall = js.Function3[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ js.UndefOr[typings.googleGax.apitypesMod.APICallback], 
    typings.node.streamMod.Duplex with typings.googleGax.apitypesMod.GRPCCallResult
  ]
  type GRPCCall = typings.googleGax.apitypesMod.UnaryCall | typings.googleGax.apitypesMod.ServerStreamingCall | typings.googleGax.apitypesMod.ClientStreamingCall | typings.googleGax.apitypesMod.BiDiStreamingCall
  type GaxCall = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typings.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typings.googleGax.apitypesMod.APICallback], 
    typings.googleGax.apitypesMod.GaxCallResult
  ]
  type GaxCallPromise = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typings.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typings.googleGax.apitypesMod.APICallback], 
    typings.googleGax.callMod.CancellablePromise[typings.googleGax.apitypesMod.ResultTuple]
  ]
  type GaxCallResult = typings.googleGax.callMod.CancellablePromise[typings.googleGax.apitypesMod.ResultTuple] | typings.googleGax.apitypesMod.CancellableStream
  type GaxCallStream = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typings.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typings.googleGax.apitypesMod.APICallback], 
    typings.googleGax.apitypesMod.CancellableStream
  ]
  type NextPageRequestType = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | js.Object]) | scala.Null
  type RawResponseType = typings.googleGax.longrunningMod.Operation_ | js.Object | scala.Null
  type RequestType = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | js.Object]
  type ResponseType = js.Object | scala.Null
  type ResultTuple = js.Tuple3[
    typings.googleGax.apitypesMod.ResponseType, 
    js.UndefOr[typings.googleGax.apitypesMod.NextPageRequestType], 
    js.UndefOr[typings.googleGax.apitypesMod.RawResponseType]
  ]
  type ServerStreamingCall = js.Function3[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    typings.node.streamMod.Duplex with typings.googleGax.apitypesMod.GRPCCallResult
  ]
  type SimpleCallbackFunction = js.Function2[
    /* request */ typings.googleGax.apitypesMod.RequestType, 
    /* callback */ typings.googleGax.apitypesMod.APICallback, 
    typings.googleGax.apitypesMod.GRPCCallResult
  ]
  type UnaryCall = js.Function4[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ typings.googleGax.apitypesMod.APICallback, 
    typings.googleGax.apitypesMod.GRPCCallResult
  ]
}
