package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPage extends StObject {
  
  var from: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlPage {
  
  inline def apply(): MlPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPage]
  }
  
  extension [Self <: MlPage](x: Self) {
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
