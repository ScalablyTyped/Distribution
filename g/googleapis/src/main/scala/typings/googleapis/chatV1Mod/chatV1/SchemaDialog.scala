package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDialog extends StObject {
  
  /**
    * Input only. Body of the dialog, which is rendered in a modal. Google Chat apps do not support the following card entities: `DateTimePicker`, `OnChangeAction`.
    */
  var body: js.UndefOr[SchemaGoogleAppsCardV1Card] = js.undefined
}
object SchemaDialog {
  
  inline def apply(): SchemaDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDialog]
  }
  
  extension [Self <: SchemaDialog](x: Self) {
    
    inline def setBody(value: SchemaGoogleAppsCardV1Card): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
