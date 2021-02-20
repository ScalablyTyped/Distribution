package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshOptions extends StObject {
  
  var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.native
  
  var forceRefreshOnFailure: js.UndefOr[Boolean] = js.native
}
object RefreshOptions {
  
  @scala.inline
  def apply(): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOptions]
  }
  
  @scala.inline
  implicit class RefreshOptionsMutableBuilder[Self <: RefreshOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEagerRefreshThresholdMillis(value: Double): Self = StObject.set(x, "eagerRefreshThresholdMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEagerRefreshThresholdMillisUndefined: Self = StObject.set(x, "eagerRefreshThresholdMillis", js.undefined)
    
    @scala.inline
    def setForceRefreshOnFailure(value: Boolean): Self = StObject.set(x, "forceRefreshOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRefreshOnFailureUndefined: Self = StObject.set(x, "forceRefreshOnFailure", js.undefined)
  }
}
