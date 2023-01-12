package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.percolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingPercolatorProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var `type`: percolator
}
object MappingPercolatorProperty {
  
  inline def apply(): MappingPercolatorProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("percolator")
    __obj.asInstanceOf[MappingPercolatorProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingPercolatorProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: percolator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
