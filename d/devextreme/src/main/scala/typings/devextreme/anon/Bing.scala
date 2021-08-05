package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bing extends StObject {
  
  var bing: js.UndefOr[String] = js.undefined
  
  var google: js.UndefOr[String] = js.undefined
  
  var googleStatic: js.UndefOr[String] = js.undefined
}
object Bing {
  
  inline def apply(): Bing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bing]
  }
  
  extension [Self <: Bing](x: Self) {
    
    inline def setBing(value: String): Self = StObject.set(x, "bing", value.asInstanceOf[js.Any])
    
    inline def setBingUndefined: Self = StObject.set(x, "bing", js.undefined)
    
    inline def setGoogle(value: String): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    
    inline def setGoogleStatic(value: String): Self = StObject.set(x, "googleStatic", value.asInstanceOf[js.Any])
    
    inline def setGoogleStaticUndefined: Self = StObject.set(x, "googleStatic", js.undefined)
    
    inline def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
  }
}
