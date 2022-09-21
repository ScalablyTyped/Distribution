package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1ButtonList extends StObject {
  
  /**
    * An array of buttons.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleAppsCardV1Button]] = js.undefined
}
object SchemaGoogleAppsCardV1ButtonList {
  
  inline def apply(): SchemaGoogleAppsCardV1ButtonList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1ButtonList]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1ButtonList](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaGoogleAppsCardV1Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaGoogleAppsCardV1Button*): Self = StObject.set(x, "buttons", js.Array(value*))
  }
}
