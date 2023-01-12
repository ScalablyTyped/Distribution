package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchIdNumber extends StObject {
  
  var batchId: Double
  
  var mutations: js.Array[`45`]
}
object BatchIdNumber {
  
  inline def apply(batchId: Double, mutations: js.Array[`45`]): BatchIdNumber = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], mutations = mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchIdNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchIdNumber] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setMutations(value: js.Array[`45`]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsVarargs(value: `45`*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
