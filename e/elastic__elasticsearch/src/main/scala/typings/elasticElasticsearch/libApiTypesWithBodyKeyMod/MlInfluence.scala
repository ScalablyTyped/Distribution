package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfluence extends StObject {
  
  var influencer_field_name: String
  
  var influencer_field_values: js.Array[String]
}
object MlInfluence {
  
  inline def apply(influencer_field_name: String, influencer_field_values: js.Array[String]): MlInfluence = {
    val __obj = js.Dynamic.literal(influencer_field_name = influencer_field_name.asInstanceOf[js.Any], influencer_field_values = influencer_field_values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfluence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInfluence] (val x: Self) extends AnyVal {
    
    inline def setInfluencer_field_name(value: String): Self = StObject.set(x, "influencer_field_name", value.asInstanceOf[js.Any])
    
    inline def setInfluencer_field_values(value: js.Array[String]): Self = StObject.set(x, "influencer_field_values", value.asInstanceOf[js.Any])
    
    inline def setInfluencer_field_valuesVarargs(value: String*): Self = StObject.set(x, "influencer_field_values", js.Array(value*))
  }
}
