package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeobfuscationFile extends StObject {
  
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeobfuscationFile {
  
  inline def apply(): SchemaDeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFile]
  }
  
  extension [Self <: SchemaDeobfuscationFile](x: Self) {
    
    inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeNull: Self = StObject.set(x, "symbolType", null)
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
  }
}
