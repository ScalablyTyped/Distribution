package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedTextParagraph extends StObject {
  
  /**
    * The text that's shown in the widget.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedTextParagraph {
  
  inline def apply(): SchemaAppsDynamiteSharedTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedTextParagraph]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedTextParagraph](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
