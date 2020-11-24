package typings.firefox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  def checkForUpdate(): DOMRequest[_] = js.native
  
  var installOrigin: String = js.native
  
  var installTime: Double = js.native
  
  def launch(): Unit = js.native
  
  var manifest: js.Any = js.native
  
  var manifestURL: String = js.native
  
  var origin: String = js.native
  
  var receipts: js.Array[_] = js.native
}
object App {
  
  @scala.inline
  def apply(
    checkForUpdate: () => DOMRequest[_],
    installOrigin: String,
    installTime: Double,
    launch: () => Unit,
    manifest: js.Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[_]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = js.Any.fromFunction0(checkForUpdate), installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], launch = js.Any.fromFunction0(launch), manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
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
    def setCheckForUpdate(value: () => DOMRequest[_]): Self = this.set("checkForUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstallOrigin(value: String): Self = this.set("installOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallTime(value: Double): Self = this.set("installTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch(value: () => Unit): Self = this.set("launch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setManifest(value: js.Any): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestURL(value: String): Self = this.set("manifestURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptsVarargs(value: js.Any*): Self = this.set("receipts", js.Array(value :_*))
    
    @scala.inline
    def setReceipts(value: js.Array[_]): Self = this.set("receipts", value.asInstanceOf[js.Any])
  }
}
