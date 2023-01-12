package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslFieldAndFormat extends StObject {
  
  var field: Field
  
  var format: js.UndefOr[String] = js.undefined
  
  var include_unmapped: js.UndefOr[Boolean] = js.undefined
}
object QueryDslFieldAndFormat {
  
  inline def apply(field: Field): QueryDslFieldAndFormat = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslFieldAndFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslFieldAndFormat] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInclude_unmapped(value: Boolean): Self = StObject.set(x, "include_unmapped", value.asInstanceOf[js.Any])
    
    inline def setInclude_unmappedUndefined: Self = StObject.set(x, "include_unmapped", js.undefined)
  }
}
