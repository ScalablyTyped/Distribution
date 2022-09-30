package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagePath extends StObject {
  
  var inputManifest: Any
  
  var pagePath: Any
}
object PagePath {
  
  inline def apply(inputManifest: Any, pagePath: Any): PagePath = {
    val __obj = js.Dynamic.literal(inputManifest = inputManifest.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePath]
  }
  
  extension [Self <: PagePath](x: Self) {
    
    inline def setInputManifest(value: Any): Self = StObject.set(x, "inputManifest", value.asInstanceOf[js.Any])
    
    inline def setPagePath(value: Any): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
  }
}
