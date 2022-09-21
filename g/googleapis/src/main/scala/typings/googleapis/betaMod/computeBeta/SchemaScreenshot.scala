package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScreenshot extends StObject {
  
  /**
    * [Output Only] The Base64-encoded screenshot data.
    */
  var contents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaScreenshot {
  
  inline def apply(): SchemaScreenshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreenshot]
  }
  
  extension [Self <: SchemaScreenshot](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
