package typings.firebaseStorage.distStorageMod

import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ trait FirebaseStorage extends StObject {
  
  /**
    * The {@link @firebase/app#FirebaseApp} associated with this `FirebaseStorage` instance.
    */
  val app: FirebaseApp
  
  /**
    * The maximum time to retry operations other than uploads or downloads in
    * milliseconds.
    */
  var maxOperationRetryTime: Double
  
  /**
    * The maximum time to retry uploads in milliseconds.
    */
  var maxUploadRetryTime: Double
}
object FirebaseStorage {
  
  inline def apply(app: FirebaseApp, maxOperationRetryTime: Double, maxUploadRetryTime: Double): FirebaseStorage = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxOperationRetryTime = maxOperationRetryTime.asInstanceOf[js.Any], maxUploadRetryTime = maxUploadRetryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseStorage]
  }
  
  extension [Self <: FirebaseStorage](x: Self) {
    
    inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setMaxOperationRetryTime(value: Double): Self = StObject.set(x, "maxOperationRetryTime", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadRetryTime(value: Double): Self = StObject.set(x, "maxUploadRetryTime", value.asInstanceOf[js.Any])
  }
}
