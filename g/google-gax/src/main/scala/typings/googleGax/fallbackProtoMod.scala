package typings.googleGax

import typings.googleGax.fallbackServiceStubMod.FetchParameters
import typings.node.bufferMod.global.Buffer
import typings.protobufjs.mod.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackProtoMod {
  
  @JSImport("google-gax/build/src/fallbackProto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeResponse(rpc: Method, ok: Boolean, response: js.typedarray.ArrayBuffer): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeResponse")(rpc.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def decodeResponse(rpc: Method, ok: Boolean, response: Buffer): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeResponse")(rpc.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def encodeRequest(rpc: Method, protocol: String, servicePath: String, servicePort: Double, request: js.Object): FetchParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeRequest")(rpc.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], servicePath.asInstanceOf[js.Any], servicePort.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[FetchParameters]
}
