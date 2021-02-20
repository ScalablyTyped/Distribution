package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpConnectOptions
  - typings.fridaGum.UnixConnectOptions
*/
trait SocketConnectOptions extends StObject
object SocketConnectOptions {
  
  @scala.inline
  def TcpConnectOptions(port: Double): typings.fridaGum.TcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.TcpConnectOptions]
  }
  
  @scala.inline
  def UnixConnectOptions(family: unix, path: String): typings.fridaGum.UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.UnixConnectOptions]
  }
}
