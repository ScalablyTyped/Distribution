package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Title
import typings.googleapis.anon.Words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDictlayerdata extends StObject {
  
  var common: js.UndefOr[Title | Null] = js.undefined
  
  var dict: js.UndefOr[Words | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDictlayerdata {
  
  inline def apply(): SchemaDictlayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDictlayerdata]
  }
  
  extension [Self <: SchemaDictlayerdata](x: Self) {
    
    inline def setCommon(value: Title): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonNull: Self = StObject.set(x, "common", null)
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setDict(value: Words): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
    
    inline def setDictNull: Self = StObject.set(x, "dict", null)
    
    inline def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
