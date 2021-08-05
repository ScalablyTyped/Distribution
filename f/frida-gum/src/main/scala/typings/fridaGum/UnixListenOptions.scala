package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixListenOptions
  extends StObject
     with BaseListenOptions
     with SocketListenOptions {
  
  /**
    * Address family.
    */
  var family: unix
  
  /**
    * UNIX socket path to listen on.
    */
  var path: String
  
  /**
    * Type of UNIX socket to listen on. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.undefined
}
object UnixListenOptions {
  
  inline def apply(path: String): UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = "unix", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixListenOptions]
  }
  
  extension [Self <: UnixListenOptions](x: Self) {
    
    inline def setFamily(value: unix): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: UnixSocketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
