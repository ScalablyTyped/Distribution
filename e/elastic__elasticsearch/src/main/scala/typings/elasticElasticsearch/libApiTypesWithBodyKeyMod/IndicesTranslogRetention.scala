package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesTranslogRetention extends StObject {
  
  var age: js.UndefOr[Duration] = js.undefined
  
  var size: js.UndefOr[ByteSize] = js.undefined
}
object IndicesTranslogRetention {
  
  inline def apply(): IndicesTranslogRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesTranslogRetention]
  }
  
  extension [Self <: IndicesTranslogRetention](x: Self) {
    
    inline def setAge(value: Duration): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setSize(value: ByteSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
