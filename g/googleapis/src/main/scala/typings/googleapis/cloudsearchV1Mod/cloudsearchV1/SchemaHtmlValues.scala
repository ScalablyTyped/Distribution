package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of html values.
  */
trait SchemaHtmlValues extends StObject {
  
  /**
    * The maximum allowable length for html values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaHtmlValues {
  
  inline def apply(): SchemaHtmlValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlValues]
  }
  
  extension [Self <: SchemaHtmlValues](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
