package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A paragraph of text. Formatted text supported.
  */
trait SchemaTextParagraph extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object SchemaTextParagraph {
  
  inline def apply(): SchemaTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextParagraph]
  }
  
  extension [Self <: SchemaTextParagraph](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
