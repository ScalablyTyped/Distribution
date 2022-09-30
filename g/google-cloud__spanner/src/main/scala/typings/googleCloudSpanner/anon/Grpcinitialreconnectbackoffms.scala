package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grpcinitialreconnectbackoffms extends StObject {
  
  @JSName("grpc.initial_reconnect_backoff_ms")
  var grpcDotinitial_reconnect_backoff_ms: Double
  
  @JSName("grpc.max_receive_message_length")
  var grpcDotmax_receive_message_length: Double
  
  @JSName("grpc.max_send_message_length")
  var grpcDotmax_send_message_length: Double
}
object Grpcinitialreconnectbackoffms {
  
  inline def apply(
    grpcDotinitial_reconnect_backoff_ms: Double,
    grpcDotmax_receive_message_length: Double,
    grpcDotmax_send_message_length: Double
  ): Grpcinitialreconnectbackoffms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grpc.initial_reconnect_backoff_ms")(grpcDotinitial_reconnect_backoff_ms.asInstanceOf[js.Any])
    __obj.updateDynamic("grpc.max_receive_message_length")(grpcDotmax_receive_message_length.asInstanceOf[js.Any])
    __obj.updateDynamic("grpc.max_send_message_length")(grpcDotmax_send_message_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grpcinitialreconnectbackoffms]
  }
  
  extension [Self <: Grpcinitialreconnectbackoffms](x: Self) {
    
    inline def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
    
    inline def setGrpcDotmax_receive_message_length(value: Double): Self = StObject.set(x, "grpc.max_receive_message_length", value.asInstanceOf[js.Any])
    
    inline def setGrpcDotmax_send_message_length(value: Double): Self = StObject.set(x, "grpc.max_send_message_length", value.asInstanceOf[js.Any])
  }
}
