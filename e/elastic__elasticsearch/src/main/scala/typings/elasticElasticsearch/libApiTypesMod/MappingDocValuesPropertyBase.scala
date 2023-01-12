package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDocValuesPropertyBase
  extends StObject
     with MappingCorePropertyBase {
  
  var doc_values: js.UndefOr[Boolean] = js.undefined
}
object MappingDocValuesPropertyBase {
  
  inline def apply(): MappingDocValuesPropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingDocValuesPropertyBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingDocValuesPropertyBase] (val x: Self) extends AnyVal {
    
    inline def setDoc_values(value: Boolean): Self = StObject.set(x, "doc_values", value.asInstanceOf[js.Any])
    
    inline def setDoc_valuesUndefined: Self = StObject.set(x, "doc_values", js.undefined)
  }
}
