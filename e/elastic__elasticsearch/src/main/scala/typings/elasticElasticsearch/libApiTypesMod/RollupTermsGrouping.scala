package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupTermsGrouping extends StObject {
  
  var fields: Fields
}
object RollupTermsGrouping {
  
  inline def apply(fields: Fields): RollupTermsGrouping = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupTermsGrouping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupTermsGrouping] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
