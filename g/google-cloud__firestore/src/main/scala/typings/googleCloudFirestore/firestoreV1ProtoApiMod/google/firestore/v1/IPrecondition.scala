package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Precondition. */
trait IPrecondition extends StObject {
  
  /** Precondition exists */
  var exists: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Precondition updateTime */
  var updateTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IPrecondition {
  
  inline def apply(): IPrecondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPrecondition]
  }
  
  extension [Self <: IPrecondition](x: Self) {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsNull: Self = StObject.set(x, "exists", null)
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setUpdateTime(value: ITimestamp): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
