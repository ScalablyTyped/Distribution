package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteV1ApiCompatV1ActionConfirm extends StObject {
  
  /**
    * "Cancel" button label.
    */
  var dismiss_text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * "OK" button label.
    */
  var ok_text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Confirmation dialog body text.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Confirmation dialog title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteV1ApiCompatV1ActionConfirm {
  
  inline def apply(): SchemaAppsDynamiteV1ApiCompatV1ActionConfirm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteV1ApiCompatV1ActionConfirm]
  }
  
  extension [Self <: SchemaAppsDynamiteV1ApiCompatV1ActionConfirm](x: Self) {
    
    inline def setDismiss_text(value: String): Self = StObject.set(x, "dismiss_text", value.asInstanceOf[js.Any])
    
    inline def setDismiss_textNull: Self = StObject.set(x, "dismiss_text", null)
    
    inline def setDismiss_textUndefined: Self = StObject.set(x, "dismiss_text", js.undefined)
    
    inline def setOk_text(value: String): Self = StObject.set(x, "ok_text", value.asInstanceOf[js.Any])
    
    inline def setOk_textNull: Self = StObject.set(x, "ok_text", null)
    
    inline def setOk_textUndefined: Self = StObject.set(x, "ok_text", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
