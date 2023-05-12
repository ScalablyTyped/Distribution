package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkSize extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var minutesExpiration: js.UndefOr[Double] = js.undefined
  
  var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, js.UndefOr[Unit]]] = js.undefined
  
  var onRefreshToken: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
  
  var publicResourceFallback: js.UndefOr[Boolean] = js.undefined
  
  var useCdn: js.UndefOr[Boolean] = js.undefined
}
object ChunkSize {
  
  inline def apply(): ChunkSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkSize] (val x: Self) extends AnyVal {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinutesExpirationUndefined: Self = StObject.set(x, "minutesExpiration", js.undefined)
    
    inline def setOnDownloadProgress(value: /* progressEvent */ Any => js.UndefOr[Unit]): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setOnRefreshToken(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "onRefreshToken", js.Any.fromFunction0(value))
    
    inline def setOnRefreshTokenUndefined: Self = StObject.set(x, "onRefreshToken", js.undefined)
    
    inline def setPublicResourceFallback(value: Boolean): Self = StObject.set(x, "publicResourceFallback", value.asInstanceOf[js.Any])
    
    inline def setPublicResourceFallbackUndefined: Self = StObject.set(x, "publicResourceFallback", js.undefined)
    
    inline def setUseCdn(value: Boolean): Self = StObject.set(x, "useCdn", value.asInstanceOf[js.Any])
    
    inline def setUseCdnUndefined: Self = StObject.set(x, "useCdn", js.undefined)
  }
}
