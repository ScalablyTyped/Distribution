package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherArrayCompareOpParams extends StObject {
  
  var quantifier: WatcherQuantifier
  
  var value: FieldValue
}
object WatcherArrayCompareOpParams {
  
  inline def apply(quantifier: WatcherQuantifier): WatcherArrayCompareOpParams = {
    val __obj = js.Dynamic.literal(quantifier = quantifier.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[WatcherArrayCompareOpParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherArrayCompareOpParams] (val x: Self) extends AnyVal {
    
    inline def setQuantifier(value: WatcherQuantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FieldValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
