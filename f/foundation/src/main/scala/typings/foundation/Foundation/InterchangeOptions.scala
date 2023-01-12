package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/interchange.html#custom-named-queries
trait InterchangeOptions extends StObject {
  
  var directives: js.UndefOr[js.Object] = js.undefined
  
  var load_attr: js.UndefOr[String] = js.undefined
  
  var named_queries: js.UndefOr[js.Object] = js.undefined
}
object InterchangeOptions {
  
  inline def apply(): InterchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterchangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterchangeOptions] (val x: Self) extends AnyVal {
    
    inline def setDirectives(value: js.Object): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setLoad_attr(value: String): Self = StObject.set(x, "load_attr", value.asInstanceOf[js.Any])
    
    inline def setLoad_attrUndefined: Self = StObject.set(x, "load_attr", js.undefined)
    
    inline def setNamed_queries(value: js.Object): Self = StObject.set(x, "named_queries", value.asInstanceOf[js.Any])
    
    inline def setNamed_queriesUndefined: Self = StObject.set(x, "named_queries", js.undefined)
  }
}
