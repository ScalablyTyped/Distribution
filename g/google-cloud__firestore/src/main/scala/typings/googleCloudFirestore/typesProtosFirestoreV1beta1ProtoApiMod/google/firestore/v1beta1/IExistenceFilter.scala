package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExistenceFilter. */
trait IExistenceFilter extends StObject {
  
  /** ExistenceFilter count */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /** ExistenceFilter targetId */
  var targetId: js.UndefOr[Double | Null] = js.undefined
}
object IExistenceFilter {
  
  inline def apply(): IExistenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExistenceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExistenceFilter] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
