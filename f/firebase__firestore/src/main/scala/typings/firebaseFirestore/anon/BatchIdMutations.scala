package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchIdMutations extends StObject {
  
  var batchId: Double
  
  var mutations: js.Array[`30`]
}
object BatchIdMutations {
  
  inline def apply(batchId: Double, mutations: js.Array[`30`]): BatchIdMutations = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], mutations = mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchIdMutations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchIdMutations] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setMutations(value: js.Array[`30`]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsVarargs(value: `30`*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
