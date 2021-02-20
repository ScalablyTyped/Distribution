package typings.freedom.freedom

import typings.freedom.anon.RemoveEventListener
import typings.freedom.anon.Views
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is the first argument given to a core provider's constructor. It is an
// object that describes the parent module the core provider instance has been
// created for.
@js.native
trait CoreProviderParentApp extends StObject {
  
  var config: Views = js.native
  
  var global: RemoveEventListener = js.native
  
  var manifestId: String = js.native
}
object CoreProviderParentApp {
  
  @scala.inline
  def apply(config: Views, global: RemoveEventListener, manifestId: String): CoreProviderParentApp = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], manifestId = manifestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProviderParentApp]
  }
  
  @scala.inline
  implicit class CoreProviderParentAppMutableBuilder[Self <: CoreProviderParentApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: Views): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: RemoveEventListener): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestId(value: String): Self = StObject.set(x, "manifestId", value.asInstanceOf[js.Any])
  }
}
