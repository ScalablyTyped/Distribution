package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFixedFooter extends StObject {
  
  var buttons: js.UndefOr[js.Array[SchemaButton]] = js.undefined
  
  var primaryButton: js.UndefOr[SchemaTextButton] = js.undefined
  
  var secondaryButton: js.UndefOr[SchemaTextButton] = js.undefined
}
object SchemaFixedFooter {
  
  inline def apply(): SchemaFixedFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixedFooter]
  }
  
  extension [Self <: SchemaFixedFooter](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setPrimaryButton(value: SchemaTextButton): Self = StObject.set(x, "primaryButton", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonUndefined: Self = StObject.set(x, "primaryButton", js.undefined)
    
    inline def setSecondaryButton(value: SchemaTextButton): Self = StObject.set(x, "secondaryButton", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonUndefined: Self = StObject.set(x, "secondaryButton", js.undefined)
  }
}
