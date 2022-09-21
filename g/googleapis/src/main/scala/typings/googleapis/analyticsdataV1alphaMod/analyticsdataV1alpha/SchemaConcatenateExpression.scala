package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConcatenateExpression extends StObject {
  
  /**
    * The delimiter placed between dimension names. Delimiters are often single characters such as "|" or "," but can be longer strings. If a dimension value contains the delimiter, both will be present in response with no distinction. For example if dimension 1 value = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the response will contain "US,FR,JP".
    */
  var delimiter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Names of dimensions. The names must refer back to names in the dimensions field of the request.
    */
  var dimensionNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaConcatenateExpression {
  
  inline def apply(): SchemaConcatenateExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConcatenateExpression]
  }
  
  extension [Self <: SchemaConcatenateExpression](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
    
    inline def setDimensionNamesNull: Self = StObject.set(x, "dimensionNames", null)
    
    inline def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
    
    inline def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value*))
  }
}
