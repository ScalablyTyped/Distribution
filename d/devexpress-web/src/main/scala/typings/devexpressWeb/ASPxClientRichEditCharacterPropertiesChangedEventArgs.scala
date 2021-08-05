package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.CharacterPropertiesChanged event.
  */
trait ASPxClientRichEditCharacterPropertiesChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the text buffer interval related to the changed characters.
    */
  var interval: Interval
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}
object ASPxClientRichEditCharacterPropertiesChangedEventArgs {
  
  inline def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditCharacterPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditCharacterPropertiesChangedEventArgs]
  }
  
  extension [Self <: ASPxClientRichEditCharacterPropertiesChangedEventArgs](x: Self) {
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
