package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionTitle extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DescriptionTitle {
  
  inline def apply(): DescriptionTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionTitle]
  }
  
  extension [Self <: DescriptionTitle](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
