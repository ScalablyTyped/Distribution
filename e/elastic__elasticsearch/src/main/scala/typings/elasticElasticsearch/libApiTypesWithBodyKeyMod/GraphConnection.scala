package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphConnection extends StObject {
  
  var doc_count: long
  
  var source: long
  
  var target: long
  
  var weight: double
}
object GraphConnection {
  
  inline def apply(doc_count: long, source: long, target: long, weight: double): GraphConnection = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphConnection] (val x: Self) extends AnyVal {
    
    inline def setDoc_count(value: long): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setSource(value: long): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: long): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
