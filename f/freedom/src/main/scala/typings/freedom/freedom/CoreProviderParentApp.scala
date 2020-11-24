package typings.freedom.freedom

import typings.freedom.anon.RemoveEventListener
import typings.freedom.anon.Views
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is the first argument given to a core provider's constructor. It is an
// object that describes the parent module the core provider instance has been
// created for.
@js.native
trait CoreProviderParentApp extends js.Object {
  
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
  implicit class CoreProviderParentAppOps[Self <: CoreProviderParentApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: Views): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: RemoveEventListener): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestId(value: String): Self = this.set("manifestId", value.asInstanceOf[js.Any])
  }
}
