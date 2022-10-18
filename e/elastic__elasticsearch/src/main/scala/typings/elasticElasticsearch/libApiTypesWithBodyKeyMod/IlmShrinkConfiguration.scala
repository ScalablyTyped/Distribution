package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmShrinkConfiguration extends StObject {
  
  var number_of_shards: integer
}
object IlmShrinkConfiguration {
  
  inline def apply(number_of_shards: integer): IlmShrinkConfiguration = {
    val __obj = js.Dynamic.literal(number_of_shards = number_of_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmShrinkConfiguration]
  }
  
  extension [Self <: IlmShrinkConfiguration](x: Self) {
    
    inline def setNumber_of_shards(value: integer): Self = StObject.set(x, "number_of_shards", value.asInstanceOf[js.Any])
  }
}
