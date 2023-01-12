package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageEqlFeatures extends StObject {
  
  var event: uint
  
  var join: uint
  
  var joins: XpackUsageEqlFeaturesJoin
  
  var keys: XpackUsageEqlFeaturesKeys
  
  var pipes: XpackUsageEqlFeaturesPipes
  
  var sequence: uint
  
  var sequences: XpackUsageEqlFeaturesSequences
}
object XpackUsageEqlFeatures {
  
  inline def apply(
    event: uint,
    join: uint,
    joins: XpackUsageEqlFeaturesJoin,
    keys: XpackUsageEqlFeaturesKeys,
    pipes: XpackUsageEqlFeaturesPipes,
    sequence: uint,
    sequences: XpackUsageEqlFeaturesSequences
  ): XpackUsageEqlFeatures = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], joins = joins.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageEqlFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageEqlFeatures] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: uint): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: uint): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoins(value: XpackUsageEqlFeaturesJoin): Self = StObject.set(x, "joins", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: XpackUsageEqlFeaturesKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setPipes(value: XpackUsageEqlFeaturesPipes): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: uint): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequences(value: XpackUsageEqlFeaturesSequences): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
  }
}
