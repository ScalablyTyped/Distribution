package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoublePropertyOptions extends StObject {
  
  /**
    * If set, describes how the double should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDoubleOperatorOptions] = js.undefined
}
object SchemaDoublePropertyOptions {
  
  inline def apply(): SchemaDoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoublePropertyOptions]
  }
  
  extension [Self <: SchemaDoublePropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: SchemaDoubleOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
