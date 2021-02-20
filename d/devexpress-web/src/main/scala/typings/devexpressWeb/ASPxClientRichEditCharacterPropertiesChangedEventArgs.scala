package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.CharacterPropertiesChanged event.
  */
@js.native
trait ASPxClientRichEditCharacterPropertiesChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the text buffer interval related to the changed characters.
    */
  var interval: Interval = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}
object ASPxClientRichEditCharacterPropertiesChangedEventArgs {
  
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditCharacterPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditCharacterPropertiesChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditCharacterPropertiesChangedEventArgsMutableBuilder[Self <: ASPxClientRichEditCharacterPropertiesChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
