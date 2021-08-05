package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to provide a search operator for double properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
trait SchemaDoubleOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to use the
    * double property in sorting or as a facet. The operator name can only
    * contain lowercase letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object SchemaDoubleOperatorOptions {
  
  inline def apply(): SchemaDoubleOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleOperatorOptions]
  }
  
  extension [Self <: SchemaDoubleOperatorOptions](x: Self) {
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
