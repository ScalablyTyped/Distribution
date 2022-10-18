package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherChainInput extends StObject {
  
  var inputs: js.Array[WatcherInputContainer]
}
object WatcherChainInput {
  
  inline def apply(inputs: js.Array[WatcherInputContainer]): WatcherChainInput = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherChainInput]
  }
  
  extension [Self <: WatcherChainInput](x: Self) {
    
    inline def setInputs(value: js.Array[WatcherInputContainer]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: WatcherInputContainer*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
