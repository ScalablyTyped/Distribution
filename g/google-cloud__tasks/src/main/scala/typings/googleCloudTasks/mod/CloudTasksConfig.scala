package typings.googleCloudTasks.mod

import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudTasksConfig extends GoogleAuthOptions {
  
  var autoRetry: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var libName: js.UndefOr[String] = js.native
  
  var libVersion: js.UndefOr[String] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var promise: js.UndefOr[PromiseConstructor] = js.native
}
object CloudTasksConfig {
  
  @scala.inline
  def apply(): CloudTasksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudTasksConfig]
  }
  
  @scala.inline
  implicit class CloudTasksConfigMutableBuilder[Self <: CloudTasksConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLibName(value: String): Self = StObject.set(x, "libName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibNameUndefined: Self = StObject.set(x, "libName", js.undefined)
    
    @scala.inline
    def setLibVersion(value: String): Self = StObject.set(x, "libVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibVersionUndefined: Self = StObject.set(x, "libVersion", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setPromise(value: PromiseConstructor): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
