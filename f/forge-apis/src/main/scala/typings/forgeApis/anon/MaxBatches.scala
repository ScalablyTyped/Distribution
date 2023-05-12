package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxBatches extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var maxBatches: js.UndefOr[Double] = js.undefined
  
  var minutesExpiration: js.UndefOr[Double] = js.undefined
  
  var onRefreshToken: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, js.UndefOr[Unit]]] = js.undefined
  
  var useAcceleration: js.UndefOr[Boolean] = js.undefined
}
object MaxBatches {
  
  inline def apply(): MaxBatches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxBatches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxBatches] (val x: Self) extends AnyVal {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setMaxBatches(value: Double): Self = StObject.set(x, "maxBatches", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchesUndefined: Self = StObject.set(x, "maxBatches", js.undefined)
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinutesExpirationUndefined: Self = StObject.set(x, "minutesExpiration", js.undefined)
    
    inline def setOnRefreshToken(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "onRefreshToken", js.Any.fromFunction0(value))
    
    inline def setOnRefreshTokenUndefined: Self = StObject.set(x, "onRefreshToken", js.undefined)
    
    inline def setOnUploadProgress(value: /* progressEvent */ Any => js.UndefOr[Unit]): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setUseAcceleration(value: Boolean): Self = StObject.set(x, "useAcceleration", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerationUndefined: Self = StObject.set(x, "useAcceleration", js.undefined)
  }
}
