package typings.fridaGum

import typings.fridaGum.fridaGumStrings.ipv4
import typings.fridaGum.fridaGumStrings.ipv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  
  /**
    * Address family. Omit to listen on both ipv4 and ipv6 – if supported by the OS.
    */
  var family: js.UndefOr[ipv4 | ipv6] = js.native
  
  /**
    * Host or IP address to listen on. Omit to listen on all interfaces.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Port to listen on. Omit to listen on a randomly selected port.
    */
  var port: js.UndefOr[Double] = js.native
}
object TcpListenOptions {
  
  @scala.inline
  def apply(): TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpListenOptions]
  }
  
  @scala.inline
  implicit class TcpListenOptionsMutableBuilder[Self <: TcpListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: ipv4 | ipv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
