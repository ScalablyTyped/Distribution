package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
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
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckForUpdate(value: () => DOMRequest[_]): Self = StObject.set(x, "checkForUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstallOrigin(value: String): Self = StObject.set(x, "installOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallTime(value: Double): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setManifest(value: js.Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipts(value: js.Array[_]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptsVarargs(value: js.Any*): Self = StObject.set(x, "receipts", js.Array(value :_*))
  }
}
