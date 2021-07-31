package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  var server: js.UndefOr[Double] = js.undefined
  
  var sync: js.UndefOr[Double] = js.undefined
}
object Server {
  
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  
  @scala.inline
  implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Double): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setSync(value: Double): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
