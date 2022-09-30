package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a WriteResult. */
trait IWriteResult extends StObject {
  
  /** WriteResult transformResults */
  var transformResults: js.UndefOr[js.Array[IValue] | Null] = js.undefined
  
  /** WriteResult updateTime */
  var updateTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IWriteResult {
  
  inline def apply(): IWriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriteResult]
  }
  
  extension [Self <: IWriteResult](x: Self) {
    
    inline def setTransformResults(value: js.Array[IValue]): Self = StObject.set(x, "transformResults", value.asInstanceOf[js.Any])
    
    inline def setTransformResultsNull: Self = StObject.set(x, "transformResults", null)
    
    inline def setTransformResultsUndefined: Self = StObject.set(x, "transformResults", js.undefined)
    
    inline def setTransformResultsVarargs(value: IValue*): Self = StObject.set(x, "transformResults", js.Array(value*))
    
    inline def setUpdateTime(value: ITimestamp): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
