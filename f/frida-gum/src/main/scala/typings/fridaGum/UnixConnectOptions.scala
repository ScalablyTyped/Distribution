package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixConnectOptions extends SocketConnectOptions {
  
  /**
    * Address family.
    */
  var family: unix = js.native
  
  /**
    * Path to UNIX socket to connect to.
    */
  var path: String = js.native
  
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of UNIX socket to connect to. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.native
}
object UnixConnectOptions {
  
  @scala.inline
  def apply(family: unix, path: String): UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixConnectOptions]
  }
  
  @scala.inline
  implicit class UnixConnectOptionsMutableBuilder[Self <: UnixConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: unix): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    @scala.inline
    def setType(value: UnixSocketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
