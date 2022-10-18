package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageEqlFeaturesKeys extends StObject {
  
  var join_keys_five_or_more: uint
  
  var join_keys_four: uint
  
  var join_keys_one: uint
  
  var join_keys_three: uint
  
  var join_keys_two: uint
}
object XpackUsageEqlFeaturesKeys {
  
  inline def apply(
    join_keys_five_or_more: uint,
    join_keys_four: uint,
    join_keys_one: uint,
    join_keys_three: uint,
    join_keys_two: uint
  ): XpackUsageEqlFeaturesKeys = {
    val __obj = js.Dynamic.literal(join_keys_five_or_more = join_keys_five_or_more.asInstanceOf[js.Any], join_keys_four = join_keys_four.asInstanceOf[js.Any], join_keys_one = join_keys_one.asInstanceOf[js.Any], join_keys_three = join_keys_three.asInstanceOf[js.Any], join_keys_two = join_keys_two.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageEqlFeaturesKeys]
  }
  
  extension [Self <: XpackUsageEqlFeaturesKeys](x: Self) {
    
    inline def setJoin_keys_five_or_more(value: uint): Self = StObject.set(x, "join_keys_five_or_more", value.asInstanceOf[js.Any])
    
    inline def setJoin_keys_four(value: uint): Self = StObject.set(x, "join_keys_four", value.asInstanceOf[js.Any])
    
    inline def setJoin_keys_one(value: uint): Self = StObject.set(x, "join_keys_one", value.asInstanceOf[js.Any])
    
    inline def setJoin_keys_three(value: uint): Self = StObject.set(x, "join_keys_three", value.asInstanceOf[js.Any])
    
    inline def setJoin_keys_two(value: uint): Self = StObject.set(x, "join_keys_two", value.asInstanceOf[js.Any])
  }
}
