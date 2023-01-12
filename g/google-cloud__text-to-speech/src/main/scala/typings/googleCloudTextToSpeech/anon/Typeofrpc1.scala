package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.protobufMinimal.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofrpc1 extends StObject {
  
  /** An RPC service as returned by {@link Service#create}. */
  var Service: Instantiable1[/* rpcImpl */ RPCImpl, typings.googleGax.mod.protobufMinimal.rpc.Service]
}
object Typeofrpc1 {
  
  inline def apply(Service: Instantiable1[/* rpcImpl */ RPCImpl, Service]): Typeofrpc1 = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrpc1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofrpc1] (val x: Self) extends AnyVal {
    
    inline def setService(value: Instantiable1[/* rpcImpl */ RPCImpl, Service]): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
