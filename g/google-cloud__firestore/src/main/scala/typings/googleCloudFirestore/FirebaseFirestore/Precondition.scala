package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precondition extends StObject {
  
  /**
    * If set, the last update time to enforce.
    */
  val lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
}
object Precondition {
  
  inline def apply(): Precondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precondition]
  }
  
  extension [Self <: Precondition](x: Self) {
    
    inline def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
  }
}
