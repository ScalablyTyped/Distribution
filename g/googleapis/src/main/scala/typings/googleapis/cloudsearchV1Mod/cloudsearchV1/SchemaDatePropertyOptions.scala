package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for date properties.
  */
trait SchemaDatePropertyOptions extends StObject {
  
  /**
    * If set, describes how the date should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDateOperatorOptions] = js.undefined
}
object SchemaDatePropertyOptions {
  
  inline def apply(): SchemaDatePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatePropertyOptions]
  }
  
  extension [Self <: SchemaDatePropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: SchemaDateOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
