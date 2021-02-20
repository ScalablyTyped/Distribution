package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  
  /**
    * Address family.
    */
  var family: unix = js.native
  
  /**
    * UNIX socket path to listen on.
    */
  var path: String = js.native
  
  /**
    * Type of UNIX socket to listen on. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.native
}
object UnixListenOptions {
  
  @scala.inline
  def apply(family: unix, path: String): UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixListenOptions]
  }
  
  @scala.inline
  implicit class UnixListenOptionsMutableBuilder[Self <: UnixListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: unix): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UnixSocketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
