package typings.easyXHeaders

import typings.easyXHeaders.eventsMod.EventEmitter
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dgramMod {
  
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(`type`: String): Socket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(`type`: String, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
  
  @js.native
  trait AddressInfo extends StObject {
    
    var address: String = js.native
    
    var family: String = js.native
    
    var port: Double = js.native
  }
  object AddressInfo {
    
    @scala.inline
    def apply(address: String, family: String, port: Double): AddressInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInfo]
    }
    
    @scala.inline
    implicit class AddressInfoMutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoteInfo extends StObject {
    
    var address: String = js.native
    
    var port: Double = js.native
    
    var size: Double = js.native
  }
  object RemoteInfo {
    
    @scala.inline
    def apply(address: String, port: Double, size: Double): RemoteInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteInfo]
    }
    
    @scala.inline
    implicit class RemoteInfoMutableBuilder[Self <: RemoteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Socket extends EventEmitter {
    
    def addMembership(multicastAddress: String): Unit = js.native
    def addMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
    
    def address(): AddressInfo = js.native
    
    def bind(port: Double): Unit = js.native
    def bind(port: Double, address: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def bind(port: Double, address: String): Unit = js.native
    def bind(port: Double, address: String, callback: js.Function0[Unit]): Unit = js.native
    
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
      callback: js.Function2[/* error */ Error, /* bytes */ Double, Unit]
    ): Unit = js.native
    
    def setBroadcast(flag: Boolean): Unit = js.native
    
    def setMulticastLoopback(flag: Boolean): Unit = js.native
    
    def setMulticastTTL(ttl: Double): Unit = js.native
  }
}
