package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslTermQuery
  extends StObject
     with QueryDslQueryBase {
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var value: FieldValue
}
object QueryDslTermQuery {
  
  inline def apply(): QueryDslTermQuery = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[QueryDslTermQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslTermQuery] (val x: Self) extends AnyVal {
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setValue(value: FieldValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
