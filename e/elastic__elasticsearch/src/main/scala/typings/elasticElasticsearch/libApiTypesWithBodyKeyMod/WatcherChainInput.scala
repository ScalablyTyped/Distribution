package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherChainInput extends StObject {
  
  var inputs: js.Array[Partial[Record[String, WatcherInputContainer]]]
}
object WatcherChainInput {
  
  inline def apply(inputs: js.Array[Partial[Record[String, WatcherInputContainer]]]): WatcherChainInput = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherChainInput]
  }
  
  extension [Self <: WatcherChainInput](x: Self) {
    
    inline def setInputs(value: js.Array[Partial[Record[String, WatcherInputContainer]]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: (Partial[Record[String, WatcherInputContainer]])*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
