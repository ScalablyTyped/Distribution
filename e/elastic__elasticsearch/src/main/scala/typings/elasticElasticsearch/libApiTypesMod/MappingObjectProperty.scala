package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingObjectProperty
  extends StObject
     with MappingCorePropertyBase
     with MappingProperty {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[`object`] = js.undefined
}
object MappingObjectProperty {
  
  inline def apply(): MappingObjectProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingObjectProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingObjectProperty] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
