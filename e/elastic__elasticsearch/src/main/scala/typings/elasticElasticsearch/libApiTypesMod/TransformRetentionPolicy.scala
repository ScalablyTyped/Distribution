package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformRetentionPolicy extends StObject {
  
  var field: Field
  
  var max_age: Duration
}
object TransformRetentionPolicy {
  
  inline def apply(field: Field, max_age: Duration): TransformRetentionPolicy = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], max_age = max_age.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformRetentionPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformRetentionPolicy] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMax_age(value: Duration): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
  }
}
