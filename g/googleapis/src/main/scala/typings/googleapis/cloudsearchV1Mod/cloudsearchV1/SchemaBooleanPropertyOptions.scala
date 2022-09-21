package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBooleanPropertyOptions extends StObject {
  
  /**
    * If set, describes how the boolean should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaBooleanOperatorOptions] = js.undefined
}
object SchemaBooleanPropertyOptions {
  
  inline def apply(): SchemaBooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanPropertyOptions]
  }
  
  extension [Self <: SchemaBooleanPropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: SchemaBooleanOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
