package typings.firebaseFirestore.distInternalMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distInternalMod.Timestamp2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precondition extends StObject {
  
  var exists: js.UndefOr[Boolean] = js.undefined
  
  var updateTime: js.UndefOr[Timestamp2] = js.undefined
}
object Precondition {
  
  inline def apply(): Precondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Precondition] (val x: Self) extends AnyVal {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setUpdateTime(value: Timestamp2): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
