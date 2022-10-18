package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshOptions extends StObject {
  
  var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined
  
  var forceRefreshOnFailure: js.UndefOr[Boolean] = js.undefined
}
object RefreshOptions {
  
  inline def apply(): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOptions]
  }
  
  extension [Self <: RefreshOptions](x: Self) {
    
    inline def setEagerRefreshThresholdMillis(value: Double): Self = StObject.set(x, "eagerRefreshThresholdMillis", value.asInstanceOf[js.Any])
    
    inline def setEagerRefreshThresholdMillisUndefined: Self = StObject.set(x, "eagerRefreshThresholdMillis", js.undefined)
    
    inline def setForceRefreshOnFailure(value: Boolean): Self = StObject.set(x, "forceRefreshOnFailure", value.asInstanceOf[js.Any])
    
    inline def setForceRefreshOnFailureUndefined: Self = StObject.set(x, "forceRefreshOnFailure", js.undefined)
  }
}
