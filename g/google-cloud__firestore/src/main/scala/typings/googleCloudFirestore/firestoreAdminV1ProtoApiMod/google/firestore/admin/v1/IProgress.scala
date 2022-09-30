package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Progress. */
trait IProgress extends StObject {
  
  /** Progress completedWork */
  var completedWork: js.UndefOr[Double | String | Null] = js.undefined
  
  /** Progress estimatedWork */
  var estimatedWork: js.UndefOr[Double | String | Null] = js.undefined
}
object IProgress {
  
  inline def apply(): IProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgress]
  }
  
  extension [Self <: IProgress](x: Self) {
    
    inline def setCompletedWork(value: Double | String): Self = StObject.set(x, "completedWork", value.asInstanceOf[js.Any])
    
    inline def setCompletedWorkNull: Self = StObject.set(x, "completedWork", null)
    
    inline def setCompletedWorkUndefined: Self = StObject.set(x, "completedWork", js.undefined)
    
    inline def setEstimatedWork(value: Double | String): Self = StObject.set(x, "estimatedWork", value.asInstanceOf[js.Any])
    
    inline def setEstimatedWorkNull: Self = StObject.set(x, "estimatedWork", null)
    
    inline def setEstimatedWorkUndefined: Self = StObject.set(x, "estimatedWork", js.undefined)
  }
}
