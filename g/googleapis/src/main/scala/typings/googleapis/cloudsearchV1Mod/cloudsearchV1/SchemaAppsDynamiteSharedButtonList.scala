package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedButtonList extends StObject {
  
  var buttons: js.UndefOr[js.Array[SchemaAppsDynamiteSharedButton]] = js.undefined
}
object SchemaAppsDynamiteSharedButtonList {
  
  inline def apply(): SchemaAppsDynamiteSharedButtonList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedButtonList]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedButtonList](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaAppsDynamiteSharedButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaAppsDynamiteSharedButton*): Self = StObject.set(x, "buttons", js.Array(value*))
  }
}
