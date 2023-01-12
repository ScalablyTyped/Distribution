package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcCoreSyncEngineMod {
  
  trait SyncEngine extends StObject {
    
    var isPrimaryClient: Boolean
  }
  object SyncEngine {
    
    inline def apply(isPrimaryClient: Boolean): SyncEngine = {
      val __obj = js.Dynamic.literal(isPrimaryClient = isPrimaryClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncEngine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncEngine] (val x: Self) extends AnyVal {
      
      inline def setIsPrimaryClient(value: Boolean): Self = StObject.set(x, "isPrimaryClient", value.asInstanceOf[js.Any])
    }
  }
}
