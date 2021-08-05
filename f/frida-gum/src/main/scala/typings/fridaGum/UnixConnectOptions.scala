package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixConnectOptions
  extends StObject
     with SocketConnectOptions {
  
  /**
    * Address family.
    */
  var family: unix
  
  /**
    * Path to UNIX socket to connect to.
    */
  var path: String
  
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of UNIX socket to connect to. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.undefined
}
object UnixConnectOptions {
  
  inline def apply(path: String): UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = "unix", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixConnectOptions]
  }
  
  extension [Self <: UnixConnectOptions](x: Self) {
    
    inline def setFamily(value: unix): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    inline def setType(value: UnixSocketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
