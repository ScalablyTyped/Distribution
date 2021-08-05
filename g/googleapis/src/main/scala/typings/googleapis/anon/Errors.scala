package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaErrorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
}
object Errors {
  
  inline def apply(): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
