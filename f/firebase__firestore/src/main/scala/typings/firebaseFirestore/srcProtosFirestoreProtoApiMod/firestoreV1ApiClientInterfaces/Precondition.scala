package typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precondition extends StObject {
  
  var exists: js.UndefOr[Boolean] = js.undefined
  
  var updateTime: js.UndefOr[Timestamp] = js.undefined
}
object Precondition {
  
  inline def apply(): Precondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precondition]
  }
  
  extension [Self <: Precondition](x: Self) {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setUpdateTime(value: Timestamp): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
