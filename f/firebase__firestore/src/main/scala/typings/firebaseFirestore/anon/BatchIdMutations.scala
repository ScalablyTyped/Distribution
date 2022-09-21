package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchIdMutations extends StObject {
  
  var batchId: Double
  
  var mutations: js.Array[`22`]
}
object BatchIdMutations {
  
  inline def apply(batchId: Double, mutations: js.Array[`22`]): BatchIdMutations = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], mutations = mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchIdMutations]
  }
  
  extension [Self <: BatchIdMutations](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setMutations(value: js.Array[`22`]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsVarargs(value: `22`*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
