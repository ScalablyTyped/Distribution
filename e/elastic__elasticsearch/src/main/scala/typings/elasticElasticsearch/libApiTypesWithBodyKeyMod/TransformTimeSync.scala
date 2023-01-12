package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformTimeSync extends StObject {
  
  var delay: js.UndefOr[Duration] = js.undefined
  
  var field: Field
}
object TransformTimeSync {
  
  inline def apply(field: Field): TransformTimeSync = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformTimeSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformTimeSync] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Duration): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
