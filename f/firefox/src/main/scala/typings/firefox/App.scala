package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  def checkForUpdate(): DOMRequest[Any]
  
  var installOrigin: String
  
  var installTime: Double
  
  def launch(): Unit
  
  var manifest: Any
  
  var manifestURL: String
  
  var origin: String
  
  var receipts: js.Array[Any]
}
object App {
  
  inline def apply(
    checkForUpdate: () => DOMRequest[Any],
    installOrigin: String,
    installTime: Double,
    launch: () => Unit,
    manifest: Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[Any]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = js.Any.fromFunction0(checkForUpdate), installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], launch = js.Any.fromFunction0(launch), manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setCheckForUpdate(value: () => DOMRequest[Any]): Self = StObject.set(x, "checkForUpdate", js.Any.fromFunction0(value))
    
    inline def setInstallOrigin(value: String): Self = StObject.set(x, "installOrigin", value.asInstanceOf[js.Any])
    
    inline def setInstallTime(value: Double): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    inline def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
    
    inline def setManifest(value: Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setReceipts(value: js.Array[Any]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
    
    inline def setReceiptsVarargs(value: Any*): Self = StObject.set(x, "receipts", js.Array(value*))
  }
}
