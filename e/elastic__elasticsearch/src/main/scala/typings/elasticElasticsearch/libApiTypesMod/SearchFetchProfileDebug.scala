package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFetchProfileDebug extends StObject {
  
  var fast_path: js.UndefOr[integer] = js.undefined
  
  var stored_fields: js.UndefOr[js.Array[String]] = js.undefined
}
object SearchFetchProfileDebug {
  
  inline def apply(): SearchFetchProfileDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFetchProfileDebug]
  }
  
  extension [Self <: SearchFetchProfileDebug](x: Self) {
    
    inline def setFast_path(value: integer): Self = StObject.set(x, "fast_path", value.asInstanceOf[js.Any])
    
    inline def setFast_pathUndefined: Self = StObject.set(x, "fast_path", js.undefined)
    
    inline def setStored_fields(value: js.Array[String]): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: String*): Self = StObject.set(x, "stored_fields", js.Array(value*))
  }
}
