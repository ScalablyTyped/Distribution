package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpListenOptions
  - typings.fridaGum.UnixListenOptions
*/
trait SocketListenOptions extends js.Object
object SocketListenOptions {
  
  @scala.inline
  def TcpListenOptions(): SocketListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketListenOptions]
  }
  
  @scala.inline
  def UnixListenOptions(family: unix, path: String): SocketListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketListenOptions]
  }
}
