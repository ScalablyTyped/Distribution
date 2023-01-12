package typings.easyXapiSupertest

import typings.easyXapiSupertest.eventsMod.EventEmitter
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dgramMod {
  
  @JSImport("dgram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSocket(`type`: String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket]
  inline def createSocket(`type`: String, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Socket]
  
  trait AddressInfo extends StObject {
    
    var address: String
    
    var family: String
    
    var port: Double
  }
  object AddressInfo {
    
    inline def apply(address: String, family: String, port: Double): AddressInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoteInfo extends StObject {
    
    var address: String
    
    var port: Double
    
    var size: Double
  }
  object RemoteInfo {
    
    inline def apply(address: String, port: Double, size: Double): RemoteInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoteInfo] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Socket extends EventEmitter {
    
    def addMembership(multicastAddress: String): Unit = js.native
    def addMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
    
    def address(): AddressInfo = js.native
    
    def bind(port: Double): Unit = js.native
    def bind(port: Double, address: String): Unit = js.native
    def bind(port: Double, address: String, callback: js.Function0[Unit]): Unit = js.native
    def bind(port: Double, address: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    def close(): Unit = js.native
    
    def dropMembership(multicastAddress: String): Unit = js.native
    def dropMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
    
    def send(buf: Buffer, offset: Double, length: Double, port: Double, address: String): Unit = js.native
    def send(
      buf: Buffer,
      offset: Double,
      length: Double,
      port: Double,
      address: String,
      callback: js.Function2[/* error */ js.Error, /* bytes */ Double, Unit]
    ): Unit = js.native
    
    def setBroadcast(flag: Boolean): Unit = js.native
    
    def setMulticastLoopback(flag: Boolean): Unit = js.native
    
    def setMulticastTTL(ttl: Double): Unit = js.native
  }
}
