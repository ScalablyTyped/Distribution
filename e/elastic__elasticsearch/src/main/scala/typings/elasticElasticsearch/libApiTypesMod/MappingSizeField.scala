package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingSizeField extends StObject {
  
  var enabled: Boolean
}
object MappingSizeField {
  
  inline def apply(enabled: Boolean): MappingSizeField = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingSizeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingSizeField] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
