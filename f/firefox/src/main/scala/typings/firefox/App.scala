package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  def checkForUpdate(): DOMRequest[js.Any]
  
  var installOrigin: String
  
  var installTime: Double
  
  def launch(): Unit
  
  var manifest: js.Any
  
  var manifestURL: String
  
  var origin: String
  
  var receipts: js.Array[js.Any]
}
object App {
  
  inline def apply(
    checkForUpdate: () => DOMRequest[js.Any],
    installOrigin: String,
    installTime: Double,
    launch: () => Unit,
    manifest: js.Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[js.Any]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = js.Any.fromFunction0(checkForUpdate), installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], launch = js.Any.fromFunction0(launch), manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setCheckForUpdate(value: () => DOMRequest[js.Any]): Self = StObject.set(x, "checkForUpdate", js.Any.fromFunction0(value))
    
    inline def setInstallOrigin(value: String): Self = StObject.set(x, "installOrigin", value.asInstanceOf[js.Any])
    
    inline def setInstallTime(value: Double): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    inline def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
    
    inline def setManifest(value: js.Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setReceipts(value: js.Array[js.Any]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
    
    inline def setReceiptsVarargs(value: js.Any*): Self = StObject.set(x, "receipts", js.Array(value :_*))
  }
}
