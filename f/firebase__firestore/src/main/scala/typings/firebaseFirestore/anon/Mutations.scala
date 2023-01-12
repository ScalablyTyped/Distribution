package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mutations extends StObject {
  
  var batchId: Double
  
  var mutations: js.Array[KeyDocumentKey]
}
object Mutations {
  
  inline def apply(batchId: Double, mutations: js.Array[KeyDocumentKey]): Mutations = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], mutations = mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mutations] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setMutations(value: js.Array[KeyDocumentKey]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsVarargs(value: KeyDocumentKey*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
