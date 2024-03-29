package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStructureFindStructureTopHit extends StObject {
  
  var count: long
  
  var value: Any
}
object TextStructureFindStructureTopHit {
  
  inline def apply(count: long, value: Any): TextStructureFindStructureTopHit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStructureFindStructureTopHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStructureFindStructureTopHit] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
