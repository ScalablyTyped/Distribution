package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchId extends StObject {
  
  var batchId: Double
  
  var mutations: js.Array[Key]
}
object BatchId {
  
  inline def apply(batchId: Double, mutations: js.Array[Key]): BatchId = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], mutations = mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchId]
  }
  
  extension [Self <: BatchId](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setMutations(value: js.Array[Key]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsVarargs(value: Key*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
