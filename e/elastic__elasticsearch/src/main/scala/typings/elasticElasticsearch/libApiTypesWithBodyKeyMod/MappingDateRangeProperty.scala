package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.date_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDateRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var format: js.UndefOr[String] = js.undefined
  
  var `type`: date_range
}
object MappingDateRangeProperty {
  
  inline def apply(): MappingDateRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_range")
    __obj.asInstanceOf[MappingDateRangeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingDateRangeProperty] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: date_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
