package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayApiConfigFile extends StObject {
  
  /**
    * The bytes that constitute the file.
    */
  var contents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file path (full or relative path). This is typically the path of the file when it is uploaded.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayApiConfigFile {
  
  inline def apply(): SchemaApigatewayApiConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayApiConfigFile]
  }
  
  extension [Self <: SchemaApigatewayApiConfigFile](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
