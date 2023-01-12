package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.histogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingHistogramProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var `type`: histogram
}
object MappingHistogramProperty {
  
  inline def apply(): MappingHistogramProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("histogram")
    __obj.asInstanceOf[MappingHistogramProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingHistogramProperty] (val x: Self) extends AnyVal {
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setType(value: histogram): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
