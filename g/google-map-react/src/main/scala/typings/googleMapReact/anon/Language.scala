package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  var libraries: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
}
object Language {
  
  inline def apply(): Language = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLibraries(value: js.Array[String] | String): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
    
    inline def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value :_*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
