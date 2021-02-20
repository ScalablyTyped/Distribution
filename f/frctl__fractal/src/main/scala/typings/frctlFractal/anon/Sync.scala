package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sync extends StObject {
  
  var server: js.UndefOr[String] = js.native
  
  var sync: js.UndefOr[External] = js.native
}
object Sync {
  
  @scala.inline
  def apply(): Sync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sync]
  }
  
  @scala.inline
  implicit class SyncMutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setSync(value: External): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
