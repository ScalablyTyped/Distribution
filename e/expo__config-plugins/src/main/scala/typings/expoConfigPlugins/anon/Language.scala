package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildIosPathsMod.AppleLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  var contents: String
  
  var language: AppleLanguage
  
  var path: String
}
object Language {
  
  inline def apply(contents: String, language: AppleLanguage, path: String): Language = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: AppleLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
