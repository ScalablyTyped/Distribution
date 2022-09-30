package typings.googleCloudTasks.mod

import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudTasksConfig
  extends StObject
     with GoogleAuthOptions[JSONClient] {
  
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var libName: js.UndefOr[String] = js.undefined
  
  var libVersion: js.UndefOr[String] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
}
object CloudTasksConfig {
  
  inline def apply(): CloudTasksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudTasksConfig]
  }
  
  extension [Self <: CloudTasksConfig](x: Self) {
    
    inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLibName(value: String): Self = StObject.set(x, "libName", value.asInstanceOf[js.Any])
    
    inline def setLibNameUndefined: Self = StObject.set(x, "libName", js.undefined)
    
    inline def setLibVersion(value: String): Self = StObject.set(x, "libVersion", value.asInstanceOf[js.Any])
    
    inline def setLibVersionUndefined: Self = StObject.set(x, "libVersion", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
