package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicResourceFallback extends StObject {
  
  var minutesExpiration: js.UndefOr[Double] = js.undefined
  
  var publicResourceFallback: js.UndefOr[Boolean] = js.undefined
  
  var useCdn: js.UndefOr[Boolean] = js.undefined
}
object PublicResourceFallback {
  
  inline def apply(): PublicResourceFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicResourceFallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicResourceFallback] (val x: Self) extends AnyVal {
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinutesExpirationUndefined: Self = StObject.set(x, "minutesExpiration", js.undefined)
    
    inline def setPublicResourceFallback(value: Boolean): Self = StObject.set(x, "publicResourceFallback", value.asInstanceOf[js.Any])
    
    inline def setPublicResourceFallbackUndefined: Self = StObject.set(x, "publicResourceFallback", js.undefined)
    
    inline def setUseCdn(value: Boolean): Self = StObject.set(x, "useCdn", value.asInstanceOf[js.Any])
    
    inline def setUseCdnUndefined: Self = StObject.set(x, "useCdn", js.undefined)
  }
}
