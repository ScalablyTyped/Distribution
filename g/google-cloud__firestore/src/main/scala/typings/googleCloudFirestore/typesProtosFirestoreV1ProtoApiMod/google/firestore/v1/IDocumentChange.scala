package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DocumentChange. */
trait IDocumentChange extends StObject {
  
  /** DocumentChange document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  
  /** DocumentChange removedTargetIds */
  var removedTargetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** DocumentChange targetIds */
  var targetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object IDocumentChange {
  
  inline def apply(): IDocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDocumentChange] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsNull: Self = StObject.set(x, "removedTargetIds", null)
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value*))
    
    inline def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsNull: Self = StObject.set(x, "targetIds", null)
    
    inline def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    inline def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
