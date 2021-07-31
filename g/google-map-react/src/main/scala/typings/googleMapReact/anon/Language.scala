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
  
  @scala.inline
  def apply(): Language = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLibraries(value: js.Array[String] | String): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
    
    @scala.inline
    def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
