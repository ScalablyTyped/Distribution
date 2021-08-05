package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainPageSuffix extends StObject {
  
  var mainPageSuffix: js.UndefOr[String] = js.undefined
  
  var notFoundPage: js.UndefOr[String] = js.undefined
}
object MainPageSuffix {
  
  inline def apply(): MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainPageSuffix]
  }
  
  extension [Self <: MainPageSuffix](x: Self) {
    
    inline def setMainPageSuffix(value: String): Self = StObject.set(x, "mainPageSuffix", value.asInstanceOf[js.Any])
    
    inline def setMainPageSuffixUndefined: Self = StObject.set(x, "mainPageSuffix", js.undefined)
    
    inline def setNotFoundPage(value: String): Self = StObject.set(x, "notFoundPage", value.asInstanceOf[js.Any])
    
    inline def setNotFoundPageUndefined: Self = StObject.set(x, "notFoundPage", js.undefined)
  }
}
